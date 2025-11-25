package modele.decoration;

import modele.Message;

public class LettreVersChiffre extends Message {
	protected Message message;
	protected String modifiable;
	
	
	public LettreVersChiffre(Message message) {
		super();
		this.message = message;
		this.VersChiffre();
	
	}
	public String getAuteur() {
		return this.message.getAuteur();
	}
	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}
	public String getTexte() {
		return modifiable;
	}
	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.modifiable = texte;
	}
	
	public void VersChiffre() {
		char[] lettres = message.getTexte().toCharArray();
		int[] nouvelles = new int[lettres.length];
		for(int position = 0; position < lettres.length; position++) {
			char lettre = lettres[position];
			
			if(lettre >= 'a' && lettre <= 'z') {
				int nombre = lettre - 'a' + 1;
				
				nouvelles[position] = nombre;

				System.out.println("lettre : " + lettre + " en nombre : " + nombre);
			}
			this.modifiable = new String(nouvelles.toString());
			
		}
		
		
	}
}
