package com.company;

import classes.RightTriangle;
import classes.Triangle;
import classes.Triangles;
import classes.TrianglesList;

public class Main {

    public static final int M = 5;
    public static final int N = 5;
    public static final int MAX_SIDE = 100;

    /**
     * 16. Создать класс треугольник, члены класса – длины 3-х сторон. Предусмотреть в классе методы
     * проверки существования треугольника, вычисления и вывода сведений о фигуре – длины сторон, углы,
     * периметр, площадь. Создать производный класс – прямоугольный треугольник, 30предусмотреть в
     * классе проверку, является ли треугольник прямоугольным. Написать программу, демонстрирующую
     * работу с классом: дано M треугольников и N прямоугольных треугольников, найти среднюю площадь М
     * треугольников и прямоугольный треугольник с наибольшей гипотенузой.
     * @param args
     */
    public static void main(String[] args) {
        // write your code here
        int side1, side2, side3;

/*
        Triangles triangles = new Triangles(M);

        for (int i = 0; i < M; i++) {
            while (!Triangle.existsTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            Triangle triangle = new Triangle(side1, side2, side3);
            triangles.add(triangle);
        }

        System.out.println(triangles);

        System.out.println(triangles.getAverageSquare());

        System.out.println("\n--------------------------------\n");

        Triangles rightTriangles = new Triangles(M);

        for (int i = 0; i < N; i++) {
            while (!RightTriangle.existsRightTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            RightTriangle rightTriangle = new RightTriangle(side1, side2, side3);
            rightTriangles.add(rightTriangle);
        }
        System.out.println(rightTriangles);

        System.out.println(rightTriangles.getLargestRightTriangle());
*/


        System.out.println("\n--------------------------------\n");

        TrianglesList trianglesList = new TrianglesList();
        for (int i = 0; i < M; i++) {
            while (!Triangle.existsTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            trianglesList.add(new Triangle(side1, side2, side3));
        }
        System.out.println(trianglesList);
        System.out.println(trianglesList.getAverageSquare());


        System.out.println("\n--------------------------------\n");


        TrianglesList rightTrianglesList = new TrianglesList();
        for (int i = 0; i < N; i++) {
            while (!RightTriangle.existsRightTriangle(side1 = ((int) (Math.random() * MAX_SIDE + 1)), side2 = ((int) (Math.random() * MAX_SIDE + 1)), side3 = ((int) (Math.random() * MAX_SIDE + 1)))) {
                //System.out.println(side1 + " " + side2 + " " + side3);
            }
            rightTrianglesList.add(new RightTriangle(side1, side2, side3));
        }
        System.out.println(rightTrianglesList);
        System.out.println(rightTrianglesList.getLargestRightTriangle());
    }
}
