package com.company;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(pivovkusnoe(3, 2)));
        second();
    }

    private static Random rand = new Random();

    //classwork
    private static void odnomernyyMassiv(){
        int[] ints = {1, 2, 6, 3, 4};
        System.out.println(Arrays.stream(ints).max());
        System.out.println(Arrays.stream(ints).min());
    }

    private static void somemassive(){
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (var i = 0; i < numbers.length; i++){
            if (numbers[i] == 1){
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void somemassive2(){
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("old " + Arrays.stream(numbers).sum());
        for (var i = 0; i < numbers.length; i++){
            if (numbers[i] < 6) numbers[i] = numbers[i] * 2;
        }
        System.out.println("new " + Arrays.stream(numbers).sum());
    }

    private static void zaluzalu(){
        int[][] num = new int[3][3];
        num[0][0] = 1;
        num[1][1] = 1;
        num[2][2] = 1;
        num[0][1] = 0;
        num[1][2] = 0;
        num[2][0] = 1;
        num[1][0] = 0;
        num[2][1] = 0;
        num[0][2] = 1;
        for (var i = 0; i < num.length; i++){
            for (var a = 0; a < num.length; a++){
                System.out.print(" " + num[i][a] + " ");
            }
            System.out.println();
        }

    }

    private static int[] pivovkusnoe(Integer len, Integer initialValue){
        int[] numbers = new int[len];
        for (var i = 0; i < numbers.length; i++){
            numbers[i] = initialValue;
        }
        return numbers;
    }

//HomeWork

    private static void first(){
        int[] array = new int[5];
        for (var a = 0; a < array.length; a++){
            array[a] = rand.nextInt(100);
        }
        for (var a = 0; a < array.length; a++){
            System.out.println(a + " " + array[a]);
        }
    }

    private static void second(){
        String[] aboba = {"gdfgdfgdfg", "sadgf", "q423124gsdfg"};
        for (var i = 0; i < aboba.length; i++){
            int[] arraysbyint = {aboba[i].length()};
            Arrays.sort(arraysbyint);
        }
    }

    private static void LettersInArray(){
        byte[] letters = new byte[26];
        for (int i = 0; i < letters.length; i++){
            letters[i] = (byte) (97 + i);
        }
        for (int i = 0; i < letters.length; i++){
            System.out.print((char) + letters[i] + " , ");
        }
        for (int h = 0; h < letters.length; h++){
            letters[h] = (byte) (65 + h);
        }
        System.out.println();
        for (int h = 0; h < letters.length; h++){
            System.out.print((char) + letters[h] + " , ");
        }
    }


    private static void bivariateArray() {
        int[][] Two = new int[3][3];
        for (int i = 0; i < Two.length; i++) {
            for (int k = 0; k < Two.length; k++) {
                Two[i][k] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < Two.length; i++) {
            for (int k = 0; k < Two.length; k++) {
                System.out.print(" " + Two[k][i] + "  ");
            }
            System.out.println();
        }
    }
}
