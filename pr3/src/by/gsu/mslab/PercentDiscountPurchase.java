package by.gsu.mslab;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase{
    private double discount;
    protected final static int KOL = 15;

    public PercentDiscountPurchase() {

    }

    public PercentDiscountPurchase(String name, Byn price, int number, double discount ) {
        super(name, price, number);
        this.discount = discount;
    }

    public PercentDiscountPurchase(Scanner scanner) {
        super(scanner);
        this.discount = scanner.nextDouble();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Byn getCost() {
        double x = 1 - discount / 100;
        Byn cost = super.getCost();
        if(getNumber() >= KOL) {
            cost.mul(x, RoundMethod.ROUND, 0);
        }
        return cost;
    }

    @Override
    public String fieldsToString() {
        return super.fieldsToString() + ";" +
                discount;
    }

}
