package ai0618;

public class Tank implements Car, Cannon{
    @Override
    public void move() {
        System.out.println("탱크가 이동한다");
    }

    @Override
    public void fire() {
        System.out.println("대포 발사");
    }
}

