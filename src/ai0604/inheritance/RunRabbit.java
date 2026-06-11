package ai0604.inheritance;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit  hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setLocation(30,50);
        hr1.printInfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("사료");

        MountainRabbit mr1 = new MountainRabbit();
        mr1.mountainName = "남산";
        mr1.eatGrass("풀");


    }
}
