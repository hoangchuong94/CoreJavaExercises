package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static String FILE_ACCOUNT = "D:\\CoffeManager\\src\\file\\Account.csv";
    public static String FILE_DRINK = "D:\\CoffeManager\\src\\file\\Drink.csv";
    public static String FILE_ODER = "D:\\CoffeManager\\src\\file\\Oder.csv";

    public static List<Account> listAccount = new ArrayList<>();
    public static List<Drink> listDrinks = new ArrayList<>();
    public static List<Employee> listEmployee = new ArrayList<>();
    public static List<Order> listOrders = new ArrayList<>();
    public static List<Customer> listCustomers = new ArrayList<>();


    public Data () {

    }


}

