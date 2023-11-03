public class Program6_AddTwoComplexNumbers {    
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(2, 3);

        // Without addComplexNum class
        int real = c1.real + c2.real;
        int imaginary = c1.image + c2.image;
        System.out.println(real+" + "+imaginary+"i");

        // With addComplexNum class
        addComplexNum add = new addComplexNum(c1, c2);
    }
}


class ComplexNumber {
    int real, image;

    ComplexNumber(int r, int i){
        this.real = r;
        this.image = i;
    }
}

class addComplexNum {
    addComplexNum(ComplexNumber n1, ComplexNumber n2) {
        
        // Create an object of ComplexNumber for summation
        ComplexNumber c = new ComplexNumber(0, 0);
        c.real = n1.real + n2.real;
        c.image = n2.image + n2.image;

        System.out.println(c.real+" + "+c.image+"i");
    }
}