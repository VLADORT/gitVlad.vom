public class SimpleCalc {
    private double a;
    private double b;
    SimpleCalc(double p1,double p2) {
        this.a=p1;
        this.b=p2;


    }
    public double getMul() {
<<<<<<< HEAD
        return this.a/this.b;
=======
        return this.a*2*this.b;
>>>>>>> conflictTest
    }

    public double getSub() {
        return this.a-this.b;
    }

    public double getSum() {
        return this.a+this.b;
    }
}
