package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private boolean paperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=isVeg?300:400;
        this.bill="Base Price of the Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded)
        {
            this.price += 80;
            this.extraCheeseAdded=true;
            this.bill += "Extra Cheese Added: 80 \n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded)
        {
            int toppingsPrice=isVeg?70:120;
            this.price += toppingsPrice;
            this.extraToppingsAdded=true;
            this.bill += "Extra Toppings Added: " + toppingsPrice + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeawayAdded)
        {
            this.price += 20;
            this.takeawayAdded=true;
            this.paperBagAdded=true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        return "Total Price: " + price + "\n" + this.bill;
    }
}
