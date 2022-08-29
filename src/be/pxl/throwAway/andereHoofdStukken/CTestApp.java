package be.pxl.throwAway.andereHoofdStukken;

public class CTestApp {
    public static void main(String[] args) {

        ConstructorTests firstOne = new ConstructorTests();
        ConstructorTests secondOne = new ConstructorTests("Metehan", "Karakoruk");
        ConstructorTests thirdOne = new ConstructorTests("Metje", "Kara", 35);

        System.out.println(firstOne.readEverything());
        System.out.println(secondOne.readEverything());
        System.out.println(thirdOne.readEverything());

    }
}
