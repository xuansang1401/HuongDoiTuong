package tinhgio;

import java.text.*;
import java.util.*;

public class GameThu implements Comparable<GameThu>{
    private String ma, ten, time;
    private Date giovao, giora;
    private Date thgian;


    public GameThu(String ma, String ten, String giovao, String giora) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.giovao = new SimpleDateFormat("HH:mm").parse(giovao);
        this.giora = new SimpleDateFormat("HH:mm").parse(giora);
        this.thgian=getThoiGian();
    }

    private Date getThoiGian() {
        long tvao= this.giovao.getTime();
        long tra= this.giora.getTime();
        long k = tra - tvao;
        long seconds=k/1000;
//        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        Date d= new Date(k);

        String kq= h+" gio "+m+" phut";
//        String formatted = format.format(k);
//        System.out.println(formatted);
        this.time=kq;
        return d;
    }

    @Override
    public String toString() {
        return ma+" "+ten+ " "+(time);

    }

    @Override
    public int compareTo(GameThu o) {
        return o.thgian.compareTo(this.thgian);
    }
}
