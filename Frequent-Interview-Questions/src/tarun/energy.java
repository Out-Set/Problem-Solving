package tarun;

public class energy {
    public static void main(String[] args) {
        
        int mass = 100756;

        int energy = 0;

        while(mass > 0) {
            mass = Math.round(mass/3)-2;
            if(mass>0){
                energy = energy + mass;
            }            
        }

        System.out.println("Total Energy: " + energy);
    }
}
