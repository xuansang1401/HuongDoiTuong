package thunhapgiaovien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien giaoVien= new GiaoVien(in.nextLine(),in.nextLine(), in.nextLong());
        giaoVien.tinhLuong();

        System.out.println(giaoVien);
    }
}
