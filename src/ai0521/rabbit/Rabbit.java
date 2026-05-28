package ai0521.rabbit;

public class Rabbit {
    private String shape;
    private int xPos;
    private int yPos;

    //JVM은 클래스 내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
    //그러나 클래스 내에 생성자가 선언되어있다면 선언된 생성자만 사용할 수 있다.

    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    //토끼의 좌표 값을 설정하는 메소드 구현

    public void setLocation(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    //Call by Reference(객체 주소값)
    public void printInfo(){
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고있다.\n", shape,xPos,yPos);

    }

    //x축으로 10씩 오른쪽으로 이동하는 메소드
    public void plusx(){
        this.xPos = xPos+10;
    }

    //x축으로 10씩 왼쪽으로 이동하는 메소드
    public void minusx(){
        this.xPos = xPos-10;
    }
}
