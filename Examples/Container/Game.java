package Examples.Container;

import sglib.*;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        MapContainer map = new MapContainer();
        map.getAll().getFirst().addPhysics();
        map.get(1).addPhysics();

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
