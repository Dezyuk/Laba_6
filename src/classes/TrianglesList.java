package classes;

import java.util.ArrayList;
import java.util.List;

public class TrianglesList {
    private final List<Triangle> triangles;

    public TrianglesList() {
        triangles = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Triangles " + triangles;
    }

    public boolean add(Triangle triangle) {
        return triangles.add(triangle);
    }

    public void remove(int number) {
        if (number < triangles.size() && number >= 0)
            triangles.remove(number);
    }

    public void remove(Triangle triangle) {
        triangles.remove(triangle);
    }

    public double getAverageSquare() {
        double area = 0;
        for (Triangle triangle : triangles) {
            area += triangle.getSquare();
        }
        return area / triangles.size();
    }

    public Triangle getLargestRightTriangle() {
        int max_hypotenuse = 0;
        Triangle tmpTriangle = new Triangle(0, 0, 0);
        for (Triangle triangle : triangles) {
            if ((triangle instanceof RightTriangle) && (((RightTriangle) triangle).getHypotenuse() > max_hypotenuse)) {
                tmpTriangle = triangle;
                max_hypotenuse = Math.max(Math.max(triangle.getSide1(), triangle.getSide2()), triangle.getSide3());
            }
        }
        return tmpTriangle;
    }
}

