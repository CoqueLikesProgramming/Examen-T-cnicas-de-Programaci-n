public class Ship {
    private int size;
    private CardinalPoints direction;
    private Point startingPoint;
    private boolean isSunk;
    private int timesHit;

    public Ship(int size, CardinalPoints direction, Point startingPoint) {
        this.size = size;
        this.direction = direction;
        this.startingPoint = startingPoint;
        this.isSunk = false;
        this.timesHit = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CardinalPoints getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoints direction) {
        this.direction = direction;
    }

    public Point getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Point startingPoint) {
        this.startingPoint = startingPoint;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean isSunk) {
        this.isSunk = isSunk;
    }

    public int getTimesHit() {
        return timesHit;
    }

    public void setTimesHit(int timesHit) {
        this.timesHit = timesHit;
    }

    public boolean getShot(Point shotPoint) {
        Point[] shipPoints = startingPoint.getShip(size, direction);

        for (Point point : shipPoints) {
            if (point.getX() == shotPoint.getX() && point.getY() == shotPoint.getY()) {
                timesHit++;
                if (timesHit == size) {
                    isSunk = true;
                }
                return true;
            }
        }
        return false;
    }
}
