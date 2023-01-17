package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    boolean extraCheese;
    boolean extraTopping;
    boolean istakeway ;
    String pizzbase;
    String Cheese = "Extra Toppings Added: ";
    String topping ="Extra Toppings Added: ";
    String takeway ="Paperbag Added: ";


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.pizzbase="Base Price Of The Pizza: "+300;

            this.price=300;
        }
         else{
            this.pizzbase="Base Price Of The Pizza: "+400;

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
          Cheese+=80;
          extraCheese=true;
      }
        // your code goes here
    }

    public void addExtraToppings(){
       if(isVeg==true && (extraTopping==false && extraCheese==true)){
           this.topping+=70;
           extraTopping=true;

       }
       else if(isVeg==false && extraTopping==false){
           this.topping+=120;
           extraTopping=true;

       }
        // your code goes here
    }

    public void addTakeaway(){
        if(istakeway==false){
            this.takeway+=20;
            istakeway = true;

        }
        // your code goes here
    }

    public String getBill(){
        this.bill=pizzbase+"\n";
        if(extraCheese){
            this.bill+=Cheese+"\n";
        }
        if(extraTopping){
            this.bill+=topping+"\n";
        }
        if(istakeway){
            this.bill+=takeway+"\n";
        }
        this.bill+="Total Price: "+this.price;
        // your code goes here
        return this.bill;
    }
}
