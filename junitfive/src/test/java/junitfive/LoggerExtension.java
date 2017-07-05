package junitfive;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bibek on 7/5/17.
 */
public class LoggerExtension implements TestInstancePostProcessor {
    private static final Logger LOG = Logger.getLogger(LoggerExtension.class.getName());

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        LOG.log(Level.INFO,
                "Test Instance Post Processing called");
    }
}
