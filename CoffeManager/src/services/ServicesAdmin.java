package services;

import data.Data;
import model.Account;
import model.Drink;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ServicesAdmin {
    Input input = new Input();
    Scanner scanner = new Scanner(System.in);

    public boolean createAccountManager() {
        String userName = input.inputUsername();
        for(Account elements : Data.listAccount) {
            if(Data.listAccount.size() == 0 || !elements.getUsername().equals(userName)) {
                Account account = new Account();
                String password = input.inputPassword();
                account.setUsername(userName);
                account.setPassword(password);
                account.setRole(3);
                Data.listAccount.add(account);
                return true;
            }
        }
        return false;
    }

    public void RegistrationManger() {

        if(createAccountManager()) {
            System.out.println("DANG KY THANH CONG");
        }else System.out.println("TEN TAI KHOANG DA DUOC SU DUNG :");
    }

    public void addMenu() {
        Drink drink = new Drink();
        drink.setName(input.inputNameDrink());
        drink.setPrice(input.inputPriceDrink());
        Data.listDrinks.add(drink);
        System.out.println("Thêm Thành Công :");
    }


    public void removeMenu() {
        Data.listDrinks.remove(searchRemoveMenu());
        System.out.println("Xóa Thành Công :");

    }

    public void displayMenu() {
        for(Drink drink : Data.listDrinks) {
            System.out.println(drink.toStringDrink());
        }
    }
    public Drink searchRemoveMenu() {
        displayMenu();
        System.out.println("-------------------------------");
        System.out.println("Nhập Id Cần Xóa :");
        int idDrink = scanner.nextInt();
        for(Drink drink : Data.listDrinks) {
            if (drink.getIdDrink() == idDrink) {
                return drink;
            }
        }
        return null;
    }

    public void changePassword(Account account) {
        for(Account elements : Data.listAccount) {
            if(elements.getUsername().equals(account.getUsername()))
                elements.setPassword(input.inputPassword());
        }
        System.out.println("Đổi Mật Khẩu Thành Công");
    }
}
