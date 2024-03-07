package com.enigma.robot_version_ll;
import java.util.Scanner;
public class Helper {
    public static String[] inputData(String data){
        Scanner scanner=new Scanner(System.in);
        System.out.print(data);
        String data2=scanner.nextLine();
        String[] data3=data2.split(",");
        return data3;
    }
}
