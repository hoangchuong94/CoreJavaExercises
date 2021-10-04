package repository;

import data.Data;
import model.Account;
import model.Drink;
import model.Order;
import utils.DateUtils;

import java.io.*;
import java.util.Date;

public class WriteFileAndReadFile {

    public void readFileAccount() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Data.FILE_ACCOUNT));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayAccounts = line.split(";");
                Account account = new Account();
                account.setUsername(arrayAccounts[0]);
                account.setPassword(arrayAccounts[1]);
                account.setRole(Integer.parseInt(arrayAccounts[2]));
                Data.listAccount.add(account);
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveFileAccount() {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Data.FILE_ACCOUNT));
            for(Account elements : Data.listAccount) {
                bufferedWriter.write(elements.toStringCsv());
            }
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDrink() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Data.FILE_DRINK));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayDrinks = line.split(";");
                Drink drink = new Drink();
                drink.setIdDrink(Integer.parseInt(arrayDrinks[0]));
                drink.setName(arrayDrinks[1]);
                drink.setPrice(Integer.parseInt(arrayDrinks[2]));
                Data.listDrinks.add(drink);
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveFileDrink() {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Data.FILE_DRINK));
            for(Drink drink : Data.listDrinks) {
                bufferedWriter.write(drink.toCsvString());
            }
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readOrder() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Data.FILE_ODER));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayOrder = line.split(";");
                Order order = new Order();
                order.setOrderId(Integer.parseInt(arrayOrder[0]));

                String[] arrayDrink = arrayOrder[1].split(" ");

                Drink drink = new Drink();

                drink.setIdDrink(Integer.parseInt(arrayDrink[0]));
                drink.setName(arrayDrink[1]);
                drink.setPrice(Integer.parseInt(arrayDrink[2]));
                drink.setQuantity(Integer.parseInt(arrayDrink[3]));

                Date date = DateUtils.stringToDate(arrayOrder[2]);
                order.setTimeIn(date);

                Data.listOrders.add(order);


            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveFileOrder() {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Data.FILE_ODER));
            for(Order order : Data.listOrders) {
                bufferedWriter.write(order.toStringCsv());
            }
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }




}
