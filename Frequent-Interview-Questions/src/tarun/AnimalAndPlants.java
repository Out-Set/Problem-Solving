package tarun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalAndPlants {

    public static void main(String[] args) throws IOException {

        List<Entity> entities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // for two entity
        int n = 2;

        int i =  1;
        while(i <= n){

            System.out.print("Enter Type of the "+i+" Entity: ");
            String type = sc.nextLine();

            System.out.print("Enter Sub-Type of "+i+" the Entity: ");
            String subType = sc.nextLine();
        
            entities.add(new Entity(type,subType));

            i++;
        }
        sc.close();

        int j = 1;
        for (Entity entity : entities) {
            System.out.println("Entity " + j);
            System.out.println("Entity Type: " + entity.getType() + "\nEntity Sub-Type: " + entity.getSubType());
            j++;
        }        
    }
}

class Entity {

    private String type;
    private String subType;

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Entity(String type, String subType) {
        this.type = type;
        this.subType = subType;
    }
}
