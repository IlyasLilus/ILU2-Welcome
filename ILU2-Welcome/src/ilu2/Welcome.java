package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		input = input.trim();
		if(input.isEmpty()) {
			chaine.append("Hello, my friend");
		}else if(input.equals(input.toUpperCase())) {
			chaine.append("HELLO, "+input+" !");
		}else {
			chaine.append("Hello, "+input.substring(0, 1).toUpperCase()+input.substring(1));
		}
		return chaine.toString();
	}
}
