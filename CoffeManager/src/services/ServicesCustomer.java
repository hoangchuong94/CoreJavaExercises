package services;

import data.Data;
import model.Account;
import model.Customer;
import model.Drink;
import model.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ServicesCustomer extends ServicesEmployee{

    Input input = new Input();
    Customer customer = new Customer();


    @Override
    public void order() {
        Order order = new Order();
        order.setOrderId(customer.getIdCustomer());
        order.setArrayOrderDrink(choiceDrink());
        order.setTimeIn(new Date());
        Data.listOrders.add(order);
        customer.setName(input.inputNameCustomer());
        customer.setPhone(input.inputPhone());
        customer.setAddress(input.inputAdress());
        Data.listCustomers.add(customer);

        System.out.println("--------------------------------------------------");
        System.out.println("Đặt Hàng Thành Công :");

    }


    @Override
    public void displayOrder() {
        if(!Data.listOrders.isEmpty()){
            System.out.println("------------------------------------------------------");
            for (Order order : Data.listOrders) {
                if(order.getOrderId() == customer.getIdCustomer()) {
                    System.out.println(order.toString());
                }
            }

        }else
            System.out.println("Giỏ Hàng Trống :");
    }
}
