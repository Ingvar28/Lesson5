package ru.nosov;

import java.util.Random;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  double vectorLenght () {

        return Math.sqrt(x^2 + y^2 + z^2);
    }

    public int scolarOp(Vector vector) {

        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorOp (Vector vector) {


        return new Vector(x * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double vectorAngle (Vector vector) {


        return scolarOp(vector)/ (Math.abs(vectorLenght()) * Math.abs(vector.vectorLenght()));
    }

    public Vector vectorSum(Vector vector) {

        return new Vector(x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector vectorSub(Vector vector) {

        return new Vector(x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    public static Vector[] vectorRdm (int n) {
        Random random = new Random();
        Vector[] array = new Vector[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector(random.nextInt(), random.nextInt(), random.nextInt());
        }

        return array;
    }



    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
