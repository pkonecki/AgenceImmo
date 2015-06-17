
public class Villa extends Maison
{
	private String typeAssurance;
	private boolean piscine;
	
	public Villa ()
	{
		this.typeAssurance="";
		this.piscine=false;
	}
	
	public void saisir ()
	{
		super.saisir ();
		
		System.out.println ("donner le type d'assurance : ");
		this.typeAssurance = Console.saisirString();

	    String unePiscine ="";
	    System.out.println("la villa a t-elle une piscine : O/N");
		unePiscine=Console.saisirString();
			
		    do
		    {
			    if (unePiscine =="O") 
				    {
				       System.out.println ( "la villa a une piscine" );
				       this.piscine = true ;
				    } 
			    
			    else  
			    {
			        if (unePiscine=="N")
				        {
				            System.out.println ("la villa n'a pas de piscine" );
				            this.piscine = false ;
				        }
			    }
			        //return piscine; 
		    } while (unePiscine != "O" || unePiscine != "N");
	}
	
    public void afficher ()
	{
		super.afficher();
		
		System.out.println("\n\t" +
				"\t ------------Infos sur la villa ---------------\n"+
				"\t Nombre de pièce : "+ this.typeAssurance + "\n"+
				"\t Prix de la caution : "+this.piscine + "\n");	
	}
}
