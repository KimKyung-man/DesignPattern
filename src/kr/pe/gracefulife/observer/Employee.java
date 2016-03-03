package kr.pe.gracefulife.observer;

/**
 * Created by Gracefulife on 2016-03-02.
 */
public class Employee {
    private String name;
    private String time;

    public Employee(String name, String time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return name + " 님이 센서에 감지되었습니다. / " + time;
    }
}
