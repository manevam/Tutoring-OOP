package GivenAssignments.module1.firstAss;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        double randomNumber = random.nextDouble(0,100);
        int intRandomNumber = (int) randomNumber;

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("From 0..100, the computer picked %f\n", randomNumber));
        sb.append(String.format("Integer part of this number is %d\n", intRandomNumber));
        sb.append(String.format("Decimal part of this number is %f\n", randomNumber - intRandomNumber));
        sb.append(String.format("Character with code: %d is:%s\n", intRandomNumber, (char) intRandomNumber));

        System.out.println(sb.toString());
    }
}
