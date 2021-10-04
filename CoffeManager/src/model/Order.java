package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderId;
    private ArrayList<Drink> arrayOrderDrink;
    private Integer unitPrice;
    private Date timeIn;

    public Order() {
         arrayOrderDrink = new ArrayList<>();
    }

    public Order(int orderId, ArrayList<Drink> arrayOrderDrink, Integer unitPrice, Date timeIn) {
        this.orderId = orderId;
        this.arrayOrderDrink = arrayOrderDrink;
        this.unitPrice = unitPrice;
        this.timeIn = timeIn;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Drink> getArrayOrderDrink() {
        return arrayOrderDrink;
    }

    public void setArrayOrderDrink(ArrayList<Drink> arrayOrderDrink) {
        this.arrayOrderDrink = arrayOrderDrink;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Date timeIn) {
        this.timeIn = timeIn;
    }

    public String chekUnitPrice() {
        if (unitPrice == null) {
            return "Chưa Thanh Toán : ";
        }
        else return unitPrice  + " ";
    }

    @Override
    public String toString() {
        return  "ID Khách Hàng :" + orderId + '\n' +
                "Sản Phẩm Đã chọn :" + "\n" + arrayOrderDrink + "\n" +
                "Tổng Chi Phí Phải Trả : " + chekUnitPrice() + '\n' +
                "Thời Gian Đặt Hàng : " + timeIn ;
    }

    public String toStringCsv() {
        return orderId + ";" + arrayOrderDrink + ";" + unitPrice + ";" + timeIn;
    }


}
