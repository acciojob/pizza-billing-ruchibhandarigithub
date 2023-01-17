package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int toppingVeg=70;
    int toppingNonVeg=120;
    int paperBagP=20;
    int cheeseP=80;
    int vegPizzaBaseP = 300;
    int nonVegBaseP = 400;

    String cheeseBill = "Extra Cheese Added:"+" ";
    String toppingBill = "Extra Toppings Added:"+" ";
    String paperBagBill = "Paperbag Added:"+" ";
    String totalBill = "Total Price:"+" ";
    String pizzaBaseBill = "Base Price Of The Pizza:"+" ";
    boolean cFlag=false;
    boolean tFlag=false;
    boolean pFlag=false;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price=vegPizzaBaseP;

        }else{
            price=nonVegBaseP;

        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cFlag){
            price +=cheeseP;
            cFlag=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!tFlag){
            if(isVeg){
                price+=toppingVeg;

            }else{
                price+=toppingNonVeg;
            }
            tFlag=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!pFlag){
            price+=paperBagP;
            pFlag=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill = pizzaBaseBill +vegPizzaBaseP + "\n";
        }

        if(!isVeg){
            bill = pizzaBaseBill +  nonVegBaseP +"\n";
        }


        if(cFlag){
            bill+=cheeseBill+cheeseP+"\n";
        }
        if(tFlag){
            if(isVeg){
                bill+=toppingBill+toppingVeg+"\n";
            }else{
                bill+=toppingBill+toppingNonVeg+"\n";
            }
        }
        if(pFlag){
            bill+=paperBagBill+paperBagP+"\n";
        }
        bill+=totalBill+price+"\n";
        this.bill=bill;

        return this.bill;
    }
}