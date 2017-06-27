package designpattern.bridge;

/**
 * Created by bibek on 6/8/17.
 */
public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle color red radius"+radius+", x :"+x+", y: "+y);
    }
}
