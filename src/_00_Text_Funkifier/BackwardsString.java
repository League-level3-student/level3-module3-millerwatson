package _00_Text_Funkifier;

import java.util.ArrayList;
import java.util.Stack;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		Stack<String> letters = new Stack<String>();
		String finishedString = "";
		for (int i = s.length() - 1; i > -1; i--) {
			finishedString = finishedString + s.substring(i, i + 1);
		}
		System.out.println("oh no");
		return finishedString;
	}

}
