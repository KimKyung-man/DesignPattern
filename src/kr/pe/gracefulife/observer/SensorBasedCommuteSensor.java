package kr.pe.gracefulife.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gracefulife on 2016-03-02.
 */
public class SensorBasedCommuteSensor implements Subject {
    private List<Observer> observerList;
    private Employee lastCommuteEmployee;

    public SensorBasedCommuteSensor() {
        this.observerList = new ArrayList<>();
    }

    /* 해당 이벤트가 있을 때 옵저버들에게 통지하게됨 */
    public void catchMotion(Employee e) {
        this.lastCommuteEmployee = e;
        this.notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(lastCommuteEmployee));
    }
}
