package ai0604.inheritance;

public class HouseRabbit extends Rabbit {
    String masterName;

    public void eatFeed(String feedname){
        System.out.println("집토끼가" + masterName + "주인이 주는 " + feedname + "사료를 먹는다");
    }
}
