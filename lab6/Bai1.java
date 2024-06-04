package lab6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Nhập họ & tên : ");
        String hoTen = sc.nextLine();
        System.out.println();
        if (hoTen.lastIndexOf(" ") == hoTen.length() - 1) {
            System.out.println("Không được kết thúc nhập bằng khoảng trống !");
        } else {
            showAns(hoTen);
        }

    }

    public static void showAns(String hoTen) {

        // Work
        String ho = hoTen.substring(0,hoTen.indexOf(" "));
        String dem = hoTen.substring(hoTen.indexOf(" ")+1,hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ")+1);

        ho = ho.toUpperCase();
        ten = ten.toUpperCase();

        // Print
        System.out.println("Họ : " + ho);
        System.out.println("Đệm : " + dem);
        System.out.println("Tên : " + ten);
    }
}
