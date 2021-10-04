package services;

import data.Data;
import model.Contact;

public class ServicesPhoneBook {

    Input input = new Input();

    public void displayContact() {
        if(!Data.contactList.isEmpty()){
            for(Contact contact : Data.contactList) {
                System.out.println(contact.toString());
            }
        }else {
            System.out.println("Danh Sách Trống :");
        }

    }

    public void addContact() {
        Contact contact = new Contact();

        String gruop = input.inputGruop();
        String phone = input.inputPhone();
        String name = input.inputName();
        String sex = input.inputSex();
        String address = input.inputAddress();
        String birthdate = input.inputBrithday();
        String email = input.inputEmail();
        contact.setPhoneNumber(phone);
        contact.setGroup(gruop);
        contact.setName(name);
        contact.setSex(sex);
        contact.setAddress(address);
        contact.setBirthday(address);
        contact.setEmail(email);
        Data.contactList.add(contact);
    }



    public void updateContact() {
        Contact contact = searchContact();
        if(contact != null) {
            contact.setGroup(input.inputGruop());
            contact.setName(input.inputName());
            contact.setSex(input.inputSex());
            contact.setAddress(input.inputAddress());
            contact.setBirthday(input.inputBrithday());
            contact.setBirthday(input.inputBrithday());
            if(input.chekNext()) {
                Data.saveFileAccount();
            }
        }else {
            System.out.println("Không Tìm Thấy SDT Này:");
        }


    }

    public Contact searchContact() {
        String inputPhone = input.inputPhone();
        for(Contact contact : Data.contactList) {
            if(contact.getPhoneNumber().equals(inputPhone)){
                return contact;
            }
        }
        return null;
    }

    public void removeContact() {
        Contact contact = searchContact();
        if(contact != null){
            Data.contactList.remove(contact);
            if(input.chekNext()) {
                Data.saveFileAccount();
            }
        }else {
            System.out.println("Không Tìm Thấy SDT Này:");
        }
    }





}
