package com.company;

public class Lab1 {
    public static void main(String[] args) {
        Point3d t1 = new Point3d();
        Point3d t2 = new Point3d();
        Point3d t3 = new Point3d();
        if (args.length != 0) {
            t1.setX(Double.parseDouble(args[0]));
            t1.setY(Double.parseDouble(args[1]));
            t1.setZ(Double.parseDouble(args[2]));
            t2.setX(Double.parseDouble(args[3]));
            t2.setY(Double.parseDouble(args[4]));
            t2.setZ(Double.parseDouble(args[5]));
            t3.setX(Double.parseDouble(args[6]));
            t3.setY(Double.parseDouble(args[7]));
            t3.setZ(Double.parseDouble(args[8]));
            System.out.println(t1.computeArea(t2, t3));
        }
    }
}
