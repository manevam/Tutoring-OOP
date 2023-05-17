package Exercises.firstModule.Krug;

public class Krug {
    float radius;
    final float PI = (float) 3.14;

    public Krug(float radius) {
        this.radius = radius;
    }

    public float perimetar(){
        return PI*2*radius;
    }

    public float plostina(){
        return (float) (Math.pow(radius,2)*PI);
    }

    public int ednakvi(){
        if((PI*2*radius)==Math.pow(radius,2)*PI)
            return 1;
        else
            return 0;
    }
}
