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
