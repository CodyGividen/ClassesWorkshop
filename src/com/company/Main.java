package com.company;

public class Main {

private String MyString;



//    private String MyString;
////in its self
//
//
//    protected String lotsOfString;
//// in certain places
//
//
//    public String lastString;
////in all
//
//
//    String anotherString;
//// is defualt promissions

    public static void main(String[] args) {
        Dog dog = new Dog(true, true, "big");
        System.out.println("                           ");
        Kat kat = new Kat(true, 2,true, 123, true, true, "yes");
//        System.out.println(dog.makeSound() + kat.makeSound());


        System.out.println(kat.catYears());

        System.out.println(dog.dogYears());
















    }
}
