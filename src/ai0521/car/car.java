package ai0521.car;

public class car {
    private String product;
    private String name;
    private int displacement;
    private String color;
    private int price;

    //생성자: 객체를 생성할 때 사용
    //생성자의 역할 : 객체가 생성될 때 필드의 값을 초기화
    //기본생성자(default constructor) : 객체만 생성하고 필드의 값을 초기화시키지 않는다.


    public car() {
    }

    public car(String product, String name, int displacement, String color, int price) {
        this.product = product;
        this.name = name;
        this.displacement = displacement;
        this.color = color;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Car의 기능에 해당하는 메소드
    public void startOn(String name){
        System.out.println(name + "자동차 시동을 건다.");
    }

    public void startOff(String name){
        System.out.println(name + "자동차 시동을 끈다.");
    }

    public void drive(){
        System.out.println(name + "자동차가 주행한다.");
    }

    public void stop(){
        System.out.println(name + "자동차가 멈춘다.");
    }

    public void forward(){
        System.out.println("자동차가 전진한다.");
    }

    public void backward(){
        System.out.println(name + "자동차가 후진한다.");
    }

    public void rotate(String direction){
        System.out.println(name + "자동차가" + direction + "한다.");
    }
}
