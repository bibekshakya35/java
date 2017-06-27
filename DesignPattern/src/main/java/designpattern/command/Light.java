package designpattern.command;

/**
 * Created by bibek on 6/27/17.
 */

import java.util.logging.Logger;

/**
 * The Receiver class
 */
public class Light {
    private static final Logger LOG = Logger.getLogger(Light.class.getName());

    public void turnOn() {
        LOG.info("Light is on");
    }

    public void turnOff() {
        LOG.info("Light is off");
    }
}
