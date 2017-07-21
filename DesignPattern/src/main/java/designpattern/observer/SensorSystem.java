package designpattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by bibek on 7/21/17.
 */
class SensorSystem {
    private Vector listeners = new Vector();

    public void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    public void soundTheAlarm() {
        for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
            ((AlarmListener) e.nextElement()).alarm();
        }
    }
}
