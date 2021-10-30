package lietkesvtheonganh;

public class SinhVien {
    private String ma, ten, lop, email, maNganh;


    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.maNganh =getMaTheoTen();
    }

    @Override
    public String toString() {
        return ma +" "+ten+" "+lop+" "+email;
    }

    private String getMaTheoTen(){
        String s= this.ma;
        String t="";
        if (s.contains("DCKT")){
            t="Ke toan";
        }else if (s.contains("DCCN") && !lop.startsWith("E")){
            t="Cong nghe thong tin";
        }else if (s.contains("DCAT") && !lop.startsWith("E")){
            t="An toan thong tin";
        }else if (s.contains("DCVT")){
            t= "Vien thong";
        }else if (s.contains("DCDT")){
            t= "Dien tu";
        }
        return t;
    }

    public String getMaNganh() {
        return maNganh;
    }
}
