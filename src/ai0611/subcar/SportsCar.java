package ai0611.subcar;

import ai0611.Car;

public class SportsCar extends Car {
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if(this.speed >= 200){
            this.speed = 200;
        }
    }
}
