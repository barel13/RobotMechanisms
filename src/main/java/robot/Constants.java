package robot;

/**
 * A class holding all of the constants of every mechanism on the robot.
 * Place global constants in this class, and mechanism-specific constants inside their respective mechanism subclass.
 * When accessing a mechanism-specific port, call Constants.[MECHANISM].[CONSTANT]
 */
public class Constants {
    //All general constants go here
    //public static final double TIME_STEP = 0.02;


    public static class Drivetrain {
        public static final double TICKS_PER_METER = 256 / (4 * 0.0254 * Math.PI);
        public static final double MAX_VEL = 3;// in m/s
        public static final double TIME_STEP = 0.02;
        public static final double MAX_ACCELERATION = 0.4;// in m/s^2 (currently not the correct number)
        public static final int MAX_CURRENT = 35;
    }

    public static class Wrist {
        public static final int TICKS_PER_DEGREE = 0;
        public static final int TALON_PID_SLOT = 0;
        public static final double KP = 0;
        public static final double KI = 0;
        public static final double KD = 0;
        public static final int TALON_TIMEOUT_MS = 20;
        public static final double GRAVITY = 9.8;
        public static final double MASS  = 2; //in kilograms TODO: CHANGE VALUE
        public static int WRIST_LENGTH = 0;
    }

    public static class ExampleSubsystem1 {
        //All of the Subsystem specific constants go here,and need to be static.

        //public static final double TICKS_PER_METER = 256 / (4*0.0254*Math.PI);
        //public static final double MAX_VELOCITY = 5;
    }
}