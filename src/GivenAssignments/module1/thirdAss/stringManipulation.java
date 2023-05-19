package GivenAssignments.module1.thirdAss;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String workingString = scanner.nextLine();

        StringInfo s = new StringInfo(workingString);
        System.out.println(s.toString());
    }
}
