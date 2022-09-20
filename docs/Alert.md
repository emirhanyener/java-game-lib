# Alert
alert is the text on the upper left side of the canvas. It was created for a quick and simple use of writing and reading data.

## Alert Levels
### info
```java
AlertLevel.info
```
info level color is blue.
### warning
```java
AlertLevel.warning
```
warning level color is orange.
### error
```java
AlertLevel.error
```
error level color is red.

## Alert Methods

```java
Alert.getInstance().addAlert(value, alertLevel)
```
`value`: Text for write data.

`alertLevel`: Alert level for text color.

```java
Alert.getInstance().setAlertRow(row, value, alertLevel)
```
`row`: Alert row number.

`value`: Text for write data.

`alertLevel`: Alert level for text color.
