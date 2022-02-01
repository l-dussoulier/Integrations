package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Calculs;

/**
 * 
 */

/**
 * @author test
 * 
 */
class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // Déclencher cette méthode avant l'ex�cution
	void setUp() throws Exception 
	{
		c1 = new Calculs(1,2);
		c2 = new Calculs(10,20);
		c3 = new Calculs(100,200);
	}

	

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() 
	{
		if (c1.multiplier() != 2)
		{
			fail("Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
		}
		if (c2.multiplier() != 200)
		{
			fail("Methode multiplier non conforme 10*20=200 ne fonctionne pas.");			
		}
		if (c3.multiplier() != 20000)
		{
			fail("Methode multiplier non conforme 100*200=20000 ne fonctionne pas.");			
		}

		
		// Est ce que (2 == 42) ? non donc : test en Erreur
		assertEquals(c1.multiplier(), 2, "Methode multiplier non conforme 2*1=2 ne fonctionne pas.");

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		assertEquals(c1.additionner(), 3, "Methode additionner non conforme");
		assertEquals(c2.additionner(), 30, "Methode additionner non conforme");
		assertEquals(c3.additionner(), 300, "Methode additionner non conforme");


	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {
		//fail("Not yet implemented");
		assertEquals(c1.diviser(),0, "Methode diviser non conforme");
		assertEquals(c2.diviser(),0, "Methode diviser non conforme");
		assertEquals(c3.diviser(),0, "Methode diviser non conforme");
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {
		assertEquals(c1.soustraire(),-1,"Methode soustraire non conforme");
		assertEquals(c2.soustraire(),-10,"Methode soustraire non conforme");
		assertEquals(c3.soustraire(),-100,"Methode soustraire non conforme");
	}

}
