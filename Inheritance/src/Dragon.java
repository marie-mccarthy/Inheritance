
public class Dragon extends LandMonster
	{
		public Dragon()
		{
			lives = 5;
			power = 5; 
			name = "Dragon";
			food = "mountains";
			attack = "fire";
		}
		@Override
		public void attacks()
			{
			System.out.println("The " + name +  " breathes fire when it attacks");
			}
	}