package com.LinkedList;

public class Recursion{

    public static boolean isArraySorted(int[] array , int index){
        if(index==array.length-1){
            return true;
        }
        if(array[index] <= array[index+1] && isArraySorted(array,index+1)){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        int[] array = new int[]{1,1};
        System.out.println(isArraySorted(array,0));
    }
}
