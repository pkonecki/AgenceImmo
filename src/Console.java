import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {
	static BufferedReader entree=new BufferedReader(new InputStreamReader(System.in));
public static int saisirInt() 
{
	String chaine="";
	int nb=0;
	boolean ok=false;
	do{
		try{
			chaine=entree.readLine();
			nb=Integer.parseInt(chaine);
			ok=true;
		}
		catch(IOException x)
		{
			System.out.println("erreur de saisie !");
			ok=false;
		}
		catch(NumberFormatException x)
		{
			System.out.println("erreur sur le format du nombre !");
			ok=false;
		}
	}while (ok==false);
	return nb;
}

public static float saisirFloat()
{
	String chaine="";
	float nb=0;
	boolean ok=false;
	do{
		try{
			chaine=entree.readLine();
			nb=Float.parseFloat(chaine);
			ok=true;
		}
		catch(IOException x)
		{
			System.out.println("erreur de saisie !");
			ok=false;
		}
		catch(NumberFormatException x)
		{
			System.out.println("erreur sur le format du nombre !");
			ok=false;
		}
	}while (ok==false);
	return nb;
}
public static String saisirString()
{
	String chaine="";
	

		try{
			chaine=entree.readLine();
			
		}
		catch(IOException x)
		{
			System.out.println("erreur de saisie !");
			
		}
	return chaine;
}
public static char saisirChar()
{
	String chaine="";
	

	try{
		chaine=entree.readLine();
		if (chaine.length() > 1)
			throw new IOException();
	}
	catch(IOException x)
	{
		System.out.println("erreur de saisie !");
		
	}
return chaine.charAt(0);
}

}