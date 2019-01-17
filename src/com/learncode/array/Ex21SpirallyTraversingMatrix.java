package com.learncode.array;

public class Ex21SpirallyTraversingMatrix {

    String printSpiral(int[][] a,int m,int n){
        int i = 0;
        int k = 0;//start of m
        int l = 0;//start of n
        StringBuffer str = new StringBuffer();
        while (k<m && l<n){
            for(i=l;i<n;++i){
                str.append(a[k][i]+" ");
            }
            k++;
            for ( i = k; i <m ; ++i) {
                str.append(a[i][n-1]+" ");
            }
            n--;
            if(k<m){
                for ( i = n-1; i >=l ; --i) {
                    str.append(a[m-1][i]+" ");
                }
                m--;
            }
            if(l<n){
                for ( i = m-1; i >=k ; --i) {
                    str.append(a[i][l]+" ");
                }
                l++;
            }
        }
        return str.toString();

    }
}
