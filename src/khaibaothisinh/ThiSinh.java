package khaibaothisinh;

public class ThiSinh {
    private String ten, ngaySinh;
    private float d1, d2 ,d3,tong;

    public ThiSinh(String ten, String ngaySinh, float d1, float d2, float d3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong=this.d1+this.d2+this.d3;
    }

    @Override
    public String toString() {
        return ten+ " "+ ngaySinh+" "+String.format("%.1f",tong);
    }
}
