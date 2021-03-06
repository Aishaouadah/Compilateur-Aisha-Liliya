package antlr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class Semantique {
	public HashMap <String,Element> TableSymbol;
	public ArrayList <ElementErreur> TableErreur;
	public Quadruplets quadruplets;
	public Assembleur ass;
public Semantique() {
		
		this.TableSymbol = new HashMap<String,Element>();
		this.TableErreur = new ArrayList<ElementErreur>();
		this.quadruplets  = new Quadruplets();
		this.ass = new Assembleur();
	}

public void AddElementTS(String id,String type ,boolean declared, int line , int column)
{
	if(TableSymbol.containsKey(id))
	{
		AddElementTE("Double declaration",line,column);
	}
	Element e = new Element(id,type,declared);
	e.setValeur("0");
	TableSymbol.put(id, e);
}


public void AddElementTE(String type_erreur,int line, int column )
{
	ElementErreur r = new ElementErreur(type_erreur,line,column);
	TableErreur.add(r);
}

public void Nondeclarer(String id,int line, int column)
{
	if(!TableSymbol.containsKey(id))
	{
		AddElementTE("Non d?clarer",line,column);

	}
}

public void printTS()
{
	Collection<Element> es =  this.TableSymbol.values();
	System.out.println("print table symbol");
	es.forEach(e -> System.out.println(e.toString()));
	
}
public void printTE()
{
	System.out.println("print table erreur");

	for (ElementErreur er : TableErreur)
	{
			System.out.println(er.toString());
	}
}
public void printQuad()
{int i; 
	System.out.println("les quad generer : ");
	System.out.println("linked list quad is : ");
	for(i = 0; i<=quadruplets.size();i++) {	System.out.println("quad  "+quadruplets.getQuad(i).toString());}
}
public void printCODEOBJET()
{
ass.printASS();
}

}
