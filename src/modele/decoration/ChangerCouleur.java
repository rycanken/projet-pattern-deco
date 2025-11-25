package modele.decoration;

import modele.Message;

public class ChangerCouleur extends Message{
	protected Message message;
	protected String modifiable;
	public static final String ROUGE = "\u001B[31m";
	
	
	public ChangerCouleur(Message message) {
		super();
		this.message = message;
		this.ChangerCouleur();
	
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
	
	public void ChangerCouleur() {
		char[] lettres = message.getTexte().toCharArray();
		char[] nouvelles = new char[lettres.length];
		for(int position = 0; position < lettres.length; position++) {
			char lettre = lettres[position];
			System.out.println(ROUGE + "Lettre : " + lettre);
			
			
		}
		
		this.modifiable = new String(nouvelles);
	}
}
