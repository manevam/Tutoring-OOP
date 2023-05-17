package GivenAssignments.secondModule.Ass3;

import java.util.Random;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Random random = new Random();
        while(true){
            int randomNumber = random.nextInt(0,1000);
            System.out.println(randomNumber);
            if(checkPrime(randomNumber)) {
                break;
            }

        }
    }

    public static boolean checkPrime(int number){
        if(number == 1)
            return false; //1 is not a primer number by definition

        for(int i =2; i<= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
