import modele.Message;
import modele.decoration.CrypteurXOR;
import modele.decoration.InverseurDeMessage;
import modele.decoration.LettreVersChiffre;
import modele.decoration.RotateurDeLettre;
import modele.decoration.ChangerCouleur;

public class App {

	public static void main(String[] args) {
		Message secret = new Message("ii");
		//System.out.println(secret.getTexte());
		//Message secretInverser = new InverseurDeMessage(secret);
		//System.out.println(secretInverser.getTexte());
		//Message doubleSecretInverser = new InverseurDeMessage(secretInverser);
		//System.out.println(doubleSecretInverser.getTexte());
		
		//Message messageRot1 = new RotateurDeLettre(doubleSecretInverser);
		//System.out.println(messageRot1.getTexte());
		
		//Message messageCrypt = new CrypteurXOR(secret);
		//System.out.println(messageCrypt.getTexte());
		//Message messageDecrypte = new CrypteurXOR(messageCrypt);
		//System.out.println(messageDecrypte.getTexte());
		
		//Message messageRot2 = new ChangerCouleur(secret);
		//System.out.println(messageRot2.getTexte());
		Message messageChiffre = new LettreVersChiffre(secret);
		System.out.println(messageChiffre);
	}
	
}
