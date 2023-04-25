package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		input = input.trim();
		String inputDeb = input.substring(0, input.length()-dernier(input));
		String inputFin = input.substring(input.length()-dernier(input));
		if(inputDeb.isEmpty()) {
			chaine.append("Hello, my friend");
		}else if(inputDeb.equals(inputDeb.toUpperCase())) {
			chaine.append(Majuscules(inputDeb));
		}else if(inputDeb.contains(",")) {
			String Noms = plusieursNoms(inputDeb);
			chaine.append("Hello, "+Noms);
			if(isMajuscules(inputDeb)) {
				String nomMajs = nomMajuscules(inputDeb);
				chaine.append(". AND HELLO "+nomMajs);
			}
		}else {
			chaine.append("Hello, "+lettresCapitale(inputDeb));
		}
		chaine.append(" AND "+inputFin+" !");
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
			plusieursNom.append(tab[i]+" and ");
		}
		plusieursNom.append(tab[tab.length-1]);
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
				CHAINE.append(tabMaj[y]+", ");
			}
			CHAINE.append(tabMaj[tabMaj.length-1]);
		}else {
			CHAINE.append(tabMaj[tabMaj.length-1]);
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
	
	private static int dernier(String input) {
		String[] tab = input.split(",");
		return tab[tab.length-1].length();
	}
}

