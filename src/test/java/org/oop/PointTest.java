package org.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point point1 = new Point(0, 5);
        Point point2 = new Point(0, 5);

        double distanceBetweenPoints = point1.distanceFrom(point2);

        assertEquals(0, distanceBetweenPoints);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distanceOfPoint1FromOrigin = point1.distanceFrom(origin);
        double distanceOfPoint2FromOrigin = point2.distanceFrom(origin);

        assertEquals(1, distanceOfPoint1FromOrigin);
        assertEquals(1, distanceOfPoint2FromOrigin);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distanceBetweenPoints = point1.distanceFrom(point2);

        assertEquals(2, distanceBetweenPoints);
    }
}