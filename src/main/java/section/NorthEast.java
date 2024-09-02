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

public class NorthEast {

    public static List<Point> darkPoints;
    public static List<Point> lightPoints;

    static {
        darkPoints = new ArrayList<>();
        darkPoints.add(new Point(11, 2));

        darkPoints.add(new Point(10, 3));

        darkPoints.add(new Point(9, 4));
        darkPoints.add(new Point(11, 4));

        darkPoints.add(new Point(10, 5));

        darkPoints.add(new Point(9, 6));
        darkPoints.add(new Point(11, 6));

        darkPoints.add(new Point(10, 7));

        darkPoints.add(new Point(9, 8));
        darkPoints.add(new Point(11, 8));

        darkPoints.add(new Point(10, 9));

        darkPoints.add(new Point(11, 10));
    }

    static {
        lightPoints = new ArrayList<>(darkPoints);

        lightPoints.add(new Point(11, 3));

        lightPoints.add(new Point(10, 4));

        lightPoints.add(new Point(9, 5));
        lightPoints.add(new Point(11, 5));

        lightPoints.add(new Point(10, 6));

        lightPoints.add(new Point(9, 7));
        lightPoints.add(new Point(11, 7));

        lightPoints.add(new Point(10, 8));

        lightPoints.add(new Point(11, 9));
    }
}