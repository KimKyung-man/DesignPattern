package kr.pe.gracefulife;

import kr.pe.gracefulife.chainofresponsibility.ChainOfResponsibilityLauncher;
import kr.pe.gracefulife.observer.girlfriend.ObserverLauncher;
import kr.pe.gracefulife.proxy.ProxyLauncher;

public class Launcher {

    public static void main(String[] args) {
//        new ChainOfResponsibilityLauncher().start();
        new ObserverLauncher().start();
//        new ProxyLauncher().start();
    }
}
