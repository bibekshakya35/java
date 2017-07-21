package designpattern.observer;

/**
 * Created by bibek on 7/21/17.
 */
class Surveillance extends CheckList implements  AlarmListener{
    @Override
    public void alarm() {
        System.out.println("Surveillance - by the numbers");
        byTheNumbers();
    }
    protected void isolate(){
        System.out.println(" train the cameras");
    }
}
