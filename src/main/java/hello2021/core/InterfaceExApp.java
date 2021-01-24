package hello2021.core;

/**
 * 동물 추상 클래스
 */
abstract class Animal{
    private String name;
    private String leg;

    abstract void run();
}

/**
 * 탈 수 있는 (Ridable) 클래스
 */
interface Ridiable {
    void youCanRide(String riderName);
}

/**
 * 추상클래스를 상속 받고 인터페이스를 구현한 Horse 클래스
 */
class Horse extends Animal implements Ridiable{
    @Override
    public void ri
    @Override
    void run() {

    }

    @Override
    public void youCanRide(String riderName) {

    }
}


public class InterfaceExApp {
}
