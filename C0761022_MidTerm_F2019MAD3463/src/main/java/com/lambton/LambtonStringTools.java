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
       // System.out.println(Integer.parseInt(s,2));
        int binaryNumber =Integer.parseInt(s);
        int decimal = 0;
        int p = 0;
        while(true){
            if(binaryNumber == 0){
                break;
            } else {
                int temp = binaryNumber%10;
                decimal += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
      //  return decimal;

        System.out.println("output"+decimal);
    }

    public void initials(String s)
    {
        String[] splited = s.split("\\s+");

        if(splited.length == 3)
        {
            System.out.println(splited[0].substring(0,1).toUpperCase()+"."+splited[1].substring(0,1).toUpperCase()+"."+splited[2].substring(0,1).toUpperCase() + splited[2].substring(1).toLowerCase() ); // char at index 0
        }
        else
        {
            System.out.println("null");
        }
    }

    public void mostFrequent(String s)
    {
//        int len = s.length();
//        int max = 0;  // Initialize max count
//        char result;   // Initialize result
//
//        // Traversing through the string and maintaining
//        // the count of each character
//        for (int i = 0; i < len; i++) {
//            count[str[i]]++;
//            if (max < count[str[i]]) {
//                max = count[str[i]];
//                result = str[i];
//            }
//        }
//
//        return result;

    }

    public void replaceSubString(String s1, String s2, String s3)
    {

    }
}
