package com.tritern;

import java.util.Scanner;

public class WelcomePage {


    public static void WelcomeText(){

//        Cart cart = new Cart();

        System.out.println("Welcome to XYZ Textile Shop");
        System.out.println("There are Three Sections are available:");

        Kids kids = new Kids();
        kids.GarmentsSection();

        Mens mens = new Mens();
        mens.GarmentsSection();

        Womens womens = new Womens();
        womens.GarmentsSection();

        Scanner selectSection = new Scanner(System.in);

        int secNo = selectSection.nextInt();

        switch (secNo){
            case 1 :  kids.KidsSetCart();
//                System.out.println("kidsTotoal "+kidsTotal);
                break;
            case 2 : mens.MensSetCart();
//                System.out.println("mensTotoal "+mensTotal);
                break;
            case 3 : womens.WomensSetCart();
//                System.out.println("womensTotoal "+womensTotal);

        }

//        System.out.println("The Total Amount is "+ cart.getBill());

    }
}
