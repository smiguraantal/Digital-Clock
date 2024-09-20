package org.example.section;

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

public class Center {

    public static List<Point> darkPoints;
    public static List<Point> lightPoints;

    static {
        darkPoints = new ArrayList<>();
        darkPoints.add(new Point(4, 10));
        darkPoints.add(new Point(6, 10));
        darkPoints.add(new Point(8, 10));

        darkPoints.add(new Point(3, 11));
        darkPoints.add(new Point(5, 11));
        darkPoints.add(new Point(7, 11));
        darkPoints.add(new Point(9, 11));

        darkPoints.add(new Point(4, 12));
        darkPoints.add(new Point(6, 12));
        darkPoints.add(new Point(8, 12));
    }

    static {
        lightPoints = new ArrayList<>(darkPoints);
        lightPoints.add(new Point(3, 10));
        lightPoints.add(new Point(5, 10));
        lightPoints.add(new Point(7, 10));
        lightPoints.add(new Point(9, 10));

        lightPoints.add(new Point(2, 11));
        lightPoints.add(new Point(4, 11));
        lightPoints.add(new Point(6, 11));
        lightPoints.add(new Point(8, 11));
        lightPoints.add(new Point(10, 11));

        lightPoints.add(new Point(3, 12));
        lightPoints.add(new Point(5, 12));
        lightPoints.add(new Point(7, 12));
        lightPoints.add(new Point(9, 12));
    }
}