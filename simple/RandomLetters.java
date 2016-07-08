import java.util.Random;

public class RandomLetters {

	private final static String englishLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String alphabetLetters;
	
	public RandomLetters(String alphabet)
	{
		if(alphabet.equals(null))
			setAlphabet(englishLetters);
		else
			setAlphabet(alphabet);
	}
	
	public void setAlphabet(String alphabet)
	{
		alphabetLetters=alphabet;
	}
	
	public String getAlphabet()
	{
		return alphabetLetters;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomLetters randomLetters = new RandomLetters(englishLetters);
		
		//int length = this.alphabetLetters.length();
		
		for (int i = 0; i < alphabetLetters.length(); i++) {
			System.out.println(randomLetters.getRandomLetter());
		}

	}
	
	public char getRandomLetter()
	{		
		Random rnd = new Random();
		
		return alphabetLetters.charAt(rnd.nextInt(alphabetLetters.length()));
	}

}
