package Exercises.firstModule.Krug;

import java.util.Scanner;

public class KrugMain {
    public static void main(String[] args) {
        float r;
        Scanner s = new Scanner(System.in);
        r = s.nextInt();
        Krug k = new Krug(r);

        System.out.println(String.format("%.1f", k.perimetar()));
        System.out.println(k.plostina());
        System.out.println(k.ednakvi());
    }
}
