package lietketheolopsinhvien;

public class SinhVien {
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma+" "+ten+ " "+ lop+" "+ email;
    }

    public String getLop() {
        return lop;
    }
}
