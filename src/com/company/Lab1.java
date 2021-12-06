package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Lab1 {
    public Lab1() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        Point3d point1 = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Введите координаты второй точки: ");
        Point3d point2 = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Введите координаты третьей точки: ");
        Point3d point3 = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        if (point1.equals(point2) && point1.equals(point3) && point2.equals(point3)) {
            System.out.println("Вы ввели три одинаковые точки!");
        } else if (!point1.equals(point2) && !point1.equals(point3) && !point2.equals(point3)) {
            PrintStream var10000 = System.out;
            double var10001 = computeArea(point1, point2, point3);
            var10000.println("Площадь треугольника = " + var10001);
        } else {
            System.out.println("Вы ввели две одинаковые точки!");
        }

    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
