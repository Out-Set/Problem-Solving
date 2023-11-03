package tarun;

import java.util.Scanner;

public class game2 {

    public static void main(String[] args) {
        
        Animal[] animals = new Animal[2];

        Scanner sc = new Scanner(System.in);

        int i =  0;

        while(i <= 1){

            int j = 1;

            System.out.print("Enter Vitality of Animal " + j + ": ");
            int vitality = sc.nextInt();

            System.out.print("Enter Strength of Animal " + j + ": ");
            int strength = sc.nextInt();
        
            animals[i] = new Animal(vitality, strength);

            i++;
            j++;
        }
        sc.close();

        int j = 1;
        for (Animal animal : animals) {
            System.out.println("Animal " + j);
            System.out.println("Animal Vitality: " + animal.getVitality() + "\nAnimal Strength: " + animal.getStrength());
            j++;
        }

        int A = 0, B = 1;
        while((animals[A].getVitality() > 0) || (animals[B].getVitality() > 0)) {
            if(animals[A].getStrength() > animals[B].getVitality()) {
                System.out.println("1st wins");
            }
            else if(animals[B].getStrength() > animals[A].getVitality()) {
                System.out.println("2nd wins");
            }
            else {
                animals[A].setVitality(animals[A].getVitality()-animals[B].getStrength());
                animals[B].setVitality(animals[B].getVitality()-animals[A].getStrength());
            }
        }        
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