package BaiToanTinhCong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien nhanVien= new NhanVien(1,in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()), in.nextLine());
        nhanVien.tinhLuong();
        System.out.println(nhanVien);

    }
}
