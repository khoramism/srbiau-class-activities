package four.two;

public class Eqs {
    private double a;
    private double b;
    private double c;

    private double alfa;
    private double beta;


    public Eqs(){}
    public Eqs(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return (b*b)-(4*a*c);
    }

    public void calculate() throws NoRisheException, TaghsimBarSefrException {
        if (a==0) throw new DivisionByZeroException("Error: A can't be zero!");
        if (delta()<0) throw new NoRootsException("Error: This Equation have not any root!");
        alfa = (-b + Math.sqrt(delta()) ) / (2*a);
        beta =( -b - Math.sqrt(delta()) ) / (2*a);
    }


    public double getAlfa() {
        return alfa;
    }

    public double getBeta() {
        return beta;
    }
}
