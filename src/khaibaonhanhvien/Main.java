package khaibaonhanhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in =new Scanner(System.in);

        NhanVien nhanVien= new NhanVien(in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine(),
                in.nextLine());

        System.out.println(nhanVien);
    }
}
