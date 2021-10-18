package phanso;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau){
        this.tu= tu;
        this.mau= mau;
    }

    @Override
    public String toString() {
        return tu+"/"+mau;
    }

    public void rutGon(){
        long x= usc(tu, mau);
        tu/=x;
        mau/=x;
    }

    public static long usc(long a, long b) {
        long t;
        while (b>0){
            t=a%b;
            a=b; b=t;
        }
        return a;
    }
}
