package tinhgio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        ArrayList<GameThu> list= new ArrayList<>();
        int n=Integer.parseInt(in.nextLine());
        while (n-->0){
            GameThu gameThu= new GameThu(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(gameThu);
        }
        Collections.sort(list);
        for (GameThu s: list){
            System.out.println(s);
        }

    }
}
