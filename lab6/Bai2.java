package lab6;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<SanPham> DanhSach = new ArrayList<SanPham>();
        System.out.println();

//        Nhập
        System.out.println("Nhập");
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham(null, (double)0, null);
            System.out.println("Nhập lần lượt tên, giá, hãng của Sản Phẩm : ");
            sp.nhap();
            System.out.println();
            DanhSach.add(sp);
        }

//        Xuất
        System.out.println("\nCác Sản Phẩm Có Hãng Nokia");
        for ( SanPham sanPham : DanhSach) {
            if ( sanPham.hang.equalsIgnoreCase("Nokia")) {
                System.out.println("Tên : " + sanPham.tenSp);
                System.out.println("Giá : " + sanPham.gia);
                System.out.println("Hãng : " + sanPham.hang);
                System.out.println();
            }
        }

    }
}
