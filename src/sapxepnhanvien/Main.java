package sapxepnhanvien;

import java.text.ParseException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> ds= new ArrayList<>();
        int n= Integer.parseInt(in.nextLine());
        for (int i=1; i<=n;i++){
            NhanVien nv= new NhanVien(i, in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            ds.add(nv);
        }
        Collections.sort(ds);
        for (NhanVien v: ds){
            System.out.println(v);
        }
    }
}
