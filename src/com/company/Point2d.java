package com.company;

public class Point2d {
    private double xCoord;
    private double yCoord;
    private Object obj;

    public Point2d(double x, double y) {
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point2d() {
        this(0.0D, 0.0D);
    }

    public double getX() { return this.xCoord;
    }

    public double getY() {
        return this.yCoord;
    }

    public void setX(double val) {
        this.xCoord = val;
    }

    public void setY(double val) {
        this.yCoord = val;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!this.getClass().equals(obj.getClass())) {
            return false;
        } else {
            Point2d point2d = (Point2d)obj;
            return this.xCoord == point2d.xCoord && this.yCoord == point2d.yCoord;
        }
    }
}
