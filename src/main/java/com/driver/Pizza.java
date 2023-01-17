package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    boolean extraCheese;
    boolean extraTopping;
    boolean istakeway ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            System.out.println("Base Price Of The Pizza:" +300);
            this.price=300;
        }
        else{
            System.out.println("Base Price Of The Pizza:"+ 400);
            this.price=400;
        }
        this.extraCheese=false;
        this.extraTopping=false;
        this.istakeway=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
      if(extraCheese==false){
          System.out.println("Extra Cheese Added: "+80);
          this.price = price+80;
          extraCheese=true;
      }
        // your code goes here
    }

    public void addExtraToppings(){
       if(isVeg==true && (extraTopping==false && extraCheese==true)){
           System.out.println("Extra Toppings Added: "+70);
           this.price=price+70;
           extraTopping=true;

       }
       else if(isVeg==false && extraTopping==false){
           System.out.println("Extra Toppings Added: "+120);
           this.price=price+120;
           extraTopping=true;

       }
        // your code goes here
    }

    public void addTakeaway(){
        if(istakeway==false){
            System.out.println("Paperbag Added: "+20);
            this.price=price+20;
            istakeway = true;

        }
        // your code goes here
    }

    public String getBill(){
       this.bill= "Total Price: "+String.valueOf(price);
        // your code goes here
        return this.bill;
    }
}
