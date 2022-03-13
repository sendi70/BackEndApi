package com.company;

public class Ex1 {
    int searchIndex(int[] arr, int value){
        int index=0;
        var limit= arr.length-1;
        while (index<=limit){
            int point= (int) Math.ceil((index+limit)/2);
            int entry=arr[point];
            if (value>entry){
                index=point+1;
                continue;
            }
            if (value<entry){
                limit=point-1;
                continue;
            }
            return point;
        }
        return -1;
    }
}
