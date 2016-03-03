package kr.pe.gracefulife.chainofresponsibility.handler;

import kr.pe.gracefulife.chainofresponsibility.Trouble;

/**
 * Fault = 시스템 혹은 컴포넌트가 요구되는 기능을 명시된 성능 요구사항 내에서 수행할 수 없는 상태
 * Created by Gracefulife on 2016-02-14.
 */
public class FaultSupporter extends Supporter {

    public FaultSupporter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return Trouble.CODE_FAULT.equals(trouble.getTroubleCode());
    }
}
