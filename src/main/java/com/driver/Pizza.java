package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    boolean extraCheese;
    boolean extraTopping;
    boolean istakeway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            this.bill="Base Price Of The Pizza: "+300+"\n";

            this.price=300;
        }
         else{
            this.bill="Base Price Of The Pizza: "+400+"\n";

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
          this.bill+="Extra Cheese Added: "+80+"\n";
          this.price+=80;
          extraCheese=true;
      }
        // your code goes here
    }

    public void addExtraToppings(){
       if(isVeg==true && (extraTopping==false && extraCheese==true)){
           this.bill+="Extra Toppings Added: "+70+"\n";

           this.price+=70;
           extraTopping=true;

       }
       else if(isVeg==false && extraTopping==false){
           this.bill+="Extra Toppings Added: "+120+"\n";

           this.price+=120;
           extraTopping=true;

       }
        // your code goes here
    }

    public void addTakeaway(){
        if(istakeway==false){
            this.bill+="Paperbag Added: "+20+"\n";

            this.price+=20;
            istakeway = true;

        }
        // your code goes here
    }

    public String getBill(){
        this.bill+="Total Price: "+this.price;


        return this.bill;
    }
}
