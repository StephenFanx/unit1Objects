import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(20);
        turtle.penUp();
        turtle.backward(60);
        turtle.penDown();
        turtle.forward(20);
    }
}
