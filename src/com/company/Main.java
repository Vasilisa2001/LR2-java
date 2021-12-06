package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Point2d myPoint = new Point2d();
        Point2d myOtherPoint = new Point2d(5.0, 3.0);
        Point2d aThirdPoint = new Point2d();
        System.out.println(myPoint.equals(myOtherPoint));
        System.out.println(myPoint.equals(aThirdPoint));
        System.out.println(myOtherPoint.equals(aThirdPoint));
        Point3d point3d_1 = new Point3d(1.8, 1.3, 0.2);
        Point3d point3d_2 = new Point3d(1.8, 1.3, 0.2);
        Point3d point3d_3 = new Point3d(5.8, 1.8, 0.5);
        System.out.println(point3d_1.equals(point3d_2));
        System.out.println(point3d_1.equals(point3d_3));
        System.out.printf("%.2f", point3d_1.distanceTo(point3d_3));
    }
}
