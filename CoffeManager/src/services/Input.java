package services;

import data.Data;
import model.Customer;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public String inputUsername() {
        String inputUsername;
        boolean chek;
        do{
            System.out.println("Nhập Tên Đăng Nhập : ");
            inputUsername = input.next();
            String regex = "^[a-z0-9_-]{6,12}$";
            chek = inputUsername.matches(regex);
            if(!chek) {
                System.out.println("Độ Dài Từ 6 --> 12 Không Chứa số :");
            }
        }while (!chek);
        return inputUsername;
    }

    public String inputPassword() {
        String inputPass;
        boolean chek;
        do{
            System.out.println("Nhập Mật Khẩu : ");
            String regex =  "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
            inputPass = input.next();
            chek = inputPass.matches(regex);
            if(!chek){
                System.err.println("ĐỘ Dài Từ 6 --> 20 Chứa it Nhất 1 Chữ Hoa và 1 Ký tự : ");
            }
        }while (!chek);
        return inputPass;
    }

    public String inputNameDrink() {
        String name;
        boolean chek;
        do{
            System.out.println("Nhập Tên :");
            name = input.next();
            String regex = "^[a-zA-Z\\s]*$";
            chek = name.matches(regex);
            if(!chek) {
                System.out.println("Tên Không Chứa Ký Tự Hoặc Số :");
            }
        }while (!chek);
        return name;
    }

    public int inputPriceDrink() {
        int price;

        do{
            try{
                System.out.println("Nhập Giá :");
                price = input.nextInt();
                break;

            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                input.nextLine();
            }
        }while (true);
        return price;
    }

    public String inputNameCustomer() {
        boolean chek;
        String inputName;
        do{
            System.out.println("Nhập Tên : ");
            inputName = input.next();
            String namePattern = "^[a-zA-Z\\s]+";
            chek = inputName.matches(namePattern);
            if(!chek){
                System.err.println("Tên Không Hợp Lệ : ");
            }
        }while(!chek);
        return inputName;
    }

    public String inputPhone() {
        boolean flag;
        String inputPhone;
        do {
            System.out.print("Nhập Số Điện Thoại: ");
            String phonePattern = "^0[0-9]{9}$";
            inputPhone = input.next();
            flag = inputPhone.matches(phonePattern);
            if (!flag) System.out.println("Số Điên Thoại Bắt Đầu Bằng Số 0 Và Gồm 10 Số");
        } while (!flag);
        return inputPhone;
    }

    public String inputAdress() {
        boolean flag;
        String inputAddress;
        do {
            System.out.print("Nhập Địa Chỉ : ");
            String phonePattern = "^[0-9]{3}+[a-zA-Z]+";
            inputAddress = input.next();
            flag = inputAddress.matches(phonePattern);
            if (!flag) System.out.println("Địa Chỉ Không Hợp Lệ :");
        } while (!flag);
        return inputAddress;
    }

    public int inputQuantity() {
        int inputQuantity;
        do{

            try{
                System.out.println("Nhập Số Lượng");
                inputQuantity = input.nextInt();
                if(inputQuantity > 0 && inputQuantity <= 20) break;
                else System.out.println("Bạn Nhập Quá số Lượng Cho Phép :");
            }catch (Exception e) {
                System.out.println("Bạn Nhập Sai Định Dạng :");
            }finally {
                input.nextLine();
            }
        }while (true);
        return inputQuantity;
    }

    public int inputIdCustomer() {
        int inputId;
        do{
            try{
                System.out.println("Nhập Id Khách Hàng :");
                inputId = input.nextInt();
                for(Customer customer : Data.listCustomers) {
                    if(customer.getIdCustomer() == inputId) {
                        return inputId;
                    }
                }
            }catch (Exception e) {
                System.out.println("Bạn Nhập Sai Định Dạng");
            }finally {
                input.nextLine();
            }
        }while (true);
    }



    public boolean chekNext() {
        String chekNext;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("Nhấn 1 để Tiếp Tục Chọn 2 Để Hoàn Thành :");
            chekNext = input.next();

            if(chekNext.equals("1")) {
                return true;
            }else if(chekNext.equals("2")) {
                return  false;
            }else
                System.err.println("Nhập Lại Lựa Chọn : ");
        }
    }
    



}
