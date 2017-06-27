package designpattern.bridge;

/**
 * Created by bibek on 6/8/17.
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [color:green radius ]"+radius+" ,x : "+x+" , y: "+y);
    }
}
