package kr.pe.gracefulife.observer.girlfriend;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gracefulife on 2016-03-11.
 */
public class Woman implements Subject {
    private String name;
    private List<Observer> boyFriendList;

    public Woman(String name) {
        this.name = name;
        this.boyFriendList = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        boyFriendList.add(o);
    }

    @Override
    public void detach(Observer o) {
        if (boyFriendList.contains(o))
            boyFriendList.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("send : name = " + name);
        boyFriendList.forEach((boyFriend) -> boyFriend.update("ㅎㅎ "));
    }
}

