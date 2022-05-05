package com.javapractice;

public class Example {

    // Write a program to find highest occurance of a number in an array

    public static void main(String[] args){
        int[] array={1,2,3,4,5,8,7,3,2,4,2,5,7,8,9,4,2,5,1};
        int count=check(array,100);
        System.out.println(count);

    }

    public static int check(int[] array,int i){
        int count=0;
        for (int j=0; j<array.length;j++){
            if (array[j]==i)
                count+=1;
        }
        return count;
    }

}
