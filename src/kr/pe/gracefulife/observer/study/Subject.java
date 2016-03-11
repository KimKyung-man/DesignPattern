package kr.pe.gracefulife.observer.study;

import kr.pe.gracefulife.observer.study.Observer;

/**
 * Created by Gracefulife on 2016-03-02.
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
