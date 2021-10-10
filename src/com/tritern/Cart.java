package com.tritern;

public class Cart {
    private int bill;

//    public Cart(int bill) {
//        bill = bill;
//    }

    public void addCartItem(int bill){
        this.bill += bill;
    }

    public void removeCartItem(int bill){
        this.bill -= bill;
    }

    public int getBill() {
        return bill;
    }
}
