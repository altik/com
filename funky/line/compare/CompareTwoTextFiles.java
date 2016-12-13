package com.funky.line.compare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rudniev Oleksandr on 13.12.2016.
 */
public class CompareTwoTextFiles {

//    public static final String FIRST = "D://1.txt";
//    public static final String SEC = "D://2.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader firstRdr = null;
        BufferedReader secRdr = null;
        String currentLine;
        List<String> frstLst = new ArrayList<>();
        List<String> scndLst = new ArrayList<>();
        firstRdr = new BufferedReader(new FileReader("D:\\1.txt.txt"));
        secRdr = new BufferedReader(new FileReader("D:\\2.txt.txt"));
        while ((currentLine = firstRdr.readLine()) != null) {
            frstLst.add(currentLine);
        }
        while ((currentLine = secRdr.readLine()) != null) {
            scndLst.add(currentLine);
        }
        List<String> tempLst = new ArrayList<>(frstLst);
        tempLst.removeAll(scndLst);
        System.out.println("content 1.txt which isn't there in 2.txt");
        for (int i = 0; i < tempLst.size(); i++) {
            System.out.println(tempLst.get(i));
        }
        System.out.println("content 2.txt which isn't there in 1.txt");
        tempLst = scndLst;
        tempLst.removeAll(frstLst);
        for (int i = 0; i < tempLst.size(); i++) {
            System.out.println(tempLst.get(i));
        }
    }
}
