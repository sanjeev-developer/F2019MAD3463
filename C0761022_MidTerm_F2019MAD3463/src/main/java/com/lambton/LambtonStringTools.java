package com.lambton;

public class LambtonStringTools {
    public String reverse(String s) {
        int length = s.length();
        String reverse = "";

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + s.charAt(i);
        return reverse;

    }

    public int binaryToDecimal(String s) {
        // System.out.println(Integer.parseInt(s,2));
        int binaryNumber = Integer.parseInt(s);
        int decimal = 0;
        int p = 0;

        try
        {
            while (true) {
                if (binaryNumber == 0) {
                    break;
                } else {
                    int temp = binaryNumber % 10;
                    decimal += temp * Math.pow(2, p);
                    binaryNumber = binaryNumber / 10;
                    p++;
                }
            }
            //  return decimal;

        }
        catch (Exception e)
        {

        }
        return decimal;
    }

    public String initials(String s) {
        String[] splited = s.split("\\s+");

        if (splited.length == 3) {
            return splited[0].substring(0, 1).toUpperCase() + "." + splited[1].substring(0, 1).toUpperCase() + "." + splited[2].substring(0, 1).toUpperCase() + splited[2].substring(1).toLowerCase();
        } else {
            return "null";
        }
    }

    public char mostFrequent(String s) {
        String removedspace = s.replaceAll("\\s", "");
        int highestFreq = 0;
        char mostFreqChar = ' ';
        for (int i = 0; i < removedspace.length(); i++) {
            //Get a char and go through entire string to determine how many times that char occurs
            char x = removedspace.charAt(i);
            int c = 0;
            for (int j = removedspace.indexOf(x); j != -1; j = removedspace.indexOf(x, j + 1)) {
                c++;
            }
            if (c > highestFreq) {
                highestFreq = c;
                mostFreqChar = x;
            }
        }
        return mostFreqChar;
    }


    public String replaceSubString(String s1, String s2, String s3) {

         String str = s1.toLowerCase();
         String second = s2.toLowerCase();
         String third =s3.toLowerCase();
//
//        return str.replace(s2, s3);

        String[] arr = str.split(second);
        StringBuilder output = new StringBuilder();

        int i = 0;
        for (; i < arr.length - 1; i++)
            output.append(arr[i]).append(third);

        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + second))
            output.append(third);

        return output.toString();

    }
}
