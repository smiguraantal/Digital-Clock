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

public class SouthWest {

    public static List<Point> darkPoints;
    public static List<Point> lightPoints;

    static {
        darkPoints = new ArrayList<>();
        darkPoints.add(new Point(1, 12));

        darkPoints.add(new Point(2, 13));

        darkPoints.add(new Point(1, 14));
        darkPoints.add(new Point(3, 14));

        darkPoints.add(new Point(2, 15));

        darkPoints.add(new Point(1, 16));
        darkPoints.add(new Point(3, 16));

        darkPoints.add(new Point(2, 17));

        darkPoints.add(new Point(1, 18));
        darkPoints.add(new Point(3, 18));

        darkPoints.add(new Point(2, 19));

        darkPoints.add(new Point(1, 20));
    }

    static {
        lightPoints = new ArrayList<>(darkPoints);

        lightPoints.add(new Point(1, 13));

        lightPoints.add(new Point(2, 14));

        lightPoints.add(new Point(1, 15));
        lightPoints.add(new Point(3, 15));

        lightPoints.add(new Point(2, 16));

        lightPoints.add(new Point(1, 17));
        lightPoints.add(new Point(3, 17));

        lightPoints.add(new Point(2, 18));

        lightPoints.add(new Point(1, 19));
    }
}