package model;

import java.util.Date;

public class Drink {
    private int idDrink;
    private Integer quantity;
    private String name ;
    private int price;
    static int count = 0;



    public Drink() {
        this.idDrink = autoid();
    }



    public Drink(int id, String name, int price) {
        this.idDrink = id;
        this.name = name;
        this.price = price;
    }

    public Drink(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public static int  autoid() {
        count++;
        return count;
    }

    public int getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(int idDrink) {
        this.idDrink = idDrink;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int priceOrder() {
        return quantity * price;
    }

//    @Override
//    public String toString() {
//        return String.format("%5d%10s%10d",id,name,price) + "\n";
//    }


    @Override
    public String toString() {
        return String.format("\n%-13d%-16s%-12d%-12d", idDrink, name, price, quantity);

    }

    public String toStringDrink() {
        return String.format("\n%-13d%-16s%-12d", idDrink, name, price);

    }



    public String toStringMenu() {

        return String.format("\n%-13d%-16s%-12d", idDrink, name, price);
    }

    public String toStringCsvOrder() {
        return idDrink + "-" + name + "-" + price + "-" + quantity;

    }


    public String toCsvString() {
        return idDrink + ";" + name + ";" + price ;
    }

}
