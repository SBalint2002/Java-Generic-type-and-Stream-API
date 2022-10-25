package hu.petrik;

import hu.petrik.Feladatok.Buszok;
import hu.petrik.Feladatok.SzobaKerekpar;
import hu.petrik.Halmaz.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intSet = new Set<>();

        intSet.add(3);
        intSet.add(6);
        intSet.add(8);
        intSet.add(4);
        intSet.add(3);

        System.out.println("Méret: " + intSet.getSize());
        System.out.println(intSet);

        intSet.remove(8);
        System.out.println(intSet);

        SzobaKerekpar.Run();

        Buszok.Run();
    }
}
