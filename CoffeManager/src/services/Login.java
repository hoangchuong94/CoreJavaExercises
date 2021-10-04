package services;

import data.Data;
import model.Account;
import model.Drink;

import java.io.*;

public class Login {
    Input input = new Input();
    public Login() {
    }


    public Account chekLogin() {
        String userName = input.inputUsername();
        String password = input.inputPassword();
            for(Account element : Data.listAccount) {
                if(element.getUsername().equals(userName) && element.getPassword().equals(password)) {
                    return element;
                }
            }
            return null;
    }


    public boolean chekRegistration() {
        String userName = input.inputUsername();
        for(Account elements : Data.listAccount) {
            if(Data.listAccount.size() == 0 || !elements.getUsername().equals(userName)) {
                Account account = new Account();
                String password = input.inputPassword();
                account.setUsername(userName);
                account.setPassword(password);
                account.setRole(2);
                Data.listAccount.add(account);
                return true;
            }
        }
        return false;
    }

    public void Registration() {

        if(chekRegistration()) {
            System.out.println("DANG KY THANH CONG");
        }else System.out.println("TEN TAI KHOANG DA DUOC SU DUNG :");
    }




}
