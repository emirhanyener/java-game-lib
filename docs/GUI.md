# GUI
GUI objects are not gameobjects in the game. GUI objects are used to draw shapes and text in the game.
These objects are used to send graphical notifications to the user.

## Methods
### Creating GUI
```java
GameObjects.getInstance().addGUIObject((new GUIBox(size)).setPosition(position).setName(name));
```
`size`: Object size(width, height).
`position`: Object position(x, y).
`name`: Object name.