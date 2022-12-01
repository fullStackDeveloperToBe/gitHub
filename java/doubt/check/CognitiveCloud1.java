package com.java.doubt.check;

public class CognitiveCloud1 {

    static int count=0;
    public void CognitiveCloud1() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CognitiveCloud1 c1 = new CognitiveCloud1();
        CognitiveCloud1 c2 = new CognitiveCloud1();
        CognitiveCloud1 c3 = new CognitiveCloud1();
    }
}
