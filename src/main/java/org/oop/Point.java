package org.oop;

public class Point {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point anotherPoint) {
        double squareOfDifferenceOfXCoordinates = squareOfDifference(this.getX(), anotherPoint.getX());
        double squareOfDifferenceOfYCoordinates = squareOfDifference(this.getY(), anotherPoint.getY());
        return Math.sqrt(squareOfDifferenceOfXCoordinates + squareOfDifferenceOfYCoordinates);
    }

    private double squareOfDifference(double coordinate1, double coordinate2) {
        double distance = coordinate1 - coordinate2;
        return Math.pow(distance, 2);
    }

    public double angleWith(Point anotherPoint) {
        double xDistance = this.getX() - anotherPoint.getX();
        double yDistance = this.getY() - anotherPoint.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
