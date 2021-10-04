package com.company;

import data.Data;
import services.ServicesPhoneBook;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);


    public void menuManager() {
        System.out.println("-----------------------------");
        System.out.println("1. Xem Danh Sách : ");
        System.out.println("2. Thêm Mới :");
        System.out.println("3. Cập Nhật :");
        System.out.println("4. Xóa :");
        System.out.println("5. Tìm Kiếm  :");
        System.out.println("6. Đọc Từ File Csv:");
        System.out.println("7. Ghi File : ");
        System.out.println("8. Thoát .");
        System.out.println("-----------------------------");
    }

    public void choice() {
        ServicesPhoneBook servicesPhoneBook = new ServicesPhoneBook();

        String choice;

        do{
            menuManager();
            System.out.println("Nhập Lựa Chọn Của Bạn :");
            choice = scanner.next();
            switch (choice) {
                case "1" : servicesPhoneBook.displayContact();
                    break;
                case "2" : servicesPhoneBook.addContact();
                    break;
                case "3" : servicesPhoneBook.updateContact();
                    break;
                case "4" : servicesPhoneBook.removeContact();
                    break;
                case "5" : servicesPhoneBook.searchContact();
                    break;
                case "6" :
                           Data.readFileAccount();
                    break;
                case "7" :
                           Data.saveFileAccount();
                    break;
                case "8":
                    break;
                default:
                    System.out.println("Bạn Nhập Sai Lựa Chọn :");
            }
        }while (!choice.equals("8"));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.choice();
    }
}
