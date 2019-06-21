package ex4Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.pucrs.ex_email.ex4.Rover;

public class RoverTest {
	int firstInput[];
	
	

	@Before
	public void setup() {
		firstInput = new int[2];
		firstInput[0] = 5;
		firstInput[1] = 5;

	}

	@Test
	public void ShouldShowWhereThePlateauFinishes() {
		char secondInput = 'n';
		Rover rover = new Rover();
		rover.setActualCoordinates(firstInput[0], firstInput[1], secondInput);
		
		assertEquals(5, rover.getX());
		assertEquals(5, rover.getY());
		assertEquals('n', rover.getDirection());
	}

}
