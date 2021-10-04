package com.company;

import data.Data;
import model.Account;
import model.Drink;
import repository.WriteFileAndReadFile;
import services.Login;
import services.ServicesAdmin;
import services.ServicesCustomer;
import services.ServicesEmployee;


import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    WriteFileAndReadFile writeReader = new WriteFileAndReadFile();




    public Main() {

    }


    public void menuLogin() {
        System.out.println("--------------------------");
        System.out.println("1.Đăng Nhập : ");
        System.out.println("2.Đăng Ký: ");
        System.out.println("3.Thoát.");
        System.out.println("-------------------------------");
    }

    public void choiceLogin() {
        String choice;
        Login servicesLogin = new Login();
        writeReader.readFileAccount();
        writeReader.readDrink();
        do{

            menuLogin();
            System.out.println("Nhập Lựa Chọn Của Bạn :");
            choice = scanner.next();

            switch (choice) {
                case "1" :
                    Account account = servicesLogin.chekLogin();
                    if(account == null) {
                        System.out.println("Tài Khoảng Không Tồn Hoặc Bạn Nhập Sai Mật Khẩu :");
                        System.out.println("Vui Lòng Nhập Lai :");
                    }else if (account.getRole() == 1){
                        choiceAdmin(account);
                    }else if (account.getRole() == 2){
                        choiceCustomer(account);
                    }else   choiceManager(account);
                    break;
                case "2" :
                    servicesLogin.Registration();
                    writeReader.saveFileAccount();
                    break;
                case "3" :
                    break;
                default:
                    System.out.println("Bạn Nhập Sai Lựa Chọn :");
                    break;
            }
        }while (!choice.equals("3"));

    }
//
    public void menuManager() {
        System.out.println("-----------------------------");
        System.out.println("1. Hiển Thị Menu : ");
        System.out.println("2. Đặt Hàng:");
        System.out.println("3. Thanh Toán :");
        System.out.println("4. Hiển Thị Đơn Hàng :");
        System.out.println("5. Đổi Mật Khẩu :");
        System.out.println("6. Thoát. ");
        System.out.println("-----------------------------");
    }

    public void choiceManager(Account account) {
        String choice;
        ServicesEmployee servicesEmployee = new ServicesEmployee();
        do{
            menuManager();
            System.out.println("Nhập Lựa Chọn Của Bạn :");
            choice = scanner.next();
            switch (choice) {
                case "1" :  servicesEmployee.displayMenuDrink();
                    break;
                case "2" :  servicesEmployee.order();
                writeReader.saveFileOrder();
                    break;
                case "3" :  servicesEmployee.payment();
                    break;
                case "4" :  servicesEmployee.displayOrder();
                    break;
                case "5" :  servicesEmployee.changePassword(account);
                    break;
                case "6" :
                    break;
                default:
                    System.out.println("Bạn Nhập Sai Lựa Chọn :");
            }
        }while (!choice.equals("6"));
    }

    public void menuCustomer() {
        System.out.println("--------------------");
        System.out.println("1. Hiển Thị Thực Đơn : ");
        System.out.println("2. Đặt Hàng :");
        System.out.println("3. Hiển Thị Đơn Hàng Của Tôi :");
        System.out.println("4. Đổi Mật Khẩu :");
        System.out.println("5. Thoát. ");
        System.out.println("-----------------------------");
    }

    public void choiceCustomer(Account account) {
        ServicesEmployee servicesCustomer = new ServicesCustomer();
        String choice;
        do{
            menuCustomer();
            System.out.println("Nhập Lựa Chọn Của Bạn :");
            choice = scanner.next();
            switch (choice) {
                case "1" : servicesCustomer.displayMenuDrink();

                    break;
                case "2" : servicesCustomer.order();
                    break;
                case "3" : servicesCustomer.displayOrder();
                    break;
                case "4" : servicesCustomer.changePassword(account);
                            writeReader.saveFileAccount();
                    break;
                case "5" :
                    break;
                default:
                    System.out.println("Bạn Nhập Sai Lựa Chọn ");
            }
        }while (!choice.equals("5"));
    }

    public void menuAdmin() {
        System.out.println("------------------------:");
        System.out.println("1.Tạo Tài Khoảng Nhân Viên :");
        System.out.println("2.Thêm Thực Đơn :");
        System.out.println("3.Xóa Thực Đơn  :");
        System.out.println("4.Đổi Mật Khẩu  :");
        System.out.println("5.Hiển Thị Thực Đơn :");
        System.out.println("6.Thoát.");
        System.out.println("------------------------");
    }

    public void choiceAdmin(Account account) {
        ServicesAdmin servicesAdmin = new ServicesAdmin();
        String choice;
        do{
            menuAdmin();
            System.out.println("Mời Bạn Nhập Lựa Chọn :");
            choice = scanner.next();
            switch (choice) {
                case "1" : servicesAdmin.RegistrationManger();
                            writeReader.saveFileAccount();
                    break;
                case "2" : servicesAdmin.addMenu();
                            writeReader.saveFileDrink();
                    break;
                case "3" : servicesAdmin.removeMenu();
                            writeReader.saveFileDrink();
                    break;
                case "4" : servicesAdmin.changePassword(account);
                            writeReader.saveFileAccount();
                    break;
                case "5" :  servicesAdmin.displayMenu();
                    break;
                case "6" :
                    break;
                default:
                    System.out.println("Bạn Nhập Sai Lựa Chọn ");
            }
        }while (!choice.equals("6"));
    }



    public static void main(String[] args) {





        Main main = new Main();
        main.choiceLogin();

//        System.out.printf("\n%-13s%-16s%-12s","STT","Ten","Giá");
//        for(Drink items : Data.listDrinks) {
//            System.out.println(items.toString());
//        }

//        System.out.printf("\n%-13s%-16s%-12s", "Lựa Chọn", "Tên", "Giá");

    }
}
