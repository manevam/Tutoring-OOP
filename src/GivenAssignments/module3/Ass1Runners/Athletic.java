package GivenAssignments.module3.Ass1Runners;

public class Athletic implements Comparable<Athletic> {
    String name;
    float time;

    public Athletic(String name) {
        this.name = name;
    }

    public void run(int meters){
        time = (float) Math.random()*meters;
    }

    public float getTime() {
        return time;
    }

    @Override
    public int compareTo(Athletic o) {
        if(o.time > this.time)
            return 1;
        else
            return 0;
    }
}
