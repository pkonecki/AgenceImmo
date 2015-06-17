
public class Maison extends BienImmo
{
	protected float superficieTerrain;
	protected float taxeFonciere;
	
	public Maison ()
	{
		super ();
		this.superficieTerrain=0;
		this.taxeFonciere=0;
	}
	
	public void saisir ()
	{
		super.saisir();
		
		System.out.println ("quel est la superficie du terrain :");
		this.superficieTerrain=Console.saisirFloat();
		
		System.out.println ("de combien est la taxe foncière :");
		this.taxeFonciere=Console.saisirFloat();
	}
	
	public void afficher()
	{
		super.afficher();
		
		System.out.println("\n\t" +
				"\t ------------Infos sur la maison ---------------\n"+
				"\t Superficie terrain : "+ this.superficieTerrain + "\n"+
				"\t Taxe fonciere : "+this.taxeFonciere + "\n");
	}

	public float getSuperficieTerrain() {
		return superficieTerrain;
	}

	public void setSuperficieTerrain(float superficieTerrain) {
		this.superficieTerrain = superficieTerrain;
	}

	public float getTaxeFonciere() {
		return taxeFonciere;
	}

	public void setTaxeFonciere(float taxeFonciere) {
		this.taxeFonciere = taxeFonciere;
	}
	
}
