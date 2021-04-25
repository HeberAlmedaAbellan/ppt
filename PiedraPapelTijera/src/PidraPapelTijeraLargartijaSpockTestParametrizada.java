import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



	
	@RunWith(Parameterized.class)
public class PidraPapelTijeraLargartijaSpockTestParametrizada{
	
	private String first;
	private String second;
	private int res;
		
	public PidraPapelTijeraLargartijaSpockTestParametrizada(String f,String s, int r) {
			
			first=f;
			second=s;
			res=r;
		}
		@Parameters
		public static Collection<Object[]> Strings(){

			return Arrays.asList(new Object[][] {
				{"Tijeras","papel",1},{"Tijeras","Lagartija",1},{"Tijeras","Piedra",2},{"Tijeras","Spock",2},{"Tijeras","Tijeras",0},
				{"Papel","Papel",0},{"Papel","Piedra",1},{"Papel","Spock",1},{"Papel","Lagartija",2},{"Papel","Tijeras",2},
				{"Piedra","Tijeras",1},{"Piedra","Lagartija",1},{"Piedra","Spock",2},{"Piedra","Papel",2},{"Piedra","Piedra",0},
				{"Lagartija","Papel",1},{"Lagartija","Spock",1},{"Lagartija","Piedra",2},{"Lagartija","Tijeras",2},{"Lagartija","Lagartija",0},
				{"Spock","Tijeras",1},{"Spock","Piedra",1},{"Spock","Lagartija",2},{"Spock","Papel",2},{"Spock","Spock",0},
			});
		}
			
		@Test
		public void testGame() {
			
			
			assertEquals(res,MoveWords.checkWinner(first,second));
			
			
		}
		
		
}
