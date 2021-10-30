package BaiToanTinhCong;

public class NhanVien {
    private String ma , ten;
    private long luongMoiNgay, soNgay, luongThang, thuong, phuCap, thuNhap;
    private String chucVu;

    public NhanVien(int id, String ten, long luongMoiNgay, long soNgay, String chucVu) {
        this.ma ="NV"+ String.format("%02d",id);
        this.ten = ten;
        this.luongMoiNgay = luongMoiNgay;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return ma+" "+ten+ " "+luongThang+" "+thuong+" "+phuCap+ " "+thuNhap;
    }

    public void tinhLuong(){

        this.luongThang = luongMoiNgay*soNgay;
        long t=0;
        if (soNgay>=25){
            t=2;
        }else if (soNgay>=22){
            t=1;
        }
        this.thuong = luongThang/10*t;
        this.phuCap= getPhuCap();
        this.thuNhap= luongThang+thuong+phuCap;
    }

    private long getPhuCap() {
        long t=1;
        if (chucVu.equals("GD")){
            t=250000;
        }else if (chucVu.equals("PGD")){
            t=200000;
        }else if (chucVu.equals("TP")){
            t=180000;
        }else if (chucVu.equals("NV")){
            t=150000;
        }

        return t;
    }
}
