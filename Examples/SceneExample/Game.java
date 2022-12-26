package Examples.SceneExample;

import sglib.*;
import sglib.Scene.Scene;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        Scene1 scene1 = new Scene1();

        Scene.loadScene("Scene1");

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
