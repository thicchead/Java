package be.pxl.h1.opdracht13;

public class SalesPersonApp {
    public static void main(String[] args) {

        SalesPerson person1 = new SalesPerson();

        person1.setMonthlySale(1, 150);
        person1.setMonthlySale(2, 500);

        System.out.println(person1.getAverageSale());
        System.out.println(person1.getTotalSale());
    }
}
