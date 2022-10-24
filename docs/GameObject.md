# GameObject
GameObject class is used to creating visible game object. GameObject can be a player or a map object.

## Creating GameObject
```java
GameObject.create(name);
```
`name`: GameObject name.

```java
GameObject.create(name, position, size);
```
`name`: GameObject name.
`position`: GameObject absolute position as Position class.
`size`: GameObject size as Size class.

## Static Methods
Static methods are used for short use for GameObjects.

### create
```java
GameObject.create(name);
```
`name`: GameObject name.

```java
GameObject.create(name, position, size);
```
`name`: GameObject name.

`position`: GameObject absolute position as Position class.

`size`: GameObject size as Size class.

### remove
Removes gameobject from GameObjects and canvas.

```java
GameObject.remove(name);
```
`name`: GameObject name.

### find
This function used to finding gameobject and returns GameObject. 

```java
GameObject.find(name);
```
`name`: GameObject name.

### add
```java
GameObject.add(gameObject);
```
`gameObject`: Manually created gameobject.

## Methods
### Add Physics
This method adds physics to selected gameobject and returns physics. 

```java
GameObject.find(name).addPhysics();
```
`name`: GameObject name.

### Get Physics
This method returns physics from linked gameobject.

```java
GameObject.find(name).getPhysics();
```
`name`: GameObject name.

### Destroy
This method destroys the selected gameobject from the game.

```java
GameObject.find(name).destroy();
```
`name`: GameObject name.

### setColor
This method sets gameobject drawing color.

```java
GameObject.find(name).setColor(color);
```
`color`: GameObject custom color.

### checkTrigger
This method returns triggered object list.
```java
object.checkTrigger(offsetX, offsetY, x, y, isVisible);
```
`object`: GameObject type object.

`offsetX`: x offset position for trigger.

`offsetY`: y offset position for trigger.

`x`: gameObject to x value.

`y`: gameObject to y value.

`isVisible`: Is lines visible?
