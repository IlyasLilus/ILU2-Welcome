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

	private static String EX_4(String input) {
		//utiliser split(,) pour avoir un tableau avec les deux noms
		//les traiter individuellement
		//dans un StringBuilder 
		//puis faire un appel dans welcome en returnant la chaine
		//pour savoir si il y a plusieurs noms, faire
		//une méthode qui détecte la présence d'une virgule dans la chaine
		//qui pourra être utilisé dans d'autres exos.
		
	}


}

