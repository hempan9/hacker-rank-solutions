package com.hackerranck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static char maximumOccurringCharacter(String text) {
        char[] carr = text.toCharArray();
        // Write your code here
            List<Character> list = new ArrayList<>();
             for (char i = 'a'; i <='z'; i++) {
                list.add(i);             
             }
             for (char i = 'A'; i <= 'Z'; i++) {
                list.add(i);             
             } for (char i = '0'; i <= '9'; i++) {
                list.add(i);             
             }
             System.out.println("list"+list);
            int count =0;
            int c =0;
             Map<Integer, Character> listCount = new HashMap<>();
            for(int i = 0 ; i<text.length();i++){
                for (int j = 0; j < list.size(); j++) {
                    if(carr[i]==list.get(j));
                    count+=1;
                }
                System.out.println(c);
                listCount.put(count,text.charAt(i));
            }
            System.out.println(listCount);
            return 0;
        }
    

    public static void main(String[] args) {
        maximumOccurringCharacter("hello");
    }
}
