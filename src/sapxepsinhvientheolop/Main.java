package sapxepsinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list= new ArrayList<>();
        while (n-->0){
            SinhVien sinhVien= new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(sinhVien);
        }

        Collections.sort(list);
        for (SinhVien s: list){
            System.out.println(s.toString());
        }
    }
}
