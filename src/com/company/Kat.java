package com.company;

import java.util.Scanner;

public class Kat extends Pet{
    private boolean drinksMilk;
    private int numberOfToys;
    private boolean eatsLasagna;
    private double weight;
    private boolean likesCatnip;
    private boolean usesLittlebox;
    private String furType;
    private Scanner input2 = new Scanner(System.in);

    public Kat(boolean drinksMilk, int numberOfToys, boolean eatsLasagna, double weight, boolean likesCatnip, boolean usesLittlebox, String furType, Scanner input2) {
        this.drinksMilk = drinksMilk;
        this.numberOfToys = numberOfToys;
        this.eatsLasagna = eatsLasagna;
        this.weight = weight;
        this.likesCatnip = likesCatnip;
        this.usesLittlebox = usesLittlebox;
        this.furType = furType;
        this.input2 = input2;
        int petHumanAge;
        String petName;
        int catAge;
        System.out.println("What is the name of your cat?");
        petName = input2.nextLine();
        System.out.println("What is the age of your cat?");
        petHumanAge = input2.nextInt();
        if(petHumanAge == 1) {
            catAge= petHumanAge = 19;
        }else if(petHumanAge == 2) {
            catAge = petHumanAge = 24;
        }else(petHumanAge > 2);
            catAge = petHumanAge = (petHumanAge


//    public Kat(String ownerName, String petName, String homeAddress, int age, char gender, boolean drinksMilk, int numberOfToys, boolean eatsLasagna, double weight) {
//        super(ownerName, petName, homeAddress, age, gender);
//        this.drinksMilk = drinksMilk;
//        this.numberOfToys = numberOfToys;
//        this.eatsLasagna = eatsLasagna;
//        this.weight = weight;
//        System.out.println("Does you cat drink milk?");
//        setDrinksMilk(input2.nextBoolean());
//        System.out.println("How many toys does your cat have??");
//        setToys(input2.nextInt());
//        System.out.println("Does your cat eat lasagna?");
//        setEatsLasagna(input2.nextBoolean());
//        System.out.println("How much does your cat weight?");
//        setWeight(input2.nextDouble());
//        System.out.println("What is the name of your cat?");
//        setPetName(input2.nextLine());
//        System.out.println("What is the age of your cat?");
//        setAge(input2.nextInt());
//        if(input2.System.in = 1){



        }



    public boolean isDrinksMilk() {
        return drinksMilk;
    }

    public void setDrinksMilk(boolean drinksMilk) {
        this.drinksMilk = drinksMilk;
    }

    public int getToys() {
        return numberOfToys;
    }

    public void setToys(int toys) {
        this.numberOfToys = toys;
    }

    public boolean isEatsLasagna() {
        return eatsLasagna;
    }

    public void setEatsLasagna(boolean eatsLasagna) {
        this.eatsLasagna = eatsLasagna;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + " Also cats go meow";
    }
}
