package GivenAssignments.module2.Ass2;

public class ChracterPrinter {
    public static void main(String[] args) {
        for(int i =33; i<127; i++){
            System.out.println(String.format("%d\t%s",i, (char)i));
        }
    }
}
