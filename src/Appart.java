
public class Appart extends BienImmo
{
	private int nbPiece;
	private boolean balcon;
	private float caution;
	
	public  Appart ()
	{
		super ();
		this.nbPiece=0;
		this.balcon=false;
		this.caution=0;
	
	}
	
	public void saisir ()
	{
		super.saisir ();
		
		System.out.println ("donner le nbre de piece : ");
		this.nbPiece = Console.saisirInt();
		{    
			String unBalcon ="";
		    do
		    {
		    	unBalcon=Console.saisirString();
		    	System.out.println("l'appartement a t-il un balcon : O/N");
			    if (unBalcon.equalsIgnoreCase("O")) 
				    {
				       System.out.println ( "l'appartement a un balcon" );
				       this.balcon = true ;
				       break;
				    } 
			    
			    else  
			    {
			        if (unBalcon.equalsIgnoreCase("N"))
				        {
				            System.out.println ("l'appartement n'a pas de balcon" );
				            this.balcon = false ;
				            break;
				        }
			    }
			        //return balcon; 
		    } while ( !unBalcon.equalsIgnoreCase("N") && !unBalcon.equalsIgnoreCase("O"));
	    
		   
	    System.out.println ("Donner le montant de la caution : ");
		this.caution = Console.saisirFloat();  
		}
	}
	
	public void afficher ()
	{
		super.afficher();
		
		System.out.println("\n\t" +
				"\t ------------Infos sur le bien immobilier ---------------\n"+
				"\t Nombre de pièce : "+ this.nbPiece + "\n"+
				"\t Balcon : "+this.balcon + "\n"+
				"\t Prix de la caution : "+this.caution + "\n");	
	}	
	
	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public boolean isBalcon() {
		return balcon;
	}

	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}

	public float getCaution() {
		return caution;
	}

	public void setCaution(float caution) {
		this.caution = caution;
	}


}
