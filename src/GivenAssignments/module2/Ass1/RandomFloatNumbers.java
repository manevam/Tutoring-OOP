package GivenAssignments.module2.Ass1;

import java.util.Random;

public class RandomFloatNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        FloatNumbers numbers = new FloatNumbers();
        for (int i =0; i<15; i++){
            float randomNumber = random.nextFloat(0,100);
            numbers.addNumber(randomNumber);
        }

        System.out.println(numbers.toString());
    }
}
