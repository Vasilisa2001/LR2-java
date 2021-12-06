package com.company;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public Point3d() {
        this(0.0D, 0.0D, 0.0D);
    }

    public double getX() {
        return this.xCoord;
    }

    public double getY() {
        return this.yCoord;
    }

    public double getZ() {
        return this.zCoord;
    }

    public void setX(double val) {
        this.xCoord = val;
    }

    public void setY(double val) {
        this.yCoord = val;
    }

    public void setZ(double val) {
        this.zCoord = val;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!this.getClass().equals(obj.getClass())) {
            return false;
        } else {
            Point3d point3d = (Point3d)obj;
            return this.xCoord == point3d.xCoord && this.yCoord == point3d.yCoord && this.zCoord == point3d.zCoord;
        }
    }

    public double distanceTo(Point3d p) {
        return Math.sqrt(Math.pow(this.xCoord - p.getX(), 2.0D) + Math.pow(this.yCoord - p.getY(), 2.0D) + Math.pow(this.zCoord - p.getZ(), 2.0D));
    }
}
