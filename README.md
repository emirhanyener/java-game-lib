# SGLib
`SGLib` (Simple Game Library) is used to create simple 2D games. 

## Platform Game

### Main
```java
public static void main(String[] args) {
    GameObject.create("player", new Position(0,-300), new Size(30, 30));
    GameObject.create("object1", new Position(0,200), new Size(1000, 30));
    GameObject.create("object2", new Position(100,170), new Size(100, 30));
    GameObject.create("object3", new Position(200,140), new Size(100, 30));
    GameObject.create("object4", new Position(300,110), new Size(100, 30));

    GameObjects.getInstance().setMainCamera(new FollowerCamera(GameObjects.getInstance().findObject("player"), new Position(0, 0)));
    GameObject.find("player").addPhysics();
    GameObject.find("player").setFunction(new PlayerFunction());

    SGLib sglib = new SGLib();
    sglib.start();
}
```

### Move Event (Key)
```java
public class PlayerFunction extends EventFunction{
    @Override
    public void execute() {
        if(KeyManager.getManager().isKeySpace()){
            GameObject.find("player").velocity.setY(-10);
        }
        if(KeyManager.getManager().isKeyLeft()){
            GameObject.find("player").velocity.setX(-1);
        }
        if(KeyManager.getManager().isKeyRight()){
            GameObject.find("player").velocity.setX(1);
        }

        if(!KeyManager.getManager().isKeyLeft() && !KeyManager.getManager().isKeyRight()){
            GameObject.find("player").velocity.setX(0);
        }
        if(KeyManager.getManager().isKeyLeft() && KeyManager.getManager().isKeyRight()){
            GameObject.find("player").velocity.setX(0);
        }
    }
}
```

## LICENSE
[MIT](LICENSE)