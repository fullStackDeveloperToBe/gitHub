package com.java.doubt.check;

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "((@(*^&&*@(@(*#*!*@(((%@$@a((#*@(&$*@@&#(*$(@$";
        String str_removed = "";
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                count++;
                System.out.print(str.charAt(i));
            }
            else {
                str_removed = str_removed + str.charAt(i);
            }
        }
        System.out.println("");
        if(count == 0) {
            System.out.println("there is no special character");
        }
        else {
            System.out.println("there is special character "+str_removed);
        }
    }
}
