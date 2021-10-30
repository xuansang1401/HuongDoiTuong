package DanhSachSV2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> ds= new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());

        for (int i=1; i<=n; i++){
            SinhVien sinhVien=new SinhVien();
            sinhVien.setMa(i);
            sinhVien.setTen(in.nextLine());
            sinhVien.setLop(in.nextLine());
            sinhVien.setNgaysinh(in.nextLine());
            sinhVien.setGpa(Float.parseFloat(in.nextLine()));
            ds.add(sinhVien);
        }

        for (SinhVien s: ds){
            System.out.println(s);
        }
    }
}
