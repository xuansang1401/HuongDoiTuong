package tracuudonhang;

public class DonHang {
    private String ten, ma, stt;
    private long dongia, soLuong, giamgia, thanhtien, maGiamGia;

    public DonHang(String ten, String ma, long dongia, long soLuong) {
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soLuong = soLuong;
        this.stt= ma.substring(1,4);
        this.maGiamGia=Long.parseLong(ma.substring(4,5));
    }

    @Override
    public String toString() {
        return ten+" "+ ma+" "+stt+" "+giamgia+" "+thanhtien;
    }
    public void tinhGiaTien(){
        long f=3;
        if (maGiamGia==1){
            f=5;
        }

        this.giamgia= f*dongia*soLuong/10;
        this.thanhtien= soLuong*dongia-giamgia;
    }
}
