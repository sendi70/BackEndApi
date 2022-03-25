package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    List<String> linesArray=new ArrayList<>();
    public Ex4() {
        {
            try {
                File myObj = new File("src\\com\\company\\fileTest.txt");
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    linesArray.add(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
    public void getData(){
        int i=1;
        for (String line:linesArray) {
            System.out.println(i+". "+line);
            i++;
        }
        }

}
