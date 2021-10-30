package thunhapgiaovien;

public class GiaoVien {
    private String ma, ten;
    private long luongcoban, bacluong, phucap, luong;

    public GiaoVien(String ma, String ten, Long luongcoban) {
        this.ma = ma;
        this.ten = ten;
        this.luongcoban = luongcoban;
    }

    public void tinhLuong(){
        String pc= ma.substring(0,2);
        this.bacluong= Long.parseLong(ma.substring(2,4));
        switch (pc){
            case "HT": this.phucap=2000000;
            break;
            case "HP": this.phucap=900000;
                break;
            default: this.phucap=500000;
        }

        this.luong= this.bacluong*this.luongcoban + this.phucap;
    }

    @Override
    public String toString() {
        return ma+" "+ten+ " "+ bacluong+ " "+phucap+" "+luong;
    }
}
