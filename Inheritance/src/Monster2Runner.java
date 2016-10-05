import java.util.ArrayList;

public class Monster2Runner
	{
	public static void main(String[] args)
		{
		ArrayList <Monster2> world = new ArrayList <Monster2>();

		world.add(new SeaDragon());
		world.add(new Kraken());
		world.add(new Dragon());
		world.add(new GiantSpider());


		for (Monster2 a : world)
			{	
		System.out.println();
			a.moves();
			a.attacks();
			a.eats();
			a.stregnth();
			}
		}
	}