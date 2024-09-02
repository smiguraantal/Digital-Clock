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

public class NorthWest {

    public static List<Point> darkPoints;
    public static List<Point> lightPoints;

    static {
        darkPoints = new ArrayList<>();
        darkPoints.add(new Point(1, 2));

        darkPoints.add(new Point(2, 3));

        darkPoints.add(new Point(1, 4));
        darkPoints.add(new Point(3, 4));

        darkPoints.add(new Point(2, 5));

        darkPoints.add(new Point(1, 6));
        darkPoints.add(new Point(3, 6));

        darkPoints.add(new Point(2, 7));

        darkPoints.add(new Point(1, 8));
        darkPoints.add(new Point(3, 8));

        darkPoints.add(new Point(2, 9));

        darkPoints.add(new Point(1, 10));
    }

    static {
        lightPoints = new ArrayList<>(darkPoints);

        lightPoints.add(new Point(1, 3));

        lightPoints.add(new Point(2, 4));

        lightPoints.add(new Point(1, 5));
        lightPoints.add(new Point(3, 5));

        lightPoints.add(new Point(2, 6));

        lightPoints.add(new Point(1, 7));
        lightPoints.add(new Point(3, 7));

        lightPoints.add(new Point(2, 8));

        lightPoints.add(new Point(1, 9));
    }
}