package com.tritern;

import java.util.Scanner;

public class Womens extends Garments{

     int topCost = 400;
     int legginCost= 550;
     int sareeCost =1750;

    public int WomensSetCart(){

        WomensGarments();

        Scanner womensDress = new Scanner(System.in);

        int womensSi = womensDress.nextInt();

        if(womensSi==1){
            Tops();
        }else if(womensSi==2){
            Leggin();
        }else if(womensSi==3){
            Saree();
        }

        System.out.println("The total cart Value is "+ cart.getBill());

        System.out.println("4.Return to Womens Section.");
        System.out.println("5.Return to Main Menu");
        System.out.println("0.Enter 0 to Exit.");

        int back = womensDress.nextInt();

        if(back==4){
            WomensSetCart();
        }else if(back==5){
            WelcomePage.WelcomeText();
        }else if(back==0){
            System.out.println("The Total Amount is "+ cart.getBill());

            System.out.println("ThankYou for Visiting!");
        }
//        System.out.println("womens final amount"+cart.getBill());
        return cart.getBill();
    }



    public  void Tops(){
        cart.addCartItem(topCost);
        System.out.println("the Selected tops were add to your cart ");
    }

    public  void Leggin(){
        cart.addCartItem(legginCost);
        System.out.println("the Selected leggin were add to your cart ");
    }

    public void Saree(){
        cart.addCartItem(sareeCost);
        System.out.println("the Selected Saree were add to your cart ");
    }

    public  void WomensGarments(){

//        Womens tops = new Womens();
        System.out.println("1.Tops starting at price of " + topCost);

//        Womens leggin = new Womens();
        System.out.println("2.Leggin starting at price of "+ legginCost);

//        Womens saree = new Womens();
        System.out.println("3.Saree starting at price of " + sareeCost);

    }


    public void GarmentsSection(){
        System.out.println("3.WOMENS");
    }
}
