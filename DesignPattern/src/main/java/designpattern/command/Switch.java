package designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bibek on 6/27/17.
 */
/** The Invoker class */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(final Command command) {
        this.history.add(command);
        command.execute();
    }
}
