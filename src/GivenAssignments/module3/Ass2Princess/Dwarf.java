package GivenAssignments.module3.Ass2Princess;

public class Dwarf implements Comparable<Dwarf> {
    String name;

    public Dwarf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
       return String.format("The name of this dwarf is %s", name);
    }

    @Override
    public int compareTo(Dwarf o) {
        if(o.getName().length() > this.getName().length())
            return 1;
        else
            return -1;
    }
}
