package services;


import data.Data;
import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ServicesEmployee {
    Input input = new Input();


    public void changePassword(Account account) {
        for(Account elements : Data.listAccount) {
            if(elements.getUsername().equals(account.getUsername()))
                elements.setPassword(input.inputPassword());
        }
        System.out.println("Đổi Mật Khẩu Thành Công");
    }




    public void displayMenuDrink() {
        System.out.printf("\n%-13s%-16s%-12s", "Lựa Chọn", "Tên", "Giá");
        System.out.println("\n-----------------------------------------");
        for(Drink elements : Data.listDrinks) {
            System.out.println(elements.toStringMenu());
        }
    }

    public Drink searchDrink() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        for(Drink elements : Data.listDrinks) {
            if(choice == elements.getIdDrink())return elements;
        }
        return null;
    }

    public ArrayList<Drink> choiceDrink() {
        System.out.println("------------------------------------");
        ArrayList<Drink> arrayChoiceDrinks = new ArrayList<>();
        do{
            displayMenuDrink();
            System.out.println("-----------------------------------------");
            System.out.println("Nhập Lựa Chọn Của Bạn : ");
            Drink drink = searchDrink();

            if(drink != null) {
                System.out.println("-----------------------------------------");
                drink.setQuantity(input.inputQuantity());
                arrayChoiceDrinks.add(drink);
            }else
                System.err.println("Bạn Nhập Sai Lựa Chọn : ");
        }while (input.chekNext());
        return arrayChoiceDrinks;
    }

    public void order() {
        Order order = new Order();
        Customer customer = new Customer();
        order.setOrderId(customer.getIdCustomer());
        order.setArrayOrderDrink(choiceDrink());
        order.setTimeIn(new Date());
        Data.listOrders.add(order);
        Data.listCustomers.add(customer);
        System.out.println("--------------------------------------------------");
        System.out.println("Đặt Hàng Thành Công :");
    }


    public void displayOrder() {

        if(!Data.listOrders.isEmpty()){
            System.out.println("------------------------------------------------------");
            for (Order order : Data.listOrders) {
                System.out.printf("\n%-13s%-16s%-12s%-12s", "STT", "TEN", "GIA", "SO LUONG");
                System.out.println(order.toString());
                System.out.println("------------------------------------------------------");
            }

        }else
            System.out.println("Giỏ Hàng Trống :");
    }

    public Integer pricePaid(Order order) {
        int count = 0;
        for (Drink drinks : order.getArrayOrderDrink()) {
            count += drinks.priceOrder();
        }
        return count;
    }

    public void payment() {
        System.out.println("-------------------------------------");
        if(!Data.listOrders.isEmpty()) {
            for(Order order : Data.listOrders) {
                System.out.println("---------------------------------");
                System.out.println(order.toString());
            }
            System.out.println("=========================================");
            int id = input.inputIdCustomer();
            for(Order order : Data.listOrders) {
                if(id == order.getOrderId()) {
                    order.setUnitPrice(pricePaid(order));
                    System.out.println("-----------------------------------");
                    System.out.println(order.toString());
                }
            }
        }else System.out.println("Chưa Có Sản Phẩm : ");
    }

    public void ShowPendingOrders() {
        if(!Data.listOrders.isEmpty()){
            System.out.println("------------------------------------------------------");

            for (Order order : Data.listOrders) {
                if(order.chekUnitPrice() == null){
                    System.out.println(order.toString());
                    System.out.println("------------------------------------------------------");
                }
            }
        }else
            System.out.println("Chưa Có Đơn Hàng :");
    }



}
