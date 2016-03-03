package kr.pe.gracefulife.observer;

/**
 * Created by Gracefulife on 2016-03-02.
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
