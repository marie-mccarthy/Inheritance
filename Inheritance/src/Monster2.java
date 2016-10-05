public abstract class Monster2
	{
	protected String name;
	protected String food;
	protected String attack;
	protected int power;
	protected int lives;

	public abstract void bearsYoung();

	public void eats()
		{
		System.out.println("The " + name + " eats " + food + " for power.");
		}
	
	public void attacks()
		{
		System.out.println("The " + name +  "'s attack is " + attack + ".");
		}

	}