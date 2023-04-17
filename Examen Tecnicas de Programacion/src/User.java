import java.util.ArrayList;

public class User {
    private final ArrayList<Ship> ships;
    private boolean isAlive;

    public User(final ArrayList<Ship> ships) throws Exception {
        this.ships = new ArrayList<Ship>();

        for (final Ship ship : ships) {
            if (ship instanceof Ship) {
                if (null == ship) {
                    throw new Exception("El barco no puede estar vacío.");
                }
            } else {
                throw new Exception("El barco no es válido.");
            }
            this.ships.add(ship);
        }
        isAlive = true;
    }

    // No hace falta un método get o set para ships, porque no se va a modificar una vez creados.

    public boolean attack(final Point shotPoint, final User user) throws Exception {
        if (shotPoint instanceof Point) {
            if (null == shotPoint) {
                throw new Exception("El punto no puede estar vacío.");
            }
        } else {
            throw new Exception("El punto no es válido.");
        }

        if (user instanceof User) {
            if (null == user) {
                throw new Exception("El usuario no puede estar vacío.");
            }
        } else {
            throw new Exception("El usuario no es válido.");
        }

        for (final Ship ship : user.ships) {
            if (ship.getShot(shotPoint)) {
                if (ship.isSunk()) {
                    user.die();
                }
                return true;
            }
        }
        return true;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void die() {
        this.isAlive = false;
    }
}
