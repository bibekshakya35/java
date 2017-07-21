package designpattern.observer;

/**
 * Created by bibek on 7/21/17.
 */
class Gates implements AlarmListener{
    @Override
    public void alarm() {
        System.out.println("Gates closed");
    }
}
