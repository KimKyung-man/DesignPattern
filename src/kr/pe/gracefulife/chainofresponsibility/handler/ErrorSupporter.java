package kr.pe.gracefulife.chainofresponsibility.handler;

import kr.pe.gracefulife.chainofresponsibility.Trouble;

/**
 * Error = 계산된, 관찰된, 측정된 값 또는 조건과 참인, 명시된, 이론적으로 옳은 값 또는 조건과 다름.
 * Created by Gracefulife on 2016-02-14.
 */
public class ErrorSupporter extends Supporter {

    public ErrorSupporter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return Trouble.CODE_ERROR.equals(trouble.getTroubleCode());
    }
}
