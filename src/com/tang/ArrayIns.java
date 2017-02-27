package com.tang;

/**
 * @Author TangPeng
 * @Date 2017-2-27
 */
public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    /**
     * 冒泡排序
     */
    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public void selectionSort() {
        int in, out, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }

            }
            swap(out, min);
        }
    }

    public void test() {
        int in,out,min;
        for(out=0;out<nElems-1;out++){
            min=out;
            for(in=out+1;in<nElems;in++){
                if(a[in]<a[min]){
                    min=in;
                }
            }
            swap(out,min);
        }

    }

    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    /**
     * 插入排序
     */
    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] > temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);

        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        arr.insert(22);
        arr.insert(76);

        arr.insertionSort();
        arr.display();
    }

}
