package lietkesvtheonganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> list= new ArrayList<>();
         while (n-->0){
            SinhVien sinhVien= new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(sinhVien);
        }
         int k = Integer.parseInt(in.nextLine());
         String ss[] = new String[k];
         for (int i=0; i<k;i++){
             ss[i]=in.nextLine();
         }

         for (int i=0;i<k;i++){
             String t= ss[i];
             int count=0;
             for (SinhVien s: list){
                 if (count==0) System.out.println("DANH SACH SINH VIEN NGANH "+t.toUpperCase()+":");

                 if (t.equals(s.getMaNganh())){
                     System.out.println(s);
                 }
                 count++;
             }
         }

    }
}
