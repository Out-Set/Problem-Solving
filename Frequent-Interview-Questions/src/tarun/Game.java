package tarun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        

        List<Animal> animals = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int i =  1;

        while(i <= 2){

            System.out.print("Enter Vitality of Animal " + i + ": ");
            int vitality = sc.nextInt();

            System.out.print("Enter Strength of Animal " + i + ": ");
            int strength = sc.nextInt();
        
            animals.add(new Animal(vitality, strength));
            i++;

        }

        // Entity entity = new Entity();
        int j = 1;
        for (Animal animal : animals) {
            System.out.println("Animal " + j);
            System.out.println("Animal Vitality: " + animal.getVitality() + "\nAnimal Strength: " + animal.getStrength());
            j++;
        }

        sc.close();
        
    }
}


class Animal {

    private int vitality;
    private int strength;

    public Animal(int vitality, int strength) {
        this.vitality = vitality;
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}