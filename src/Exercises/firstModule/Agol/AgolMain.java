package Exercises.firstModule.Agol;

import java.util.Scanner;

public class AgolMain {
    public static void main(String[] args) {
        int deg, min, sec;
        Scanner scanner = new Scanner(System.in);
        Agol a1 = new Agol();

        deg = scanner.nextInt();
        min = scanner.nextInt();
        sec = scanner.nextInt();

        if (checkIfValid(deg, min, sec)) {

            a1.setDeg(deg);
            a1.setMin(min);
            a1.setSec(sec);
            System.out.println(a1.calculateSec());
        }
        else {
            System.out.println("Nevalidni vrednosti za agol");
        }


    }

    public static boolean checkIfValid(int deg, int min, int sec){
        if(deg <0 || min<0 || sec<0)
            return false;
        if(deg>360 || min>360 || sec>360)
            return false;

        return true;
    }
}








