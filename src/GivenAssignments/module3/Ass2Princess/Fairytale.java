package GivenAssignments.module3.Ass2Princess;

import java.util.Comparator;

public class Fairytale {
    public static void main(String[] args) {
        Princess snowWhite = new Princess("Snow White");
        Dwarfs dwarfs = new Dwarfs();
        int shortestNameIndex = -1;
        int longestNameIndex = -1;
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String longestName = "";
        String shortestName = "";

        dwarfs.dwarfs.add(new Dwarf("Bashful"));
        dwarfs.dwarfs.add(new Dwarf("Doc"));
        dwarfs.dwarfs.add(new Dwarf("Dopey"));
        dwarfs.dwarfs.add(new Dwarf("Grumpy"));
        dwarfs.dwarfs.add(new Dwarf("Happy"));
        dwarfs.dwarfs.add(new Dwarf("Sleepy"));
        dwarfs.dwarfs.add(new Dwarf("Sneezy"));
        //dwarfs.dwarfs.sort(Comparator.comparing(p -> p.getName().length()));

        for (int i = 0; i < dwarfs.dwarfs.size(); i++) {
            Dwarf d = dwarfs.dwarfs.get(i);
            int nameLength = d.getName().length();

            if (nameLength < shortestLength) {
                shortestLength = nameLength;
                shortestNameIndex = i;
                shortestName = d.name;
            }

            if (nameLength > longestLength) {
                longestLength = nameLength;
                longestNameIndex = i;
                longestName = d.name;
            }
        }

        System.out.println(snowWhite.name);
        dwarfs.dwarfs.stream().forEach(d -> System.out.println(d.toString()));
        System.out.println(String.format("Dwarf with longest name: %s, index: %d",
                longestName, longestNameIndex));
        System.out.println(String.format("Dwarf with shortest name: %s, index: %d",
                shortestName, shortestNameIndex));
    }
}
