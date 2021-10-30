package lietketheolopsinhvien;

import javax.script.ScriptContext;
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

        String s[]= new String[k];
      for (int i=0; i<k;i++){
          s[i]=in.nextLine();
      }

      for (int i =0; i<k;i++){
          String t= s[i];
          int count =0;
          for (SinhVien sv: list){
              if (sv.getLop().equals(t)){
                  if (count==0) System.out.println("DANH SACH SINH VIEN LOP "+t+":");
                  System.out.println(sv);
                  count++;
              }
          }
      }
    }
}
