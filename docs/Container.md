# Container
Container is used to create multiple objects and reduce complexity on the sglib.

## GameObjectContainer
GameObjectContainer is used to creating game objects.
### Container Class
```java
public class ObjectsContainer extends GameObjectContainer{
    @Override
    public void container() {
        addContainer(gameObject);
        addContainer(gameObject);
        addContainer(gameObject);
        .
        .
        .
    }
}
```
`gameObject`: New GameObject object.
### Create Container Objects
```java
ObjectsContainer objects = new ObjectsContainer();
```

### Get Container Object
```java
objects.get(index).addPhysics();
```
`index`: Index number for selected object.
