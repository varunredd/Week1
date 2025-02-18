public class Operators {
    public double add ( double a, double b ) {
        return (a + b);
    }

    public double subtract ( double a, double b ) {
        return (a - b);
    }

    public double multiply ( double a, double b ) {
        return (a * b);
    }

    public double divide ( double a, double b ) {
        return (a / b);
    }

    public int modulus ( int a, int b ) {
        return (a % b);
    }

    public int increment ( int a ) {
        return ++a;
    }

    public int decrement ( int a ) {
        return --a;
    }

    public int and ( int a, int b ) {
        return a & b;
    }

    public int or ( int a, int b ) {
        return a | b;
    }

    public int rightShift ( int a, int b ) {
        return a >> b;
    }

    public int leftShift ( int a, int b ) {
        return a << b;
    }

    public boolean greater ( double a, double b ) {
        return a > b;
    }

    public boolean lesser ( double a, double b ) {
        return a < b;
    }

    public boolean equals ( double a, double b ) {
        return a == b;
    }
}
