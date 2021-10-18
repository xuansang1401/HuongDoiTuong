package khaibaosinhvien;

import java.text.ParseException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SinhVien a= new SinhVien(in.nextLine(), in.next(), in.next(), in.nextFloat());
        System.out.println(a);

    }
}
