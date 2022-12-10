package com.hackerranck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Cores {
    public static long minTime(List<Integer> files, int numCores, int limit) {
        // Write your code here
        long sum = 0;
            
                for (int j = 0; j < files.size(); j++) {
                    int count =0;
                    if(files.get(j)%numCores==0 ){
                        int res =0;
                        count+=1;
                        if (count<=limit) {
                            res = files.get(j)/numCores;
                        }
                        System.out.println(count);
                        sum+=res;    

                    }
                     if(files.get(j)%numCores!=0){
                        sum+=files.get(j);
                    }
                }
        return sum;
        }
 
        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int countVe=0;
            int countNve = 0;
            int countZero = 0;
            int size = arr.size();
            for(int i = 0; i<size;i++){
                if(arr.get(i)>0){
                    countVe+=1;
                }
                System.out.printf("%.06f", ((float)countVe/size));
            }

            }

            public static void miniMaxSum(Integer[] arr) {
                int min =0;
                int max = 0;
                Arrays.sort(arr);
                for (int i = 0; i < arr.length-1; i++) {
                    min+=arr[i];
                }
                for (int i = 1; i < arr.length; i++) {
                    max+=arr[i];
                }
                System.out.println(min+" "+max);
         
         }
        public static void main(String[] args) {
            List<Integer> i = Arrays.asList(5,3,1,5,6);
            Integer[] ii = {5,3,1,5,6};

            //System.out.println(minTime(i, 5, 5));
            //plusMinus(i);
            miniMaxSum(ii);
        }
    
}
