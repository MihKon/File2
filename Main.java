package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("A.txt");
        File file1 = new File("B.txt");
        FileWriter writer = new FileWriter(file);
        Scanner in = new Scanner(file);
        FileWriter writer1 = new FileWriter(file1);
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        writer.write(s);
        writer.close();
        String w = in.next();
        int k=0;
        while (in.hasNext()) {
            boolean first = w.endsWith("y");
            if (first==true){
                k++;
            }
            w = in.next();
        }
        in.close();
        System.out.println(k);
    }
}
