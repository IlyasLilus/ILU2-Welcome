package ilu2;

public class Welcome {
	private static boolean dernierMaj = false;
	
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		input = input.replace(" ", "").trim();
		if(input.isEmpty()) {
			chaine.append("Hello, my friend");
		}else if(input.equals(input.toUpperCase())) {
			chaine.append(Majuscules(input));
		}else if(input.contains(",")) {
			String[] majuscules = new String[0];
			if(isMajuscules(input)) {
				majuscules = separationMajuscules(input);
			}
			String[] minuscules = separationMinuscules(input);
			if(majuscules.length == 0) {
				String Noms = plusieursNomsMinuscules(minuscules);
				chaine.append("Hello, "+Noms);
			}else {
				chaine.append("Hello, "+plusieursNomsMinuscules(minuscules)+".");
				chaine.append(" AND HELLO "+plusieursNomsMajuscules(majuscules));
			}
		}else {
			chaine.append("Hello, "+lettresCapitale(input));
		}
		return chaine.toString();
	}

/*####################################################################*/
	
	private static String[] separationMajuscules(String input) {
		String[] separer = input.split(",");
		int compteur = 0;
		for (int i = 0; i< separer.length;i++) {
			if(lettresCapitale(separer[i]).equals(lettresCapitale(separer[i].toUpperCase()))) {
				compteur++;
			}
		}
		if (compteur>=2) {
			dernierMaj = true;
		}
		String[] majuscules = new String[compteur];
		int j = 0;
		for (int i = 0; i <= separer.length-1; i++) {
			if(lettresCapitale(separer[i]).equals(lettresCapitale(separer[i].toUpperCase()))) {
				majuscules[j]=separer[i];
				j++;
			}
		}
		return majuscules;
	}
	
/*####################################################################*/
	
	private static String[] separationMinuscules(String input) {
		String[] separer = input.split(",");
		int compteur = 0;
		for (int i = 0; i< separer.length;i++) {
			if(lettresCapitale(separer[i]).equals(lettresCapitale(separer[i].toLowerCase()))) {
				compteur++;
			}
		}
		String[] minuscules = new String[compteur];
		int y = 0;
		for (int i = 0; i <= separer.length-1; i++) {
			if(lettresCapitale(separer[i]).equals(lettresCapitale(separer[i].toLowerCase()))) {
				minuscules[y]=separer[i];
				y++;
			}
		}
		return minuscules;
	}
	
/*####################################################################*/
	
	private static String plusieursNomsMinuscules(String[] minuscules) {
		StringBuilder plusieursNomMin = new StringBuilder();
		for (int i = 0; i < minuscules.length-1; i++) {
			plusieursNomMin.append(lettresCapitale(minuscules[i]));
			if(minuscules[i]!=minuscules[minuscules.length-2]) {
				plusieursNomMin.append(", ");
			}
		}
		plusieursNomMin.append(" and ");
		plusieursNomMin.append(lettresCapitale(minuscules[minuscules.length-1]));
		return plusieursNomMin.toString();
	}
	
/*####################################################################*/
	
	private static String plusieursNomsMajuscules(String[] majuscules) {
		StringBuilder plusieursNomMaj = new StringBuilder();
		for (int i = 0; i < majuscules.length-1; i++) {
			plusieursNomMaj.append(lettresCapitale(majuscules[i]));
		}
		if(dernierMaj) {
			plusieursNomMaj.append(" AND "+lettresCapitale(majuscules[majuscules.length-1])+" !");
		}else {
			plusieursNomMaj.append(lettresCapitale(majuscules[majuscules.length-1])+" !");
		}
		
		return plusieursNomMaj.toString();
	}
	
/*####################################################################*/
	
	private static String lettresCapitale(String input) {
		return input.substring(0, 1).toUpperCase()+input.substring(1);
	}
	
/*####################################################################*/
	
	private static String Majuscules(String input) {
		StringBuilder chaine = new StringBuilder();
		chaine.append("HELLO, "+input+" !");
		return chaine.toString();
	}

/*####################################################################*/

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