package com.company;

import java.util.Scanner;

public class Dog extends Pet{

    private boolean likesWalks;
    private boolean canFetch;
    private String coatType;
    private boolean bark;

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    private Scanner input = new Scanner(System.in);

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesWalks, boolean canFetch, String coatType) {
        super(ownerName, petName, homeAddress, age, gender);
        this.likesWalks = likesWalks;
        this.canFetch = canFetch;
        this.coatType = coatType;
//        System.out.println("What is your dog's name?");
//        setPetName(input.nextLine());
//        System.out.println("Does " + getPetName() + " like to take walks? True or False");
//        setLikesWalks(input.nextBoolean());


    }
    public boolean isLikesWalks() {
        return likesWalks;
    }

    public void setLikesWalks(boolean likesWalks) {
        this.likesWalks = likesWalks;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    @Override
    protected String makeSound() {
        return super.makeSound() + " But dogs bark";
    }
}
