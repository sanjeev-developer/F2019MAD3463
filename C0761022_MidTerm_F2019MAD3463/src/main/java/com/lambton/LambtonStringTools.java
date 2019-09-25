package com.lambton;

public class LambtonStringTools
{
    public void reverse(String s)
    {
        int length = s.length();
        String reverse="";

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + s.charAt(i);

        System.out.println("Reversed String = "+reverse);
    }

    public void binaryToDecimal(String s)
    {
        System.out.println(Integer.parseInt(s,2));
    }

  
    public void mostFrequent(String s)
    {

    }

    public void replaceSubString(String s1, String s2, String s3)
    {

    }
}
