package section;

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

public class North {

    public static List<Point> darkPoints;
    public static List<Point> lightPoints;

    static {
        darkPoints = new ArrayList<>();
        darkPoints.add(new Point(3, 1));
        darkPoints.add(new Point(5, 1));
        darkPoints.add(new Point(7, 1));
        darkPoints.add(new Point(9, 1));

        darkPoints.add(new Point(4, 2));
        darkPoints.add(new Point(6, 2));
        darkPoints.add(new Point(8, 2));

        darkPoints.add(new Point(5, 3));
        darkPoints.add(new Point(7, 3));
    }

    static {
        lightPoints = new ArrayList<>(darkPoints);
        lightPoints.add(new Point(2, 1));
        lightPoints.add(new Point(4, 1));
        lightPoints.add(new Point(6, 1));
        lightPoints.add(new Point(8, 1));
        lightPoints.add(new Point(10, 1));

        lightPoints.add(new Point(3, 2));
        lightPoints.add(new Point(5, 2));
        lightPoints.add(new Point(7, 2));
        lightPoints.add(new Point(9, 2));

        lightPoints.add(new Point(4, 3));
        lightPoints.add(new Point(6, 3));
        lightPoints.add(new Point(8, 3));
    }
}