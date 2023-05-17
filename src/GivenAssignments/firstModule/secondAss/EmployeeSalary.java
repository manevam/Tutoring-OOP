package GivenAssignments.firstModule.secondAss;

public class EmployeeSalary {
    String name;
    int totalSalary;

    public EmployeeSalary(String name, int totalSalary) {
        this.name = name;
        this.totalSalary = totalSalary;
    }

    public double getStateTaxes(){
        return (28.4 * totalSalary) / 100;
    }
    public double getPersonalTaxes(){
        if(totalSalary - getStateTaxes() - 7000 > 0)
            return (10 * (totalSalary - getStateTaxes() - 7000)) / 100;

        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The employee: %s with Gross salary of: %d MKD, will get NET salary %d MKD.\n",
                name, totalSalary, Math.round( totalSalary - getStateTaxes() - getPersonalTaxes())));
        sb.append(String.format("States taxes are: %d MKD.\n", Math.round(getStateTaxes())));
        sb.append(String.format("Personal tax is: %d MKD.", Math.round( getPersonalTaxes())));

        return sb.toString();
    }
}
