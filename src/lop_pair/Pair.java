package lop_pair;

public class Pair {
    private int firt, secont;

    public Pair(int firt, int secont) {
        this.firt = firt;
        this.secont = secont;
    }

    @Override
    public String toString() {
        return firt+ " "+secont;
    }

    public boolean isPrime() {
        return check(firt) && check(secont);
    }

    private boolean check(int n){
        if (n<2) return false;
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
