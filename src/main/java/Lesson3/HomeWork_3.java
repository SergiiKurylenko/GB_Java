package Lesson3;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args) {
        first();
        System.out.println();
        second();
        System.out.println();
        therd();
        System.out.println();
        fours();
        for (int var:fifs(5,1)) {
            System.out.print(var);
        }
        System.out.println();
        System.out.println(sixs());
        System.out.println(sevens(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        eights(new int[]{1,2,3,4,5,6,7,8,9,10}, -2);
    }
    public static void first(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                array[i]=1;
            }
            else {
                array[i]=0;
            }
        }
        for (int var:array) {
            System.out.print(var);
        }
    }
    public static void second(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
        for (int var:array) {
            System.out.print(var + ", ");
        }
    }
    public static void therd(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i]<6){
                array[i]*=2;
            }
        }
        for (int var:array) {
            System.out.print(var + ", ");
        }
    }
    public static void fours(){
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i==j)||(i+j== array.length-1)){
                    array[i][j]=1;
                }
            }
        }
        for (int [] k :array){
            for(int i: k){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static int[] fifs(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i]=initialValue;
        }
        return array;
    }
    public static String sixs(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        String sMin=Integer.toString(min);
        String sMax=Integer.toString(max);
        return "Минимальное: "+sMin +" Максимальное: "+ sMax;
    }
    public static boolean sevens(int[] array){
        int left = 0;
        int right = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (i < j + 1) {
                    left += array[i];
                } else {
                    right += array[i];
                }
            }
            if (left==right) return true;
            left =0;
            right =0;
        }
        return false;
    }
    public static void eights(int[] array, int n){
        if (n<0) {
            for (int i = 0; i > n; i--) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int temp = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
        }
        for (int var:array) {
            System.out.print(var + " ");
        }
    }
}

