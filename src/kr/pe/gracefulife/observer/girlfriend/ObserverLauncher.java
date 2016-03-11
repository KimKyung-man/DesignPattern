package kr.pe.gracefulife.observer.girlfriend;

import kr.pe.gracefulife.Starter;

/**
 * Created by Gracefulife on 2016-02-14.
 */
public class ObserverLauncher implements Starter {

    public void start() {
//        executeBeautifulCoupleCase();
//        executeSadCoupleCase();
        executeWorstCoupleCase();
    }

    public void executeBeautifulCoupleCase() {
        Observer man = new Man("Sehoon");
        Subject woman = new Woman("Hye....");
        /* registerObserver */
        woman.attach(man);

        /* 여자가 구독중인 옵저버들에게 메세지를 전송 */
        /* 이 케이스에서는 옵저버가 Sehoon 씨 밖에 없음 */
        woman.notifyObservers();
    }

    /* 옵저버 패턴의 슬픈 전설.... */
    public void executeSadCoupleCase() {
        Observer man = new Man("Jinhyun");
        Subject woman = new Woman("Yoo....");

        Observer newMan = new Man("who ?");
        /* registerObserver */
        woman.attach(man);

        /* 여자가 구독중인 옵저버들(남자친구)에게 메세지를 전송 */
        /* 당시의 남자친구인 .. Jinhyun 객체에게 메세지를 보내게 된다. */
        woman.notifyObservers();

        /* 서로 매우 화난 나머지 그들은 슬프게도 결별했다고 한다.. */
        woman.detach(man);

        /* 긴 시간이 지나 .. */
        try {
            Thread.sleep(1000);
            /* 새로운 남자친구를 만든 Yoo 모씨.. */
            woman.attach(newMan);
            woman.notifyObservers();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void executeWorstCoupleCase() {
        Observer man = new Man("Jinhyun");
        Subject woman = new Woman("Yoo....");
        Observer newMan = new Man("who ?");
        /* registerObservers */
        woman.attach(man);
        woman.attach(newMan);

        /* 여자가 구독중인 옵저버들(남자친구)에게 메세지를 전송 */
        /* 두 남자 객체에게 메세지를 보내게 된다. */
        woman.notifyObservers();
    }
}
