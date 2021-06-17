package ru.nosov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector vector1 = new Vector(4, 5, 6);
        Vector vector2 = new Vector(5, 4, 2);


        System.out.println("vectorLenght: " + vector1.vectorLenght() + "\n");

        System.out.println("scolarOp: " + vector1.scolarOp(vector2) + "\n");
        System.out.println("vectorOp: " + vector1.vectorOp(vector2) + "\n");
        System.out.println("vectorAngle: " + vector1.vectorAngle(vector2) + "\n");
        System.out.println("vectorSum: " + vector1.vectorSum(vector2) + "\n");
        System.out.println("vectorSub: " + vector1.vectorSub(vector2) + "\n");
        System.out.println("vectorRdm: " + Arrays.toString(Vector.vectorRdm(5)) + "\n");




    }
}
