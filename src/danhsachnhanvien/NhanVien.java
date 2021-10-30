package danhsachnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma, ten,gioitinh;
    private Date ngaysinh;
    private String diachi, mathue;
    private Date ngayKy;

    public NhanVien(int id,String ten, String gioitinh, String ngaysinh,
                    String diachi, String mathue, String ngayKy) throws ParseException {
        this.ma= String.format("%05d", id);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.mathue = mathue;
        this.ngayKy = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKy);
    }

    @Override
    public String toString() {
        return ma +" "+ten+ " "+gioitinh+ " "
                + new SimpleDateFormat("dd/MM/yyyy").format(this.ngaysinh)+" "+diachi+" "
                +mathue+ " "+ new SimpleDateFormat("dd/MM/yyyy").format(this.ngayKy);
    }
}
