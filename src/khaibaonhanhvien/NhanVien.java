package khaibaonhanhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma, ten , gioitinh;
    private Date ngaysinh;
    private String diachi, masothue;
    private Date ngayki;

    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngayki) throws ParseException {
        this.ma="00001";
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayki =  new SimpleDateFormat("dd/MM/yyyy").parse(ngayki);
    }

    @Override
    public String toString() {
        return ma +" "+ ten+" "+gioitinh+ " "+
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaysinh)+" "+
                diachi+ " "+masothue+ " "+
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngayki);
    }
}
