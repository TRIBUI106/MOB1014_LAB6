package lab6;

import java.util.ArrayList;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<DanhSachSV> list = new ArrayList<DanhSachSV>();
        DanhSachSV ds = new DanhSachSV();

//        Nhập
        for(int i = 0; i < 5; i++){
            System.out.println("Nhập Dữ Liệu Sinh Viên Thứ " + (i+1));
            ds.nhap();
            System.out.println("Đã Nhập Xong Sinh Viên Thứ " + (i+1));
            System.out.println();
        }

    }
}
