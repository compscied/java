import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomLettersTest {

	RandomLetters randomLetters;
	private static String alphabetLetters;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		randomLetters = new RandomLetters("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRandomLetters() {
		
		alphabetLetters= randomLetters.getAlphabet();
		
		for (int i = 0; i < alphabetLetters.length(); i++) {
			System.out.println(randomLetters.getRandomLetter());
		}
		
	}

	@Test
	public void testSetAlphabet() {
		randomLetters.setAlphabet("jklsjldafjdslj");
	}

	@Test
	public void testGetRandomLetter() {
		assertNotNull(randomLetters.getRandomLetter());
	}

}
