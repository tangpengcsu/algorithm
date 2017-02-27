package com.tang;

public class Main {


    public static void main(String[] args) {
        // write your code here
    }


}

class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j = 0; j<nElems;j++){
            System.out.print(a[j]+ " ");
        }
        System.out.println("");
    }

}

