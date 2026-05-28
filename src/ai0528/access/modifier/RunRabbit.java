package ai0528.access.modifier;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit =new Rabbit();

        rabbit.shape = "삼각형";
        rabbit.printInfo();
        rabbit.setLocation(50,50);
        rabbit.printInfo();
    }
}
