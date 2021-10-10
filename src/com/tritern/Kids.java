package com.tritern;

import java.util.Scanner;

public class Kids extends Garments{

     int shirtCost = 500;
     int shortsCost = 550;

    public int KidsSetCart(){
        KidsGarments();

        Scanner kidsDress = new Scanner(System.in);

        int kidsSi = kidsDress.nextInt();

        if (kidsSi==1){
            Shirt();
        }else if (kidsSi==2){
            Shorts();
        }



        System.out.println("The total cart Value is "+ cart.getBill());
        System.out.println("Press 8 to Remove the selected item.");
        System.out.println("Press 9 to Remove the selected item.");


        int removeSi=kidsDress.nextInt();

        if(removeSi==8){
            RemoveShirt();
        }else if (removeSi==9){
            RemoveShorts();
        }

        System.out.println("3.Return to Kids Section.");
        System.out.println("4.Return to Main Menu");
        System.out.println("0.Enter 0 to Exit.");

        int back = kidsDress.nextInt();

        if(back==3){
            KidsSetCart();
        }else if(back==4){
            WelcomePage.WelcomeText();
        }else if(back==0){
            System.out.println("The Total Amount is "+ cart.getBill());

            System.out.println("ThankYou for Visiting!");
        }

        return cart.getBill();
    }

    public  void Shirt(){
        cart.addCartItem(shirtCost);
        System.out.println("the Selected Shirt were add to your cart ");
    }

    public  void RemoveShirt(){
        cart.removeCartItem(shirtCost);
        System.out.println("Selected item Removed Successfully");
    }

    public  void RemoveShorts(){
        cart.removeCartItem(shortsCost);
        System.out.println("Selected item Removed Successfully");
    }

    public  void Shorts(){
        cart.addCartItem(shortsCost);
        System.out.println("the Selected Shorts were add to your cart ");

    }

    public  void KidsGarments(){

//        Kids shirt = new Kids();
        System.out.println("1.Shirts started at price of " + shirtCost);

//        Kids shorts = new Kids();
        System.out.println("2.Shorts started at price of " + shortsCost);

    }


    public void GarmentsSection(){
        System.out.println("1.KIDS");
    }
}
