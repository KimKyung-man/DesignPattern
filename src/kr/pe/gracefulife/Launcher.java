package kr.pe.gracefulife;

import kr.pe.gracefulife.observer.ObserverLauncher;

public class Launcher {

    public static void main(String[] args) {
//        Starter starter = new ChainOfResponsibilityLauncher();
        Starter starter = new ObserverLauncher();
        starter.start();
    }
}
