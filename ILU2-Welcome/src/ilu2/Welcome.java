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
			String Noms = plusieursNoms(input);
			chaine.append("Hello, "+Noms);
			System.out.println(chaine);
		}else {
			chaine.append("Hello, "+lettresCapitale(input));
		}
		return chaine.toString();
	}

	private static String plusieursNoms(String input) {
		StringBuilder plusieursNom = new StringBuilder();
		String[] tab = input.split(",");
		for (int i = 0; i < tab.length-1; i++) {
			plusieursNom.append(lettresCapitale(tab[i])+", ");
		}
		plusieursNom.append(lettresCapitale(tab[tab.length-1]));
		return plusieursNom.toString();
	}
	
	private static String lettresCapitale(String input) {
		if(input.substring(0,1).equals(" ")) {
			return input.substring(1, 2).toUpperCase()+input.substring(2);
		}
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}

}

