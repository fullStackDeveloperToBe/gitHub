package com.java.doubt.check;

public class StringOccurance {
    public static void main(String[] args) {
        String str = "Infosys",new_str = "";
        char ch = 's';
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) != ch){
                new_str = new_str +str.charAt(i);
            }
        }
        System.out.print(new_str);
    }
}
