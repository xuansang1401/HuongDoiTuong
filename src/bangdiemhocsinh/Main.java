package bangdiemhocsinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static float f[];
    public static void main(String[] args) {
        ArrayList<HocSinh> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n= Integer.parseInt(in.nextLine());
        for(int i=1; i<=n;i++){
            String ten = in.nextLine();
            System.out.println("ten: "+ten);
            f= new float[11];
            for (int j=0; j<10;j++){
                f[j]=in.nextFloat();
            }
//            in.nextLine();
            HocSinh sin= new HocSinh(i,ten, f[0],f[1],f[2],
                    f[3],f[4],f[5],f[6],f[7],f[8],f[9]);
            sin.diemTB();
            list.add(sin);
        }

        Collections.sort(list);
        for (HocSinh hocSinh: list){
            System.out.println(hocSinh);
        }

    }
}
