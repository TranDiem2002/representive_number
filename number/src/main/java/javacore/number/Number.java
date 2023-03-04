/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package javacore.number;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Number {
    
    // cộng số đã tìm được ở mảng them 1 đơn vị và luu từng chữ số vào mảng
    public static void numbes(int a){
     a = a+1;
     List<Integer> arr = new ArrayList<>();
       while(a!=0){
          arr.add((Integer) a%10);
           a = a /10;
       }
       int[] b = new int[arr.size()];
       int j=0;
        for (int i = arr.size()-1; i>=0; i--) {
            b[j++] = arr.get(i);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ ", ");
        }
    }
    
    // từ mảng đã cho ta tính được ra số nguyên tương ứng([1,2,3]=123)
    public static int splitNumber(int[] arr){
        int n = arr.length;
        int a = 0;
        for (int i = 0; i< n; i++) {
           a += (int)(arr[i]*Math.pow(10.0,(double)n-1-i));
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {9,9};
        int n = arr.length;
        int a = splitNumber(arr);
        System.out.println(a);
        numbes(a);
    }
}
