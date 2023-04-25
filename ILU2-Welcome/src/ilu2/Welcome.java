package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		input = input.trim();
		if(input.isEmpty()) {
			chaine.append("Hello, my friend");
		}else if(input.equals(input.toUpperCase())) {
			chaine.append(Majuscules(input));
		}else if(input.contains(",")) {
			String Noms = plusieursNoms(input);
			chaine.append("Hello, "+Noms);
			if(isMajuscules(input)) {
				String nomMajs = nomMajuscules(input);
				chaine.append(". AND HELLO, "+nomMajs);
			}
		}else {
			chaine.append("Hello, "+lettresCapitale(input));
		}
		return chaine.toString();
	}

	private static String plusieursNoms(String input) {
		StringBuilder plusieursNom = new StringBuilder();
		String[] tab = input.split(",");
		for (int i = 0; i < tab.length-1; i++) {
			if (tab[i]==tab[i].toUpperCase()) {
				if (tab[i+1]==tab[tab.length-1]) {
					break;
				}
			}
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
	
	private static String Majuscules(String input) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("HELLO, "+input+" !");
		return chaine.toString();
	}
	
	private static String nomMajuscules(String input) {
		String[] tab = input.split(",");
		int compteur=0;
		StringBuilder CHAINE = new StringBuilder();
		for (int i = 0; i < tab.length-1; i++) {
			if(tab[i]==tab[i].toUpperCase()) {
				compteur++;
			}
		}
		String[] tabMaj = new String[compteur];
		int j = 0;
		for (int i = 0; i < tab.length-1; i++) {
			if(tab[i]==tab[i].toUpperCase()) {
				tabMaj[j]=tab[i];
				j++;
			}
		}
		if(tabMaj.length>1) {
			for (int y=0; y < tabMaj.length-1;y++) {
				CHAINE.append(lettresCapitale(tabMaj[y])+", ");
			}
			CHAINE.append(lettresCapitale(tabMaj[tabMaj.length-1])+" !");
		}else {
			CHAINE.append(lettresCapitale(tabMaj[tabMaj.length-1])+" !");
		}
		return CHAINE.toString();
	}
	
	private static boolean isMajuscules(String input) {
		String[] tab = input.split(",");
		for (int i = 0; i < tab.length-1; i++) {
			if(tab[i]==tab[i].toUpperCase()) {
				return true;
			}
		}
		return false;
	}
}

