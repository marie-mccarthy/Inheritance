import java.util.ArrayList;

public class Monster2Runner
	{
	public static void main(String[] args)
		{
		ArrayList <Monster2> land = new ArrayList <Monster2>();

		land.add(new SeaDragon());


		for (Monster2 a : land)
			{	
			a.moves();
			a.attacks();
			a.eats();
			System.out.println();
			}
		}
	}