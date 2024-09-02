package section;

/**
 * <p>Title: DigitalClock</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author Smigura Antal
 * @version 1.0
 */

public enum Number {

    ZERO(true, true, true, false, true, true, true),

    ONE(false, false, true, false, false, true, false),

    TWO(true, false, true, true, true, false, true),

    THREE(true, false, true, true, false, true, true),

    FOUR(false, true, true, true, false, true, false),

    FIVE(true, true, false, true, false, true, true),

    SIX(true, true, false, true, true, true, true),

    SEVEN(true, false, true, false, false, true, false),

    EIGHT(true, true, true, true, true, true, true),

    NINE(true, true, true, true, false, true, true);

    private boolean north;
    private boolean northWest;
    private boolean northEast;
    private boolean center;
    private boolean southWest;
    private boolean southEast;
    private boolean south;

    private Number(
            boolean north,
            boolean norhtWest,
            boolean northEast,
            boolean center,
            boolean southWest,
            boolean southEast,
            boolean south) {
        this.north = north;
        this.northWest = norhtWest;
        this.northEast = northEast;
        this.center = center;
        this.southWest = southWest;
        this.southEast = southEast;
        this.south = south;
    }


    public boolean isCenter() {
        return center;
    }

    public boolean isNorth() {
        return north;
    }

    public boolean isNorthEast() {
        return northEast;
    }

    public boolean isNorthWest() {
        return northWest;
    }

    public boolean isSouth() {
        return south;
    }

    public boolean isSouthEast() {
        return southEast;
    }

    public boolean isSouthWest() {
        return southWest;
    }
}