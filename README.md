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
        GameObject.find("player").setFunction(new CursorPosition());

        SGLib sglib = new SGLib();
        sglib.setKeyListener(new MoveEvent());
        sglib.start();
	}
```

### Move Event (Key)
```java
    public class MoveEvent implements KeyListener{
        @Override
        public void keyTyped(KeyEvent e) { }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_SPACE){
                GameObject.find("player").velocity.setY(-10);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                GameObject.find("player").velocity.setX(-1);
            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                GameObject.find("player").velocity.setX(1);
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT){
                GameObject.find("player").velocity.setX(0);
            }
        }
    }
```

## LICENSE
[MIT](LICENSE)