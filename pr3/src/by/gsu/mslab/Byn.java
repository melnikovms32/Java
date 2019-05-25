package by.gsu.mslab;

public class Byn implements Comparable<Byn> {
    private int numCoins;

    public Byn() {
    }

    public Byn(int numCoins) {
        this.numCoins = numCoins;
    }

    public Byn(int rubs, int coins) {
        this(rubs*100 + coins);
    }

    public Byn(Byn byn) {
        this(byn.numCoins);
    }

    public int getRubs() {
        return numCoins / 100;
    }

    public int getCoins() {
        return numCoins % 100;
    }

    public Byn add(Byn byn) {
        numCoins += byn.numCoins;
        return this;
    }

    public Byn sub(Byn byn) {
        numCoins -= byn.numCoins;
        return this;
    }

    public Byn mul(int k) {
        numCoins *= k;
        return this;
    }

    public Byn mul(double x) {
        numCoins = (int) Math.round(numCoins * x);
        return this;
    }

    @Override
    public String toString() {
        return getRubs() + "." +
                getCoins() / 10 +
                getCoins() % 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Byn)) {
            return false;
        }
        Byn other = (Byn) o;
        if (numCoins != other.numCoins) {
            return false;
        }
        return true;
    }

    public Byn mul(double k, RoundMethod roundMethod, int d) {
        numCoins = roundMethod.round(numCoins * k, d);
        return this;
    }

    public Byn round(RoundMethod roundMethod, int d) {
        numCoins = roundMethod.round(numCoins, d);
        return this;
    }

    @Override
    public int compareTo(Byn byn) {
        return this.numCoins - byn.numCoins;
    }
}

