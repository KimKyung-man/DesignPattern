package kr.pe.gracefulife.observer;

/**
 * Created by Gracefulife on 2016-03-02.
 */
public class Owner implements Observer {

    @Override
    public void update(Employee employee) {
        System.out.println(employee);
    }
}
