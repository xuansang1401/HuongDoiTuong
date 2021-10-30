package DanhSachSV2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaysinh;
    private Float gpa;

    public SinhVien() {
    }

    public void setMa(int id) {
        this.ma = "B20DCCN" + String.format("%03d", id);
    }

    public void setTen(String ten) {
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(ten);
        while (st.hasMoreTokens()) {
            String t = st.nextToken();

            kq = kq.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
            this.ten = kq.toString().trim();

        }
    }


    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNgaysinh(String ngaysinh) throws ParseException {
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " "
                + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
}
