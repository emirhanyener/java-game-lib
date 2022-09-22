# Cursor
Cursor class is used to getting cursor position and cursor event data. 

## Cursor Methods
### getPosition
```java
Cursor.getInstance().getPosition()
```
Returns absolute position(not included camera position).

### getGamePosition
```java
Cursor.getInstance().getGamePosition()
```
Returns relative position(included camera position).

### isClicking
```java
Cursor.getInstance().isClicking()
```
Returns true if cursor button is down.

### isInWindow
```java
Cursor.getInstance().isInWindow()
```
Returns true if cursor is in window area.
