package GivenAssignments.module3.Ass2Princess;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dwarfs {
    List<Dwarf> dwarfs;
    int shortestNameIndex = -1;
    int longestNameIndex = -1;
    int shortestLength = Integer.MAX_VALUE;
    int longestLength = Integer.MIN_VALUE;

    public Dwarfs() {
        dwarfs = new ArrayList<>();
    }

//    public String longestNameDwarf(){
//        for (int i = 0; i < dwarfs.size(); i++) {
//            Dwarf d = dwarfs.get(i);
//            int nameLength = d.getName().length();
//
//            if (nameLength < shortestLength) {
//                shortestLength = nameLength;
//                shortestNameIndex = i;
//            }
//
//            if (nameLength > longestLength) {
//                longestLength = nameLength;
//                longestNameIndex = i;
//            }
//        }
//        return String.format("Name: %s, index: %d", longestName, position);
//    }
}
