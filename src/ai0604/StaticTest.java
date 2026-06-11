package ai0604;

public class StaticTest {
    static void main(String[] args) {
        System.out.println("Count 클래스 변수(공유)의 초깃값: " + Rabbit.count);

        Rabbit r1 = new Rabbit();
        System.out.println("Count 클래스 변수(공유)의 값: " + r1.count);

        Rabbit r2 = new Rabbit();
        System.out.println("Count 클래스 변수(공유)의 값: " + r2.count);

    }
}
