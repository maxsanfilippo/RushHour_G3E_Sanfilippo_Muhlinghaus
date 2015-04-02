
/**
 * @author sanfilma muhlinge
 * Classe principale du jeu : deroulement de la partie
 */
public class PartieDeRushHour
{
	/**
	 * Un plateau de jeu sur lequel la partie est jou�e
	 */
	private Plateau plateau;
	/**
	 * Bool�en indiquant l'�tat de la partie : 
	 * vrai = la partie est termin�e
	 * faux = la partie est en cours 
	 */
	private boolean partieFinie;	
	
	/**
	 * Initialise une nouvelle partie avec un nouveau plateau compos� de cases : une voiture rouge ( voitureJoueur) 
	 * est en place align�e � la sortie
	 */
	public PartieDeRushHour()
	{
		this.plateau = new Plateau();
	}
	
	/**
	 * Algorithme de d�roulement de la partie
	 */
	public void jouer()
	{
		while (partieFinie=false)
		{
			//Voiture.selectionnerVoiture(int ligne, int colonne)
			//Voiture.deplacer(int ligne, int colonne)
		}
	}
}
