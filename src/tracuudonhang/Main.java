package tracuudonhang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        while (n-->0){
            DonHang donHang= new DonHang(in.nextLine(),in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            donHang.tinhGiaTien();
            System.out.println(donHang);
        }
    }
}
