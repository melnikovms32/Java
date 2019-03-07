package by.gsu.mslab;

public class BusinessTrip {

    private static final int DAILY_ALLOWANCE_RATE = 1000;
    private String employeesAccount;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {
    }

    public BusinessTrip(String employeesAccount, int transportationExpenses, int numberOfDays) {
        this.employeesAccount = employeesAccount;
        this.transportationExpenses = transportationExpenses;
        this.numberOfDays = numberOfDays;
    }

    public String getEmployeesAccount() {

        return employeesAccount;
    }

    public void setEmployeesAccount (String employeesAccount) {

        this.employeesAccount = employeesAccount;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransporationExpenses(int transporationExpenses) {
        this.transportationExpenses = transporationExpenses;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTotal() {
        return transportationExpenses + DAILY_ALLOWANCE_RATE * numberOfDays;
    }

    public static String convertation(int penny) {
        int remainder = penny%100;
        int tenths = remainder/10;
        int hundreds = remainder - tenths*10;
        return (penny/100) + "." + tenths + hundreds;
    }

    public String show() {
        return "rate = " + convertation(DAILY_ALLOWANCE_RATE) +
                "\n" + "account = " + employeesAccount +
                "\n" + "transport = " + convertation(transportationExpenses) +
                "\n" + "days = " + numberOfDays +
                "\n" + "total = " + convertation(getTotal());
    }

    @Override

    public String toString() {
        return employeesAccount + ";" +
                convertation(transportationExpenses) + ";" +
                numberOfDays + ";" +
                convertation(getTotal());
    }
}


