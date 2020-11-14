
public class CrookedDie1 extends Die
{
	public CrookedDie1()
	{
		super();
		//I don't have to write this super();
		//It automatically inserted by the Java Complier.
		//Can't skip calling the constructor of the super class before return the to the subclass.
		//Because sometimes, the constructor of a subclass depends on the superclass.
		CrapsGame.println("  CrookedDie1's constructor called.");
	}

	public int getLastRoll() // this OVERRIDES (replaces) Die's getLastRoll()
	{
		return 3;
	}

	public String toString() // this OVERRIDES Die's toString()
	{
		return "A CrookedDie1 always rolling 3, and... "+ " " + super.toString();
	}
	
	public static String testStatic( ) {
		return "CrookedDie1.testStatic()";
	}

}
