package com.company.Task3;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] Intarray = {1, 8, 8, 7, 2};
        char[] Chararray = {'e', 't', 'c', 'b'};

        print (Intarray,Chararray);
    }

    public static String writearrays(int[] Intarray, char[] Chararray)
    {
        int maxLength;
        if ( Chararray.length>= Intarray.length)
        {
            maxLength = Chararray.length;
        } else
        {
            maxLength = Intarray.length;
        }

        String result = "";
        for (int i = 0; i < maxLength; i++)
        {
            if (i < Intarray.length)
            {
                result += Intarray[i];
            }
            if (i < Chararray.length)
            {
                result += Chararray[i];
            }
        }
        return result;
    }

    public static void print(int[] Intarray, char[] Chararray)
    {
        System.out.println (writearrays (Intarray,Chararray));
    }
}
