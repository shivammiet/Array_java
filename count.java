import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class count {
   public static void count(int arr[], int n){
        int odd=0;
        int even =0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else
            odd++;
        }
        System.out.println(even +" "+ odd);
    }

        public static void main(String[] args) {
        int arr[] = {1 ,3,4,5,67,8};
        int n = arr.length;
        count(arr, n);
        }
    }
        
  

        

    

