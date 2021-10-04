package model;

public class Contact {
    private String group;
    private String phoneNumber;
    private String name;
    private String sex;
    private String address;
    private String birthday;
    private String email;


    public Contact() {
    }

    public Contact(String group, String phoneNumber, String name, String sex, String address, String birthday, String email) {
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBook [" +
                "group : " + group + "|" +
                "  phoneNumber : " + phoneNumber + "|" + '\'' +
                "  name : " + name + "|" + '\'' +
                "  sex : " + sex + "|" + '\'' +
                "  address : " + address + "|" + '\'' +
                "  birthday  : " + birthday + "|" + '\'' +
                "  email : " + email + "|" + '\'' +
                "]";
    }

    public String toStringCsv() {
        return group + ";" + phoneNumber + ";" + name + ";" + sex + ";" + address + ";" + birthday + ";" + email ;
    }
}
