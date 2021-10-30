package bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma, ten;

    private float toan, tv,nn,vl,hh,sh,ls,d,gdcd,cn, trungbinh;
    private String loai;

    public HocSinh(int id, String ten,
                   float toan, float tv, float nn, float vl,
                   float hh, float sh, float ls, float d, float gdcd, float cn) {
        this.ma = "HS"+String.format("%02d",id);
        this.ten = ten;
        this.toan = toan;
        this.tv = tv;
        this.nn = nn;
        this.vl = vl;
        this.hh = hh;
        this.sh = sh;
        this.ls = ls;
        this.d = d;
        this.gdcd = gdcd;
        this.cn = cn;
    }

    @Override
    public String toString() {
        return ma+" "+ ten+String.format("%.1f",trungbinh)+" "+loai;
    }

    public void diemTB(){
        float s=toan*2+tv*2+ nn+vl+hh+sh+ls+d+gdcd+cn;
        this.trungbinh=s/12;
        if (trungbinh>=9){
            this.loai="XUAT SAC";
        }else  if (trungbinh>=8){
            this.loai="GIOI";
        }else  if (trungbinh>=7){
            this.loai="KHA";
        }else  if (trungbinh>=5){
            this.loai="TB";
        }else {
            this.loai="YEU";
        }

    }

    @Override
    public int compareTo(HocSinh o) {
        float value= o.trungbinh-this.trungbinh;

        int k =(int)value;
        return k;
    }
}
