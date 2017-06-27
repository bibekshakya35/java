package designpattern.command;

/**
 * Created by bibek on 6/27/17.
 */
public class FlipUpCommand implements Command {
    private Light light;

    public FlipUpCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

}
