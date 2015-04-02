
/**
 * @author sanfilma muhlinge
 * Plateau de jeu composé de cases
 */
public class Plateau
{
	/**
	 * Nombre de ligne du plateau par défaut
	 */
	public final static int NB_LIGNES=7;
	/**
	 * Nombre de colonne du plateau par défaut
	 */
	public final static int NB_COLONNES=7;
	
	/**
	 * Nombre de ligne du plateau
	 */
	private final int nbLigne;
	
	/**
	 * Nombre de colonne du plateau 
	 */
	private final int nbColonne;
	
	/**
	 * Tableau de cases
	 */
	private Case[][] cases;
	
	/**
	 * Constructeur de nouveau Plateau avec les paramètres par défaut
	 */	
	public Plateau()
	{
		this.nbLigne=NB_LIGNES;
		this.nbColonne=NB_COLONNES;
		//TODO : faire une boucle pour initialiser le tableau : la graduation, les voitutres et 0
	}
	
	
	
}
