package designpattern.bridge;

/**
 * Created by bibek on 6/8/17.
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
