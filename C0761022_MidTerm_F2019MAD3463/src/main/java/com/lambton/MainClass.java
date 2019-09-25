package com.lambton;

public class MainClass {

    public static void main(String args[]) {

        LambtonStringTools lambtonStringTools = new LambtonStringTools();

        System.out.println(lambtonStringTools.reverse("Lambton"));
        System.out.println(lambtonStringTools.binaryToDecimal("10000"));
        System.out.println(lambtonStringTools.initials("James tiBeriUs kiRK"));
        System.out.println("momostFreqCharst = "+ lambtonStringTools.mostFrequent("aaaaaabbbbbbbccccceee"));
    }
}
