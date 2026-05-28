package ai0521.rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("좁은 네모");

        rabbit1.setLocation(50,50);
        rabbit2.setLocation(150,70);

        rabbit1.setShape("기본");
        rabbit1.printInfo();
        rabbit2.printInfo();

        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고있다.\n", rabbit1.getShape(),rabbit1.getxPos(),rabbit1.getyPos() );
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고있다.\n", rabbit2.getShape(),rabbit2.getxPos(),rabbit2.getyPos());


        //기본 모양의 토기를 다이아몬드 모양의 토끼로 변경, 위치는 현재 x좌표에서 오른쪽으로 60 이동하게, y좌표쪽으로는 아래쪽으로 20 이동한 후 출력
        rabbit1.setShape("다이아몬드");

        rabbit1.setLocation(110,30);
        rabbit1.plusx();
        rabbit1.plusx();
        rabbit1.minusx();
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고있다.\n", rabbit1.getShape(),rabbit1.getxPos(),rabbit1.getyPos());

        rabbit2.printInfo();
        for (int i = 0; i < 5; i++) {
            rabbit2.plusx();
        }



    }
}
