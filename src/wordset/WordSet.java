/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordset;

import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class WordSet {

    private TreeSet<String> set = new TreeSet<>();

    public WordSet() {

    }

    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for (String i : set) {
            kq = kq + i + " ";
        }
        return kq.trim();
    }

    public WordSet union(WordSet s2) {
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.addAll(s2.set);
        return u;
    }

    public WordSet intersection(WordSet s2) {
        WordSet i = new WordSet();
        i.set.addAll(set);
        i.set.retainAll(s2.set);
        return i;
    }

}
