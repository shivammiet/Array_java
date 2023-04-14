import java.util.*;
public class remDuplicateArray {
    static int remDupr(int arr [], int n){
        int res =1;
        for(int i =1; i <arr.length; i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
            res++;
        }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr [] = {2,2,2,2,2,2,4,4,3,3};
        int n = 10;
        System.out.println("befre ooperation");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        n=remDupr(arr, n);
        System.out.println("after operation");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

}

    