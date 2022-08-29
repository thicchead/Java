package be.pxl.h1.opdracht10;

public class BankAccount {
    private String name;
    private String code;
    private int controlDigits;
    private long number;
    private float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getControlDigits() {
        return controlDigits;
    }

    public void setControlDigits(int controlDigits) {
        this.controlDigits = controlDigits;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAccount() {
        return code + controlDigits + number;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isValid() {
        long checkingNumber = 98 - ((number * 1000000) + 111400) % 97;

        return checkingNumber == controlDigits;

    }

    public float withdraw(double amount) {
        if (this.amount - amount < 0) {
            System.out.println("Broke");
        } else {
            this.amount -= amount;
        }
        return this.amount;
    }
}
