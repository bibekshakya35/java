package designpattern.observer;

/**
 * Created by bibek on 7/21/17.
 */
class CheckList {
    public void byTheNumbers(){
        localize();
        isolate();
        identify();
    }
    protected void localize(){
        System.out.println("  established perimeter");
    }
    protected void isolate(){
        System.out.println("  Isolate the grid");
    }
    protected void identify(){
        System.out.println("  Identify source");
    }
}
