package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		input = input.trim();
		if(input.isEmpty()) {
			chaine.append("Hello, my friend");
		}else if(input.equals(input.toUpperCase())) {
			chaine.append("HELLO, "+input+" !");
		}else if(input.contains(",")) {
			String[] tab = EX_4(input);
			chaine.append("Hello, "+tab[0].substring(0,1).toUpperCase()+tab[0].substring(1)+", "+tab[1].substring(0,1).toUpperCase()+tab[1].substring(1));
		
		}else {
			chaine.append("Hello, "+input.substring(0, 1).toUpperCase()+input.substring(1));
		}
		return chaine.toString();
	}

	private static String[] EX_4(String input) {
		String[] tab = input.split(",");
		return tab;
	}


}

