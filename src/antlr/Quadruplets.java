package antlr;

import java.util.HashMap;
import java.util.LinkedList;

public class Quadruplets {

	public LinkedList<Quadruplet> quadruplets = new LinkedList<>();
	public static HashMap<String,String> branchements = new HashMap<>();

	public Quadruplets( ){
		//comparing a with b the 0 is included
		/*  BG/BGE(a>b/a>=b)
			BL/BLE(a<b/a<=b)
			BE/BNE(a=b/a!=b) */
		branchements.put(">","BG");
		branchements.put(">=","BGE");
		branchements.put("<","BL");
		branchements.put("<=","BLE");
		branchements.put("==","BE");
		branchements.put("!=","BNE");
	}
	public static String getBranchement(String s)
	{
		return branchements.get(s);
	}


	public int addQuadruplet(String op, String op1, String op2, String res)
	    {   Quadruplet quad =new Quadruplet(op,op1,op2,res);
			return addQuadruplet(quad);

	    }

	public int addQuadruplet(Quadruplet quad)
	{
		quadruplets.add(quad);
		return (quadruplets.size());
	}

	  public Quadruplet getQuad(int i)
	  {
		  return quadruplets.get(i);
	  }
	public int size() {
		// TODO Auto-generated method stub
		return (quadruplets.size()-1);
	}
	  
	  
}
