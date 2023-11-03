public class Program20_FindPerimeterOfARectangle {
    public static void main(String[] args) {
        
        System.out.println(PerimeterOfRectangle.perimeter(24.2, 12.3));
        System.out.println(PerimeterOfRectangle.perimeter(24.25, 12.25));
    }
}

class PerimeterOfRectangle{
    static double perimeter(Double len, Double width){
        return 2*len*width;
    }
}