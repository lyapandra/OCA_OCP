package OCASelikoff.ch5p234ClassDesign.s03Interfaces.e02p267DefiningInterfaces;

/**
 * Chapter 5: Class Design<br>
 * Implementing Interfaces<br>
 * Defining an Interface - pages 267-268
 */
public interface E3CanFly {
	void fly(int speed);
	abstract void takeoff();
	public abstract double dive();
}

/*
The above will be converted by the compiler to the following
public abstract interface E3CanFly {
	public abstract void fly(int speed);
	public abstract void takeoff();
	public abstract double dive();
}
 */
