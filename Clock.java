package qdu;

/**
 * Created class Clock.
 * Wrote class Clock according to the class diagram.
 * @author acer
 *
 */
public abstract class Clock {
	private final int UTC_OFFSET = 0;
	private int localTime = 0;
	
	public abstract void setLocalTime(int localTime);
}
