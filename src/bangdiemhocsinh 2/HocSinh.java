/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangdiemhocsinh;

/**
 *
 * @author Admin
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ma, ten;
    double toan, tiengviet, ngoaingu, ly, hoa, sinh, su, dia, gdcd, congnghe;
    double tb;
    int id;
    public HocSinh(int id, String ten, double toan,  double tiengviet,  double ngoaingu,  double ly,  double hoa,  double sinh,  double su,  double dia,  double gdcd,  double congnghe) {
        this.id = id;
        this.ma = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.toan = toan;
        this.tiengviet = tiengviet;
        this.ngoaingu = ngoaingu;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.congnghe = congnghe;
        this.tb =(double) Math.round(diemtb() * 10) /10;
        
    }

    public double diemtb(){
        return (((this.toan + this.tiengviet) * 2 + this.ngoaingu + this.ly + this.hoa + this.sinh + this.su + this.dia + this.gdcd + this.congnghe) / 12);
    }

    public String xeploai(double tb){
        if(tb >= 9){
            return "XUAT SAC";
        }
        else if (tb >= 8 && tb <=8.9){
            return "GIOI";
        }
        else if(tb >= 7 && tb <= 7.9){
            return "KHA";
        }
        else if(tb >= 5 && tb <= 6.9){
            return "TB";
        }
        else{
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + String.format("%.1f", tb) + " " + xeploai(tb);
    }
    
    
    
    
    @Override
    public int compareTo(HocSinh o) {
       double t = (o.tb-(this.tb));
       if(t < 0){
           return -1;
       }
       else if (t > 0){
           return 1;
       }
       else{
          return this.id - o.id;
       }
    }
}
