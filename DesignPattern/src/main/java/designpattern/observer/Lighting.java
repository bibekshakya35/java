package designpattern.observer;

/**
 * Created by bibek on 7/21/17.
 */
class Lighting implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Lights up");
    }
}
