package com.example.section;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public class Colon {

    public static List<Point> lightPoints;

    static {
        lightPoints = new ArrayList<>();
        lightPoints.add(new Point(1, 7));
        lightPoints.add(new Point(2, 7));
        lightPoints.add(new Point(3, 7));

        lightPoints.add(new Point(1, 8));
        lightPoints.add(new Point(2, 8));
        lightPoints.add(new Point(3, 8));

        lightPoints.add(new Point(1, 9));
        lightPoints.add(new Point(2, 9));
        lightPoints.add(new Point(3, 9));

        lightPoints.add(new Point(1, 13));
        lightPoints.add(new Point(2, 13));
        lightPoints.add(new Point(3, 13));

        lightPoints.add(new Point(1, 14));
        lightPoints.add(new Point(2, 14));
        lightPoints.add(new Point(3, 14));

        lightPoints.add(new Point(1, 15));
        lightPoints.add(new Point(2, 15));
        lightPoints.add(new Point(3, 15));
    }
}