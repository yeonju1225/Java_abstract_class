package abstractex;

//추상 메서드가 속한 클래스는 같이 추상 클래스가 된다.
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
