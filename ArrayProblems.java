package com.ee.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vishal on 18-08-2016.
 */
public class ArrayProblems {
    public static int hammingDistance(int[] aList, int[] bList){

        System.out.println(Arrays.toString(aList));
        System.out.println(Arrays.toString(bList));
       /* for(int element :aList){
            System.out.println(element);
        }*/
       int count = 0;
        for(int i=0;i<aList.length;i++){
            if(aList[i]!=bList[i]){
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int size;
        System.out.println("Enter the size of the arrays:");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();

        int[] aList = new int[size];      //array objects 1
        int[] bList = new int[size];      //array object 2

        System.out.println("Enter the elements of first array :");
        for(int i = 0;i < size;i++){
            System.out.print("Element "+(i+1)+" : ");
            aList[i] = scan.nextInt();
        }

        System.out.println("Enter the elements of second array :");
        for(int i = 0;i < size;i++){
            System.out.print("Element "+(i+1)+" : ");
            bList[i] = scan.nextInt();
        }
        System.out.println("Hamming Distance :"+hammingDistance(aList,bList));
    }
}
