package robot;

/**
 * A class holding all of the ports on the robot.
 * Place mechanism-specific ports inside their own sub-class.
 * When accessing a mechanism-specific port, call Ports.[MECHANISM].[PORT_NAME]
 */
public class Ports {
    public static class Shooter {
        public static final int MASTER = 7;
        public static final int SLAVE = 8;
    }

    public static class Turret {
        public static final int MASTER = 11;
        public static final boolean IS_MASTER_INVERTED = true;
        public static final boolean IS_SENSOR_PHASED = true;
    }
}
