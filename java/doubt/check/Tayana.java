package com.java.doubt.check;

public class Tayana {
    public static void main(String[] args) {
        String str = "Java@";
        String str_removed = "";
        int letterCount = 0, digitCount = 0;
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i))) {
                letterCount++;
            }
            else if(Character.isLetter(str.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("");
        System.out.println(letterCount+" - "+digitCount);
        if(letterCount>=1 && digitCount>=1) {
            System.out.println("Valid String");
        }
        else {
            System.out.println("Invalid String");
        }
        for(int k=05;k>0;k--) {
            System.out.println("for"+k);
        }
    }
}
