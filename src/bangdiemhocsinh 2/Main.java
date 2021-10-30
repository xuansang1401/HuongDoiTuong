/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemhocsinh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        
        for(int i = 1; i <= n; i++){
            HocSinh a = new HocSinh(i, in.nextLine() , Double.parseDouble(in.next()), Double.parseDouble(in.next()), Double.parseDouble(in.next())
                                                     , Double.parseDouble(in.next()), Double.parseDouble(in.next()), Double.parseDouble(in.next())
                                                     , Double.parseDouble(in.next()), Double.parseDouble(in.next()), Double.parseDouble(in.next())
                                                     , Double.parseDouble(in.nextLine()));
            ds.add(a);
        }
        
        Collections.sort(ds);
        for(HocSinh tmp : ds){
            System.out.println(tmp);
        }
    }

}
