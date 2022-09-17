# Camera

`sglib` has three camera type.
- Static Camera
- Follower Camera
- Multiple Camera

### Static Camera
Static camera is fixed. If its location is wanted to be changed, it must be changed manually.

```java
GameObjects.getInstance().setMainCamera(new StaticCamera(cameraPosition));
```
`cameraPosition`: Current camera position(Position).

### Follower Camera
Follower camera is follows an object automatickly.

```java        
GameObjects.getInstance().setMainCamera(new FollowerCamera(gameObject, cameraOffset));
```
`gameObject`: gameObject for follow(GameObject).

`cameraOffset`: Add temp position to current camera position(Position).

### Multiple Camera
Multiple camera is follows more objects and fits them into the canvas.

```java
GameObjects.getInstance().setMainCamera(new MultipleCamera(gameObjectArray, cameraOffset));
```
`gameObjectArray`: gameObjects for follow as an gameObject array(GameObject[]).

`cameraOffset`: Add temp position to current camera position(Position).