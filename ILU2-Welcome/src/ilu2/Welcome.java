package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Hello, "+input.substring(0, 1).toUpperCase()+input.substring(1));
		return chaine.toString();
	}
}
