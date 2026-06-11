package ai0611.subcar;

import ai0611.Car;

public class Schoolbus extends Car {
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 60){
            this.speed = 60;
        }
    }
}
