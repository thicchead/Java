package be.pxl.h6;

public class DagApp {
    public static void main(String[] args) {
        Dag dag1 = Dag.MAANDAG;
        Dag dag2 = Dag.DINSDAG;
        Dag dag3 = Dag.WOENSDAG;
        Dag dag4 = Dag.DONDERDAG;
        Dag dag5 = Dag.VRIJDAG;
        Dag dag6 = Dag.ZATERDAG;
        Dag dag7 = Dag.ZONDAG;

        for (Dag dagen : Dag.values()) {
            System.out.println(dagen);
        }
        isWeekend(dag6);

        System.out.println(dag1.equals(dag2));
        System.out.println(dag1.ordinal());
        System.out.println(dag2.ordinal());
        System.out.println(dag5.ordinal() - dag2.ordinal());


    }
    private static void isWeekend(Dag dag) {
        if (dag == Dag.ZATERDAG || dag == Dag.ZONDAG) {
            System.out.println("Weekend");
        } else {
            System.out.println("Doordeweek");
        }
    }
}
