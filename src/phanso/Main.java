package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PhanSo phanSo= new PhanSo(in.nextLong(), in.nextLong());

        phanSo.rutGon();
        System.out.println(phanSo.toString());
    }
}
