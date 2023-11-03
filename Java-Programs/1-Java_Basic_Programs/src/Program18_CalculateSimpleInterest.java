public class Program18_CalculateSimpleInterest {
    public static void main(String[] args) {
        
        System.out.println(SimpleInterest.SI(80, 7, 2));
        System.out.println(SimpleInterest.SI(80.58, 8.96, 2.25));
    }
}

class SimpleInterest {
    static double SI(double p, double r, double t){
        return (p*r*t)/100;
    }
}