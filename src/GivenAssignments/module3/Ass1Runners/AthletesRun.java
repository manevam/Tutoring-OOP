package GivenAssignments.module3.Ass1Runners;

import java.util.ArrayList;
import java.util.List;

public class AthletesRun {
    public static void main(String[] args) {
        Athletic bolt = new Athletic(" Usein Bolt");
        Athletic johnson = new Athletic("Johnson");
        bolt.run(200);
        johnson.run(200);

        if(bolt.time < johnson.time)
            System.out.printf("Winner of the race of 200 m. is %s, Time: %f\n",
                    bolt.name, bolt.time);
        else
            System.out.printf("Winner of the race of 200 m. is %s, Time %f\n",
                    johnson.name, johnson.time);

        System.out.printf("Johnson: %f, Bolt: %f\n", johnson.time, bolt.time);

        List<Athletic> AmericanRunners = new ArrayList<>();
        AmericanRunners.add(new Athletic("Barton"));
        AmericanRunners.get(0).run(100);
        AmericanRunners.add(new Athletic("Montgomeri"));
        AmericanRunners.get(1).run(100);
        AmericanRunners.add(new Athletic("Edvarts"));
        AmericanRunners.get(2).run(100);
        AmericanRunners.add(new Athletic("Jonson"));
        AmericanRunners.get(3).run(100);

        List<Athletic> RussianRunners = new ArrayList<>();
        RussianRunners.add(new Athletic("Popov"));
        RussianRunners.get(0).run(100);
        RussianRunners.add(new Athletic("Sergeev"));
        RussianRunners.get(1).run(100);
        RussianRunners.add(new Athletic("Aleksov"));
        RussianRunners.get(2).run(100);
        RussianRunners.add(new Athletic("Medvedev"));
        RussianRunners.get(3).run(100);

        StringBuilder sb = new StringBuilder();
        sb.append("Winner of the race 4*100 m. is ");

        if(sumTime(AmericanRunners) < sumTime(RussianRunners)){
            sb.append(String.format("America with time of %f\n", sumTime(AmericanRunners)));
            sb.append("For USA there were:\n");
            AmericanRunners.stream().forEach(r -> sb.append(r.name + "\n"));
        } else{
            sb.append(String.format("Russia with time of %f\n", sumTime(RussianRunners)));
            sb.append("For Russia there were:\n");
            RussianRunners.stream().forEach(r -> sb.append(r.name + "\n"));
        }

        System.out.println(sb.toString());
        System.out.printf("America: %f, Russia: %f", sumTime(AmericanRunners),
                sumTime(RussianRunners));
    }

    public static double sumTime(List<Athletic> runners){
        return runners.stream().mapToDouble(r -> r.time).sum();
    }

}
