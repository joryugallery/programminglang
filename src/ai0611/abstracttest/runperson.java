package ai0611.abstracttest;

public class runperson {
    public static void main(String[] args) {
        // 추상(abstract) 클래스는 new 연산자로 객체 생성이 불가능하다.
        // Person person = new Person();
        man men = new man();
        men.name = "김폴리";
        men.weight = 70;
        men.height = 180;

        WOMEN women = new WOMEN();
        women.name = "박인순";
        women.weight = 48;
        women.height = 170;

        men.eat("김치찌개");
    }
}
