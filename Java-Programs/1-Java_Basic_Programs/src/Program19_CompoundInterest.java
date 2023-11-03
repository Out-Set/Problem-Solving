public class Program19_CompoundInterest {
    public static void main(String[] args) {
        
        System.out.println(CompoundInterest.CI(10000, 10.25, 5));
        System.out.println(CompoundInterest.CI(15000, 12.25, 5.7));
    }
}

class CompoundInterest{
    static double CI(double p, double r, double t){
        return p*(Math.pow((1+r/100), t));
    }
}