package com.tritern;

import java.util.Scanner;

public class Mens extends Garments{

     int shirtCost = 700;
     int tShirtCost= 450;
     int pantCost = 750;

    public  int MensSetCart(){
        MensGarments();

        Scanner mensDress = new Scanner(System.in);

        int mensSi = mensDress.nextInt();

        if (mensSi==1){
            Shirt();
        } else if (mensSi==2){
            TShirt();
        }else if (mensSi==3){
            Pant();
        }

        System.out.println("The total cart Value is "+ cart.getBill());

        System.out.println("4.Return to Mens Section.");
        System.out.println("5.Return to Main Menu");
        System.out.println("0.Enter 0 to Exit.");

        int back = mensDress.nextInt();

        if(back==4){
            MensSetCart();
        }else if(back==5){
            WelcomePage.WelcomeText();
        }else if(back==0){
            System.out.println("The Total Amount is "+ cart.getBill());

            System.out.println("ThankYou for Visiting!");
        }
//        System.out.println("dfsdfdsfds");
        return cart.getBill();
    }

    public void Shirt(){
        cart.addCartItem(shirtCost);
        System.out.println("the Selected Shirt were add to your cart ");
    }

    public void TShirt(){
        cart.addCartItem(tShirtCost);
        System.out.println("the Selected T-Shirt were add to your cart ");
    }

    public  void Pant(){
        cart.addCartItem(pantCost);
        System.out.println("the Selected Pant were add to your cart ");
    }

    public  void MensGarments(){

//        Mens shirt = new Mens();
        System.out.println("1.Shirts starting at price of " + shirtCost);

//        Mens tShirt = new Mens();
        System.out.println("2.t-Shirt starting at price of "+ tShirtCost);

//        Mens pant = new Mens();
        System.out.println("3.pant starting at price of " + pantCost);

    }

    public void GarmentsSection(){
        System.out.println("2.MENS");
    }
}
