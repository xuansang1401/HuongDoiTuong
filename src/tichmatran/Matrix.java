/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tichmatran;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Matrix {
    public int m, n;
    public long [][]mat;

    public Matrix(int n, int m) {
        this.m = m;
        this.n = n;
        this.mat = new long[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = Long.parseLong(sc.next());
            }
        }
    }

    @Override
    public String toString() {
        String tmp = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                tmp = tmp + mat[i][j] + " ";
            }
            tmp += "\n";
        }
        StringBuilder rb = new StringBuilder(tmp);
        rb.deleteCharAt(tmp.length() - 1);
        return rb.toString().trim();
    }
    
    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(this.n, b.m);
        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < b.m; j++) {
                res.mat[i][j] = 0;
                for (int k = 0; k < b.n; k++){
                    res.mat[i][j] =  res.mat[i][j] +  mat[i][k]* b.mat[k][j];
                } 
            }
        }
        return res;
    }
    
    
    
}
