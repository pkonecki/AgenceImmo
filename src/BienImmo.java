
public class BienImmo
{
	protected String code, adresse;
	public float getSurface() {
		return surface;
	}



	public void setSurface(float surface) {
		this.surface = surface;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}

	protected float surface, prix;
	
	public BienImmo ()
	{
		this.code = "";
		this.surface = 0;
		this.prix = 0;
		this.adresse = "";
	}
	
	
	
	public void saisir ()
	{	
		System.out.println("Donner le code de l'habitation : ");
		this.code = Console.saisirString();
			
		System.out.println("Donner l'adresse de l'habitation : ");
		this.adresse = Console.saisirString();
			
		System.out.println("Donner la surface du bien : ");
		this.surface = Console.saisirFloat();
			
		System.out.println("Donner le prix du bien : ");
		this.prix = Console.saisirFloat();
	}
	
	public void afficher ()
	{
		System.out.println("\n\t" +
				"\t ------------Infos sur le bien immobilier ---------------\n"+
				"\t code : "+ this.code + "\n"+
				"\t Adresse du bien : "+this.adresse + "\n"+
				"\t Superficie du bien : "+this.surface + "\n"+
				"\t Prix du bien : "+this.prix + "\n");
	}		
	
	
}