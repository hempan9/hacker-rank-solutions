import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalOrderString {
    public static void main(String[] args) {
       System.out.println( getSmallestAndLargest("welcometojava", 3));
        
    }
    // public static String getSmallestAndLargest(String s, int k) {
    //     String smallest = "";
    //     String largest = "";
    //     int size=1;
    //     String res = "";
    //     for (int i = 0; i < s.length(); i++) {
    //         for (int j = i+1; j < s.length(); j++) {
    //             if(s.substring(i, j+1).length()==3){
    //                 res+=s.substring(i, j+1)+", ";
    //             }
    //         }
    //     }

    //     return res;
    // }
    



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        return smallest + "\n" + largest;
    }
}
