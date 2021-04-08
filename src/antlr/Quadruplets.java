package antlr;

import java.util.LinkedList;

public class Quadruplets {

	public LinkedList<Quadruplet> quadruplets = new LinkedList<>() ;	
	 
	public void addQuadruplet(String op,String op1,String op2,String res)
	    {   Quadruplet quad =new Quadruplet(op,op1,op2,res);
	         quadruplets.add(quad);
	        		
	    }
	  public int addQuadruplet(Quadruplet quad)
	   {
		    quadruplets.add(quad);
	        return quadruplets.size();
	    }
	  
	  public Quadruplet getQuad(int i)
	  {
		  return quadruplets.get(i);
	  }
	public int size() {
		// TODO Auto-generated method stub
		return quadruplets.size();
	}
	  
	  
}
