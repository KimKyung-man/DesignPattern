package kr.pe.gracefulife.observer;

import kr.pe.gracefulife.Starter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public class ObserverLauncher implements Starter {

    public void start() {
        SensorBasedCommuteSensor sensor = new SensorBasedCommuteSensor();
        sensor.attach(new Owner());

        List<Employee> list = generateDefaultEmployeeList();

        list.forEach(sensor::catchMotion);
    }

    public List<Employee> generateDefaultEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("수지", "오전 9시 00분"));
        list.add(new Employee("하니", "오전 9시 30분"));
        list.add(new Employee("태연", "오전 9시 40분"));
        list.add(new Employee("Kim", "오전 10시 30분"));

        return list;
    }
}
