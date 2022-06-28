# Anonymous objects
Anonymous objects are the objects that are instantiated but are not stored in a reference variable.

They are used for immediate method calling.
They will be destroyed after method calling.
They are widely used in different libraries. For example, in AWT libraries, they are used to perform some action on capturing an event(eg a key press).
In the example below, when a key is button(referred by the btn) is pressed, we are simply creating anonymous object of EventHandler class for just calling handle method.
```java
btn.setOnAction(new EventHandler()
{   
    public void handle(ActionEvent event) {
        System.out.println("Hello World!");
    }
});
```