import unit4.turtleLib.Turtle;
import java.time.LocalDateTime;
public class Main {
    
	public static void main(String[] args)
  {
    int hour = LocalDateTime.now().getHour();
    int minutes = LocalDateTime.now().getMinute();
    System.out.println(hour + ":" + minutes);

    Turtle t1 = new Turtle();
    t1.turnRight(30);
    t1.tailDown();
    t1.moveForward(100);
    
  }
}