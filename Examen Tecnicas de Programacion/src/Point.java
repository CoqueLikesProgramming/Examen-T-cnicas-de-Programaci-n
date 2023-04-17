public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point[] getShip(int size, CardinalPoints direction) {
        Point[] ship = new Point[size];
        ship[0] = this;

        for (int i = 1; i < size; i++) {
            switch (direction) {
                case NORTH:
                    ship[i] = new Point(x, y - i);
                    break;
                case SOUTH:
                    ship[i] = new Point(x, y + i);
                    break;
                case EAST:
                    ship[i] = new Point(x + i, y);
                    break;
                case WEST:
                    ship[i] = new Point(x - i, y);
                    break;
            }
        }
        return ship;
    }
}
