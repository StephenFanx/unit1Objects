import java.awt.Color;

public class TurtleProject
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle.setPenWidth(25);
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle2.setPenWidth(25);
        turtle2.setPenColor(Color.ORANGE);
        turtle2.penDown();
        turtle3.setPenWidth(18);
        turtle3.setPenColor(Color.BLUE);
        turtle3.penDown();
        turtle4.setPenWidth(25);
        turtle4.setPenColor(Color.BLUE);
        turtle4.penDown();
        double turnnumber = 0;
        double turnangle = 0;
        for (int i=1; i<21;i++){
            turnnumber += 1;
            if (turnnumber > 15){
                turtle.setPenColor(Color.PINK);
                turtle.penUp();
                turtle.forward(40);
                turtle.penDown();
                turtle2.setPenColor(Color.RED);
                turtle2.penUp();
                turtle2.backward(40);
                turtle2.penDown();
                for (int x = 1; x < 20; x++){
                    turtle.turn(45);
                    turtle.forward(80);
                    turtle2.turn(45);
                    turtle2.backward(80);
                }
            }
            turtle.turn(45);
            turtle.forward(32);
            turtle2.turn(45);
            turtle2.backward(32);
        }
        turtle3.turn(45);
        turtle3.forward(200);
        turtle3.backward(400);
        turtle4.turn(315);
        turtle4.forward(200);
        turtle4.backward(400);
    }
}
          