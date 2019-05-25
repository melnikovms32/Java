package by.gsu.mslab;

import java.util.Scanner;

public class Purchase {
    private String name;
    private Byn price;
    private int number;

    public Purchase() {

    }

    public Purchase(String name, Byn price, int number) {
        this.name = name;
        this.price = new Byn(price);
        this.number = number;
    }

    public Purchase(Scanner scanner) {
        this(scanner.next(), new Byn(scanner.nextInt()), scanner.nextInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byn getPrice() {
        return price;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Byn getCost() {
        Byn cost = new Byn(price);
        return cost.mul(number);
    }

    protected String fieldsToString() {
        return name + ";" +
                price + ";" +
                number;
    }

    @Override
    public String toString() {
        return fieldsToString() + ";" +
                getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Purchase)) {
            return false;
        }

        Purchase other = (Purchase) o;
        if (name == null) {
            if (other.name != null) {
                return false;
            }

        } else if (!name.equals(other.name)) {
            return false;
        }

        if (price == null) {
            if (other.price != null) {
                return false;
            }
        } else if (!price.equals(other.price)) {
            return false;
        }
        return true;
    }

}