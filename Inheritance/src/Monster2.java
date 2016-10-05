public abstract class Monster2
	{
	protected String name;
	protected String food;
	protected String attack;
	protected int power;
	protected int lives;

	public abstract void moves();
	public void eats()
		{
		System.out.println("The " + name + " eats " + food + " for power.");
		}
	
	public void attacks()
		{
		System.out.println("The " + name +  " attacks with " + attack + ".");
		}
	public void stregnth()
		{
		System.out.println("The "+name+" has "+ lives+" lives and a power of "+power );
		}
	

	}