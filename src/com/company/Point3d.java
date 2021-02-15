package com.company;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {
        this(0, 0, 0);
    }
    public double getX () { //Вернуть х
        return xCoord;
    }
    public double getY () { //Вернуть y
        return yCoord;
    }
    public double getZ () { //Вернуть z
        return zCoord;
    }
    public void setX (double val) { //Установить значение для х
        xCoord = val;
    }
    public void setY (double val) { //Установить значение для y
        yCoord = val;
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
    /*public double computeArea(Point3d a, Point3d b){ //площадь треугольника
        if (this.eq(a) || this.eq(b) || a.eq(b)) {
            System.out.println("Koordinati sovpadaut");
            System.exit(1);
        }
        double p = (this.distanceTo(a) + this.distanceTo(b) + a.distanceTo(b)) / 2;
        return Math.sqrt(p * (p - this.distanceTo(a)) * (p - this.distanceTo(b)) * (p - a.distanceTo(b)));
    }
     */
}
