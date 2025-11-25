package modele.decoration;

import modele.Message;

public class RotateurDeLettre extends Message{
	protected Message message;
	protected String rotation;
	
	
	
	public RotateurDeLettre(Message message) {
		super();
		this.message = message;
		//this.texte = message.getTexte();
		this.Rotationer();
	}
	public String getAuteur() {
		return this.message.getAuteur();
	}
	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}
	public String getTexte() {
		return rotation;
	}
	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.rotation = texte;
	}
	
	public void Rotationer() {
		char[] lettres = message.getTexte().toCharArray();
		char[] nouvelles = new char[lettres.length];
		for(int position = 0; position < lettres.length; position++) {
			char lettre = lettres[position];
			System.out.println("lettre : " + lettre);
			
			char nouvelleLettre = (char)(lettre+1);
			if(nouvelleLettre == ('z'+1)) {
				nouvelleLettre = 'a';
			}
			if(nouvelleLettre == ('Z'+1)) {
				nouvelleLettre = 'A';
			}
			System.out.println("nouvelle : " + nouvelleLettre);
			
			nouvelles[position] = nouvelleLettre;
		}
		this.rotation = new String(nouvelles);
	}
}
