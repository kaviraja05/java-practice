package com.tcs.input;

import java.io.*;

//if scanner is not working, in such cases, use BufferReader
public class BufferReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        System.out.println(word);

        int num1 = Integer.parseInt(br.readLine());
        System.out.println(num1);

        double num2 = Double.parseDouble(br.readLine());
        System.out.println(num2);

    }
}
