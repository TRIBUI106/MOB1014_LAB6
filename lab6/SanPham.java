package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {

    public String tenSp;
    public Double gia;
    public String hang;


    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        tenSp = sc.nextLine();
        System.out.print(">> ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.print(">> ");
        hang = sc.nextLine();
    }

    public SanPham(String tenSp, Double gia, String hang) {
        this.tenSp = tenSp;
        this.gia = gia;
        this.hang = hang;
    }

    public void xuat() {
            System.out.println(tenSp);
            System.out.println(gia);
            System.out.println(hang);

//        for ( int i = 0 ; i < 5 ; i++ ) {
//            System.out.println(Sp.get(i).tenSp);
//            System.out.println(Sp.get(i).gia);
//            System.out.println(Sp.get(i).hang);
//        }
    }

}
