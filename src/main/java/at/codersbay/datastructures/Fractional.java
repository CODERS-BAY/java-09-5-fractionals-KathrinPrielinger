package at.codersbay.datastructures;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    private int numerator;
    private int denominator;


    public Fractional(Integer numerator, Integer denominator) {
        // TODO implement to fix tests in FractionalTest1

        if(denominator == null || numerator == null) {
            throw new IllegalArgumentException();
        }

        if(denominator == 0) {
            throw new IllegalArgumentException();
        }

        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1
        return numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1
        return denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2

        float result = ((float)numerator) / denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO implement to fix tests in FractionalTest3

        Fractional fractionalCompare = (Fractional)obj;

        //Mit diesem einen Fall werden alle anderen 3 Logiken auch gleich abgetestet
        if (this.asFloat().equals(fractionalCompare.asFloat()))

          {
            return true;
        }
        else {
            return false;
        }
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4

        return new Fractional(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4

        return new Fractional(numerator * other, denominator);
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5

        return new Fractional(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5

        return new Fractional(numerator, denominator * other);
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6

        return new Fractional((this.numerator * other.denominator) + (other.numerator * this.denominator), this.denominator * other.denominator);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional(numerator + (other * denominator), denominator);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional((this.numerator * other.denominator) - (other.numerator * this.denominator), this.denominator * other.denominator);

    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(numerator - (other * denominator), denominator);
    }

}