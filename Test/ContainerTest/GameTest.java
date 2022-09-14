package Test.ContainerTest;

import sglib.*;

public class GameTest {
    public GameTest() {

    }

    public static void main(String[] args) {
        MapContainer map = new MapContainer();
        map.getAll().getFirst().addPhysics();
        map.getAll().get(1).addPhysics();

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
