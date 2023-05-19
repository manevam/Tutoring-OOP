package GivenAssignments.module1.thirdAss;

public class StringInfo {

    String workingString;

    public StringInfo(String workingString) {
        this.workingString = workingString.trim();
    }

    private char getFirstCharacter(){
        return workingString.charAt(0);
    }

    private char getLastCharacter(){
        return workingString.charAt(workingString.length()-1);
    }

    private char getMiddleCharacter(){
        return workingString.charAt((int)workingString.length()/2);
    }

    private int sumOfCharacters(){
        return (int) getFirstCharacter() + (int) getMiddleCharacter()
                + (int) getLastCharacter();
    }

    private String getBiggestCharacter(){
        char biggestChar = getFirstCharacter();
        int codeOfChar = (int) getFirstCharacter();

        if(codeOfChar < (int) getLastCharacter()){
            biggestChar = getLastCharacter();
            codeOfChar = (int) getLastCharacter();
        }
        if(codeOfChar < (int) getMiddleCharacter()){
            biggestChar = getMiddleCharacter();
            codeOfChar = (int) getMiddleCharacter();
        }
        return String.format("The biggest character of these three is: %s with code of %d\n",
                biggestChar, codeOfChar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("My string is: %s\n", workingString));
        sb.append(String.format("Its first character is %s\n", getFirstCharacter()));
        sb.append(String.format("Its last character is %s\n",getLastCharacter()));
        sb.append(String.format("Its middle character is %s\n", getMiddleCharacter()));
        sb.append(String.format("The sum of characters is %d\n", sumOfCharacters()));
        sb.append(getBiggestCharacter());

        return sb.toString();
    }
}
