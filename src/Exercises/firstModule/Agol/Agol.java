package Exercises.firstModule.Agol;

public class Agol {
    int deg, min, sec;

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int calculateSec(){
        return (((deg*60)+min)*60)+sec;
    }
}
