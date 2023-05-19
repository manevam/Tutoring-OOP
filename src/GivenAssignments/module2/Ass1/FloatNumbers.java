package GivenAssignments.module2.Ass1;

import java.util.ArrayList;
import java.util.List;

public class FloatNumbers {
    List<Float> FloatNumbers;

    public FloatNumbers() {
        FloatNumbers = new ArrayList<>();
    }

    public void addNumber(float no){
        FloatNumbers.add(no);
    }

    public float sum(){
        return (float) FloatNumbers.stream().mapToDouble(n -> n).sum();
    }

    public float average(){
        return sum() / FloatNumbers.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("**** Floating point numbers are");
        FloatNumbers.forEach(number -> sb.append("\n" + number));
        sb.append(String.format("\n**** SUM =%f\n", sum()));
        sb.append(String.format("**** AVERAGE =%f\n", average()));

        return sb.toString();
    }
}
