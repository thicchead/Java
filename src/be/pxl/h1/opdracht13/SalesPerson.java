package be.pxl.h1.opdracht13;

public class SalesPerson {
    private String name;
    private double[] monthlySales = new double[12];

    public void setMonthlySale(int month, double money) {
        monthlySales[month] = money;
    }

    public double getAverageSale() {
        double total = 0;

        for (double n : this.monthlySales) {
            total += n;
        }
        return total / 12;
    }

    public double getTotalSale() {
        double total = 0;

        for (double n : monthlySales) {
            total += n;
        }
        return total;
    }
}
