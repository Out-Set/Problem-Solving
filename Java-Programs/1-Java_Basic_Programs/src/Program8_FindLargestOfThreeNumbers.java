import java.util.ArrayList;
import java.util.Collections;

public class Program8_FindLargestOfThreeNumbers {
    public static void main(String[] args) {

        // Using Ternary Operator
        UsingTernaryOperator c1 = new UsingTernaryOperator(5, 3, 4);
        UsingTernaryOperator c2 = new UsingTernaryOperator(5, 6, 2);
        UsingTernaryOperator c3 = new UsingTernaryOperator(5, 3, 7);

        // Using If-Else
        UsingIfElse c4 = new UsingIfElse(5, 3, 4);
        UsingIfElse c5 = new UsingIfElse(5, 6, 2);
        UsingIfElse c6 = new UsingIfElse(3, 5, 7);

        // Using Collections.max() method and ArrayList
        UsingCollectionsArrayList c7 = new UsingCollectionsArrayList(5, 3, 4);
        UsingCollectionsArrayList c8 = new UsingCollectionsArrayList(5, 6, 2);
        UsingCollectionsArrayList c9 = new UsingCollectionsArrayList(3, 5, 7);
    }
}

class UsingTernaryOperator {
    UsingTernaryOperator(int x, int y, int z) {
        int largest = z > (x>y ? x:y) ? z:(x>y ? x:y);
        System.out.println(largest);
    }
}

class UsingIfElse {
    UsingIfElse(int x, int y, int z) {
        if(x>y){
            if(x>z)
                System.out.println(x);
            else
                System.out.println(z);
        }
        else{
            if(y>z)
                System.out.println(y);
            else
                System.out.println(z);
        }        
    }
}

class UsingCollectionsArrayList {
    UsingCollectionsArrayList(int x, int y, int z) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(x);
        ar.add(y);
        ar.add(z);

        System.out.println(Collections.max(ar));
    }
}