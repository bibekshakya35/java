package designpattern.command;

/**
 * Created by bibek on 6/27/17.
 */

/**
 * The Command for turning off the light - ConcreteCommand #2
 */
public class FlipDownCommand implements Command {
    private Light light;

    public FlipDownCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
