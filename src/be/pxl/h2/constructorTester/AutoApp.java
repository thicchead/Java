package be.pxl.h2.constructorTester;

public class AutoApp {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.setMerk("Audi");
        auto.setKleur("Zwart");

        Auto mijnAuto = new Auto("Mercedes", "Zwart", 5);

        System.out.println(mijnAuto.getMerk());
        System.out.println(mijnAuto.getKleur());

        Auto kmAuto = new Auto("Audi", "grijs", 3, 40000);

        System.out.println(kmAuto.getKilometerstand());

        Auto copyCar = new Auto(mijnAuto);

        System.out.println(copyCar.getMerk());

        System.out.println(Auto.AANTAL_WIELEN);

    }
}
