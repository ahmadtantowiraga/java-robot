package com.enigma.robot_version_ll;

public enum Direction {
    NORT,
    EAST,
    SOUT,
    WEST;
    public Direction turnRight(){
        return Direction.values()[(this.ordinal()+1)%4];
    }
    public Direction turnLeft(){
        return Direction.values()[(this.ordinal()-1+4)%4];
    }

}
