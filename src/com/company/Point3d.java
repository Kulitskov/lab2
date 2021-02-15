package com.company;

public class Point3d extends Point2d {
    private double zCoord;
    public Point3d (double x, double y, double z) {
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getZ () { //Вернуть z
        return zCoord;
    }
    public void setZ (double val) { //Установить значение для z
        zCoord = val;
    }
    public boolean eq(Point3d a){ //Сравниваем значения
        if (a.getX() == this.getX() && a.getY() == this.getY() && a.getZ() == this.getZ())
            return true;
        return false;
    }
    public double distanceTo(Point3d a){ //Растояние между точками
        double rast = Math.sqrt(Math.pow(a.getX() - this.getX(), 2) + Math.pow(a.getY() - this.getY(), 2) + Math.pow(a.getZ() - this.getZ(), 2));
        return Math.round(rast * 100.0) / 100.0;
    }
}
