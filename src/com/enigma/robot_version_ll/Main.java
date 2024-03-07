package com.enigma.robot_version_ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String awal="WEST";
//        Direction arah=Direction.valueOf(awal);
//        System.out.println(arah);
//        System.out.println(arah.ordinal());
//        System.out.println(Direction.values()[arah.ordinal()]);
//        String huruf=arah.name();
//        System.out.println(huruf);
//        System.out.println(-1%4);
//        System.out.println(arah.turnRight());
//        String start= Arrays.toString(Helper.inputData("Enter the robot's starting position : "));
//        String rule=Helper.inputData(("Command input : "));
        Robot robot=new Robot(start,rule);

    }
}
