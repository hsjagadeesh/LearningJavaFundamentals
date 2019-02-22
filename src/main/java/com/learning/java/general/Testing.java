package com.learning.java.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Testing {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] sentense = line.split(",");
            String sentense1 = sentense[0];
            String sentense2 = sentense[1];
            System.out.println(findCommonSuffix(sentense1, sentense2));
        }
    }

    public static String findCommonSuffix(String string1, String string2) {
        int lengthOfString1 = string1.length();
        int lengthOfString2 = string2.length();

        char[] characterArrayStr1 = string1.toCharArray();
        char[] characterArrayStr2 = string2.toCharArray();

        int index = 0;
        while(characterArrayStr1[lengthOfString1-1] == characterArrayStr2[lengthOfString2-1]) {
            index++;
            if(lengthOfString1 == 0 || lengthOfString2==0) {
                break;
            }
            lengthOfString1--;
            lengthOfString2--;
        }

        String commonSuffix = null;
        //if index = 0 handle this case.
        if(lengthOfString1 > lengthOfString2) {
            commonSuffix = string2.substring(lengthOfString2-index, lengthOfString2);
        } else {
            commonSuffix = string1.substring(lengthOfString1-index, lengthOfString1);
        }

        return commonSuffix;
    }
}