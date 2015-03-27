
/**
 * @author sanfilma muhlinge
 * Classe principale du jeu : deroulement de la partie
 */
public class PartieDeRushHour
{
	/**
	 * Un plateau de jeu sur lequel la partie est jouée
	 */
	private Plateau plateau;
	/**
	 * Booléen indiquant l'état de la partie : 
	 * vrai = la partie est terminée
	 * faux = la partie est en cours 
	 */
	private boolean partieFinie;	
	
	/**
	 * Initialise une nouvelle partie avec un nouveau plateau composé de cases : une voiture rouge ( voitureJoueur) 
	 * est en place alignée à la sortie
	 */
	public PartieDeRushHour()
	{
		this.plateau = new Plateau();
	}
	
	/**
	 * Algorithme de déroulement de la partie
	 */
	public void jouer()
	{
		while (partieFinie=false)
		{
			Voiture.selectionnerVoiture()
			//TODO : gérer le déplacement : action du joueur
		}
	}
}
