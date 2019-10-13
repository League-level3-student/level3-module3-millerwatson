package _00_Text_Funkifier;

public class StringOrganizer extends SpecialString{

	public StringOrganizer(String s) {
		super(s);
	}
	
	public String funkifyText(String s) {
		String fs = "";
		char[] characters = s.toCharArray();
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < characters.length - 1; i++) {
				if (characters[i] > characters[i + 1]) {
					char hold = characters[i];
					characters[i] = characters[i + 1];
					characters[i + 1] = hold;
					isSorted = false;
				}
			}
		}
		for (int i = 0; i < characters.length; i++) {
			if ((int)characters[i] != 32) {
				fs = fs + characters[i];
			}
		}
		return fs;
	}
}
