package data;

import model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static String filename = "D:\\QuanLyDanhBaDienThoai\\src\\data\\Contacts.csv";
    public static List<Contact> contactList = new ArrayList<>();


    public static void readFileAccount() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayContacts = line.split(";");
                Contact contact = new Contact();
                contact.setGroup(arrayContacts[0]);
                contact.setPhoneNumber(arrayContacts[1]);
                contact.setName(arrayContacts[2]);
                contact.setSex(arrayContacts[3]);
                contact.setAddress(arrayContacts[4]);
                contact.setBirthday(arrayContacts[5]);
                contact.setEmail(arrayContacts[6]);

                Data.contactList.add(contact);
                System.out.println("Đọc File Thành Công :");
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveFileAccount() {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
            for(Contact elements : Data.contactList) {
                bufferedWriter.write(elements.toStringCsv());
            }
            System.out.println("Ghi File Thành Công :");
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
