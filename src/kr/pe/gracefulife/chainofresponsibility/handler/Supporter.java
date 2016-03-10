package kr.pe.gracefulife.chainofresponsibility.handler;

import kr.pe.gracefulife.chainofresponsibility.Trouble;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public abstract class Supporter {
    private String name;
    private Supporter nextItem;

    public Supporter(String name) {
        this.name = name;
    }

    public Supporter setNextItem(Supporter nextItem) {
        this.nextItem = nextItem;
        return nextItem;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            this.done(trouble);
        } else if (nextItem != null) {
            nextItem.support(trouble);
        } else {
            this.fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " 문제가 " + this + " 에 의해 해결됨.");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " 문제를 해결할 수 없었음");
    }

    @Override
    public String toString() {
        return "Supporter{" +
                "name='" + name + '\'' +
                '}';
    }
}



