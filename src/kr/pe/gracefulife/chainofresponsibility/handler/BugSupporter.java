package kr.pe.gracefulife.chainofresponsibility.handler;

import kr.pe.gracefulife.chainofresponsibility.Trouble;

/**
 * Bug = 소프트웨어를 바라지 않던 방향으로 수행하게 하거나, 바라던대로 수행하지 않도록 하는 것
 * Created by Gracefulife on 2016-02-14.
 */
public class BugSupporter extends Supporter {

    public BugSupporter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return Trouble.CODE_BUG.equals(trouble.getTroubleCode());
    }
}
