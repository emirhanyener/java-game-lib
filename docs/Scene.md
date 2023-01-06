# Scene
Scene is used to creating all object one time. Like a container but scene is called anytime.

## Scene
Scene abstract class is used to creating scene template. 

### Scene Class
```java
public class MainScene extends Scene{
    @Override
    public void setup() {
        GameObject.create("obj1", new Position(100, 100), new Size(50, 50));
        GameObject.create("obj2", new Position(200, 100), new Size(50, 50));
        GameObject.create("obj3", new Position(200, 200), new Size(50, 50));
        GameObject.create("obj4", new Position(100, 200), new Size(50, 50));
        .
        .
        .
    }
}
```

### Game
```java
import sglib.*;
import sglib.Scene.*;

public class Game {
    public Game() {

    }

    public static void main(String[] args) {
        //first usage
        Scene1 scene1 = new Scene1();

        //second usage
        new Scene("Scene2") {
            @Override
            public void setup() {
                .
                .
                .
            }
        };

        Scene.loadScene("Scene1"); //load scene

        SGLib sglib = new SGLib();
        sglib.start();
    }
}
```
