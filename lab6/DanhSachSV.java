package lab6;

import java.util.Scanner;

public class DanhSachSV {
    public String hoTen;
    public String email;
    public String SDT;
    public String CMND;

    public String patternEmail = "\\w+@\\w+\\.\\w+";
    public String patternSDT = "0\\d{9,10}";
    public String patternCMND = "\\d{9}";

    public void nhap() {
        Scanner sc = new Scanner(System.in);

//        pattern | [ các kí tự cho phép nhập ] { số lần được lặp lại kí tự }

        System.out.println("Nhập vào Họ Tên : ");
        System.out.print(">> ");
        hoTen = sc.nextLine();

        System.out.println("Nhập vào Email : ");
        System.out.print(">> ");
        email = sc.nextLine();
        if (!email.matches(patternEmail)) {
            System.out.println("Đã nhập sai Email !");
        }

        System.out.println("Nhập vào SDT : ");
        System.out.print(">> ");
        SDT = sc.nextLine();
        if (!SDT.matches(patternSDT)) {
            System.out.println("Đã nhập sai SDT !");
        }

        System.out.println("Nhập vào CMND : ");
        System.out.print(">> ");
        CMND = sc.nextLine();
        if (!CMND.matches(patternCMND)) {
            System.out.println("Đã nhập sai CMND !");
        }
    }

    public String CMND2;
    public String patternCMND2 = "\\d{9,12}";

    public void nhapBai4() {
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập vào CMND : ");
            System.out.print(">> ");
            CMND2 = sc.nextLine();


            if (CMND2.matches(patternCMND2)) {
                System.out.println("CMND vừa nhập có đủ từ 9 tới 12 kí tự");
            } else {
                System.out.println("CMND vừa nhập không đủ từ 9 tới 12 kí tự");
            }

            int CMNDafter = Integer.parseInt(CMND2);
            System.out.println("Chuyển chuỗi sang số thành công !\n Giá trị : " + CMNDafter);

        } catch (Exception e) {
            System.err.println("Lỗi xảy ra: Giá trị nhập vào không chỉ có số");
        }
    }
}
