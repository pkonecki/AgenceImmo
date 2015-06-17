import java.util.LinkedList;


public class Agence {

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public LinkedList<BienImmo> getLesBiens() {
		return lesBiens;
	}

	public void setLesBiens(LinkedList<BienImmo> lesBiens) {
		this.lesBiens = lesBiens;
	}


	private String nom, adresse, contact;
	private LinkedList<BienImmo> lesBiens;
	
	public Agence ()
	{
		this.nom ="";
		this.adresse="";
		this.contact="";
		this.lesBiens=new LinkedList<BienImmo>();
		
	}
	
	public void saisir()
	{
			System.out.println ("Donner le nom de l'agence");
			this.nom=Console.saisirString();
			
			System.out.println ("Donner l'adresse de l'agence");
			this.adresse=Console.saisirString();
			
			System.out.println ("Donner le contact de l'agence");
			this.contact=Console.saisirString();
	}
	
	public void afficher()
	{
		System.out.println("\n\t" +
				"\t ------------Infos sur l'agence ---------------\n"+
				"\t Nom de l'agence : "+ this.nom + "\n"+
				"\t adresse de l'agence : "+this.adresse + "\n"+
				"\t Contact de l'agence : "+this.contact + "\n");	
	}
	
	
	public void ajouter ()
	{
		int choix =0;

		do {
			System.out.println ("1 - pour un appart\n 2 - pour une maison\n 3 - pour une villa\n 0 pour quitter\n");
			System.out.println ("votre choix");
			choix = Console.saisirInt();
			switch (choix)
			{
			case 1 : {
				Appart unAppart = new Appart();
				unAppart.saisir ();
				this.lesBiens.add(unAppart);
					}break;
			
			
			case 2 : {
				Maison uneMaison = new Maison();
				uneMaison.saisir ();
				this.lesBiens.add(uneMaison);
					}break;
			
			case 3 : {
				Villa uneVilla = new Villa();
				uneVilla.saisir ();
				this.lesBiens.add(uneVilla);
					}break;
			}
		} while (choix != 0);
		
	}
	
	public void retirer ()
	{
		String code;
		System.out.println("Donner le code du bien a supprimer :");
		code = Console.saisirString();
		for(BienImmo bien : this.lesBiens)
		{
			if (bien.code.equalsIgnoreCase(code))
			{
				this.lesBiens.remove(bien);
				System.out.println("le bien a été retiré");
				return;
			}
		}
		System.out.println("aucun bien avec ce code");
	}
	
	public void afficherBiens ()
	{
		//parcour par valeur
		for (BienImmo unBien : this.lesBiens)
		{
			unBien.afficher();
		}
	}
		
	public void afficherLesApparts ()
	{
		//parcour par valeur
				for (BienImmo unBien : this.lesBiens)
				{
					if (unBien instanceof Appart)
					{
						unBien.afficher();
					}
				}
	}
	
	public void afficherBien (String code)
	{
		//parcour par cle
		for (BienImmo bien : this.lesBiens)
		{
			if (bien.code.equalsIgnoreCase(code))
			{
				bien.afficher();
				return;
			}
		}	
		System.out.println("le bien n'a pas été trouvé");
	}
	
	
	public BienImmo rechercherBien (String code)
	{
		
		//autre version mieux:
		
		for(BienImmo bien : this.lesBiens)
		{
			if (bien.code.equalsIgnoreCase(code))
				return bien;
		}
		//return null;
		//
		boolean trouve=false;
		int i=0;
		while (trouve==false && i<this.lesBiens.size())
		{
			if (code.equalsIgnoreCase(this.lesBiens.get(i).code))
			{
				trouve=true;
			}
			else
			{
				i++;
			}
		}
		if (trouve==true)
		{
			return this.lesBiens.get(i);
		}
		else
		{
			return null;
		}	
		

	}	
	
	public void rechercherPS (float prix, float surfaceTerrain)
	{
		//afficher les maisons qui ont des prix supérieur a prix et des surfaces terrain supérieur surfaceterrain
		for (BienImmo unBien : this.lesBiens)
		{
			if (unBien instanceof Maison && unBien.getPrix() > prix && ((Maison) unBien).getSuperficieTerrain() > surfaceTerrain)
			{
				unBien.afficher();
				
			}
		}
	}
	
	public void rechercherVille (String ville)
	{
		//afficher tous les biens existants dans une ville : ville
		for (BienImmo unBien : this.lesBiens)
		{
			if (unBien.getAdresse().contains (ville))
			{
				unBien.afficher();
				
			}
		}
		
		
	}
	
	public void menu ()
	{
		int choix =0;
		do
		{
			System.out.println("1 - saisir les données de l'agence");
			System.out.println("2 - afficher les infos de l'agence");
			System.out.println("3 - ajouter un bien immo");
			System.out.println("4 - lister tous les biens");
			System.out.println("5 - lister que les apparts");
			System.out.println("0 - quitter");
			choix = Console.saisirInt();
			switch (choix)
			{
				case 1 : this.saisir(); break;
				case 2 : this.afficher(); break;
				case 3 : this.ajouter(); break;
				case 4 : this.afficherBiens(); break;
				case 5 : this.afficherLesApparts(); break;
				case 6 :
				{
				float prix, st;
				System.out.println("Donner le seuil du prix");
				prix = Console.saisirFloat();
				System.out.println("Donner le seuil de la surface terrain");
				st = Console.saisirFloat();
				System.out.println("Voici les maisons qui repondent aux criteres");
				this.rechercherPS(prix, st);
				break;
				}
				case 7 :
				{
					String ville;
					System.out.println("Donner la ville :");
					ville = Console.saisirString();
					
					this.rechercherVille(ville);
					break;
				}
				
			}
			
		}while (choix !=0);
	}
	
	
	public static void main(String args[])
	{
	Agence uneAgence=new Agence();
	uneAgence.menu();
	}
	
	
}
	
	
	
	

