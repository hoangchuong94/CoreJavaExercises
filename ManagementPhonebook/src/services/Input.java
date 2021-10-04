package services;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    public String inputName() {
        String inputName;
        boolean chek;
        do{
            System.out.print("Nhập Tên : ");
            inputName = scanner.next();
            String regex = "^[a-z0-9_-]{6,12}$";
            chek = inputName.matches(regex);
            if(!chek) {
                System.out.println("Độ Dài Từ 6 --> 12 Không Chứa số :");
            }
        }while (!chek);
        return inputName;
    }

    public String inputPhone() {
        boolean flag;
        String inputPhone;
        do {
            System.out.print("Nhập Số Điện Thoại: ");
            String phonePattern = "^0[0-9]{9}$";
            inputPhone = scanner.next();
            flag = inputPhone.matches(phonePattern);
            if (!flag) System.out.println("Số Điên Thoại Bắt Đầu Bằng Số 0 Và Gồm 10 Số");
        } while (!flag);
        return inputPhone;
    }

    public String inputEmail() {

        boolean flag;
        String inputEmail;
        do {
            System.out.print("Nhập Email : ");
            String phonePattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            inputEmail = scanner.next();
            flag = inputEmail.matches(phonePattern);
            if (!flag) System.out.println("Emai Có Định Dang @ :");
        } while (!flag);
        return inputEmail;
    }

    public String inputGruop() {
        System.out.print("Nhập Nhóm Danh Bạ :");
        String inputGroup;

        inputGroup= scanner.nextLine();
        return inputGroup;
    }

    public String inputSex() {
        scanner.nextLine();
        System.out.print("Nhập Giới Tính :");
        String inputSex;
        inputSex = scanner.nextLine();

        return inputSex;
    }

    public String inputAddress() {


        String inputSex = scanner.nextLine();
        return inputSex;
    }


    public String inputBrithday() {
        System.out.print("Nhạp Ngày Sinh :");
        String inputBrithday;
        inputBrithday = scanner.nextLine();
        return inputBrithday;
    }

    public boolean chekNext() {
        String chekNext;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("Bạn Có Muống Lưu Thay Đổi Không : ");
            System.out.println("Chọn Y để Tiếp Tục / Chọn N Để Thoát :");
            chekNext = scanner.next();

            if(chekNext.equals("Y")) {
                return true;
            }else if(chekNext.equals("N")) {
                return  false;
            }else
                System.err.println("Nhập Lại Lựa Chọn : ");
        }
    }



}
