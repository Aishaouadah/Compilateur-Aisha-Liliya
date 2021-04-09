package antlr;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import antlr.LangageParser.Ae2Context;
import antlr.LangageParser.IdentifersContext;
import antlr.LangageParser.Le1Context;
import antlr.LangageParser.Le2Context;
import antlr.LangageParser.Le3Context;
import antlr.LangageParser.Le4Context;
import antlr.LangageParser.Le6Context;
import antlr.LangageParser.Le7Context;
import antlr.LangageParser.Le8Context;
import antlr.LangageParser.Le9Context;
import antlr.LangageParser.ListIdentifiersContext;
import antlr.LangageParser.TypeContext;

public class Listener extends LangageBaseListener {
   public static String type;
   
	Semantique s ;
	int condition=0; // 0 faux 1 vrai
	int i =0; //num de quad
	boolean print = false;
	boolean scan = false;

	public Listener() {
	 this.s=new Semantique();
	}

	@Override
	public void exitIdentifers(IdentifersContext ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getText();
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		
		s.AddElementTS(id, type, true,line,column);

	if(print == true) {
		String idprint = ctx.getChild(0).getText();
		Token idTokenprint = ((TerminalNode) ctx.ID()).getSymbol();
		int lineprint = idToken.getLine();
		int columnprint = idToken.getCharPositionInLine();
		s.Nondeclarer(idprint, lineprint, columnprint);
	}
	if(scan == true)
	{
		String idprint = ctx.getChild(0).getText();
		Token idTokenprint = ((TerminalNode) ctx.ID()).getSymbol();
		int lineprint = idToken.getLine();
		int columnprint = idToken.getCharPositionInLine();
		s.Nondeclarer(idprint, lineprint, columnprint);
	}
	}

	@Override
	public void exitListIdentifiers(ListIdentifiersContext ctx) {
		// TODO Auto-generated method stub
				String id = ctx.getChild(0).getText();
				Token idToken = ctx.ID().getSymbol();
				int line = idToken.getLine();
				int column = idToken.getCharPositionInLine();
				s.AddElementTS(id, type, true,line,column);
	if (print == true) {
		String idprint = ctx.getChild(0).getText();
		Token idTokenprint = ((TerminalNode) ctx.ID()).getSymbol();
		int lineprint = idToken.getLine();
		int columnprint = idToken.getCharPositionInLine();
		s.Nondeclarer(idprint, lineprint, columnprint);
	}
		if (scan == true) {
			String idprint = ctx.getChild(0).getText();
			Token idTokenprint = ((TerminalNode) ctx.ID()).getSymbol();
			int lineprint = idToken.getLine();
			int columnprint = idToken.getCharPositionInLine();
			s.Nondeclarer(idprint, lineprint, columnprint);
		}
	}

	@Override
	public void enterPrintcheck1(LangageParser.Printcheck1Context ctx) {
		print = true;
	}

	@Override
	public void exitPrintcheck1(LangageParser.Printcheck1Context ctx) {
		print = false ;
	}

	@Override
	public void exitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		type = ctx.getText();
	}

	@Override
	public void exitLe1(Le1Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode)ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//sauv dans qc

		
		//child2
		String id1 = ctx.getChild(2).getText();
		Token idToken1 = ((TerminalNode) ctx.ID()).getSymbol();
		int line1 = idToken.getLine();
		int column1 = idToken.getCharPositionInLine();
		s.Nondeclarer(id1, line1, column1);
		//sauv dans qc
				
	}
	@Override
	public void exitLe2(Le2Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		
	}

	@Override
	public void exitLe3(Le3Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
			}

	@Override
	public void exitLe4(Le4Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
				
	}

	@Override
	public void exitLe6(Le6Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
			
	}

	@Override
	public void exitLe7(Le7Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}

	@Override
	public void exitLe8(Le8Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
				
	}
	
	@Override
	public void exitLe9(Le9Context ctx) {
		
		// TODO Auto-generated method stub
		
		String operand1= ctx.getChild(0).getText();
		String operand2= ctx.getChild(2).getText();
		String operateur= ctx.getChild(1).getText();
		int op1 = Integer.parseInt(operand1);
		int op2 = Integer.parseInt(operand2);
		switch  (operateur) {
		 case "<" :  if(op1 <op2) condition=1; break;
		 case "<=":  if(op1 <= op2) condition=1;   break;
		 case ">":   if(op1 >op2) condition=1; break;
		 case ">=":  if(op1 >=op2) condition=1; break;
		 case "==":  if(op1  == op2) condition=1; break;
		 case "!=":  if(op1 != op2) condition=1; break;
		 }
        //sauv quad de expr 
		  s.quadruplets.addQuadruplet("BNZ",operand1,operand2,"");
		//si condition vrai alors executer le then et sauter le else 
		if(condition==1) { }
		//si condition vrai alors sauter le then et executer le else 
		else {  s.quadruplets.addQuadruplet("BNZ",operand1,operand2,""); i++;}
			
	}



	@Override
	public void exitAe2(Ae2Context ctx) {
		// TODO Auto-generated method stub
		//child0
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//test
		//s.quadruplets.addQuadruplet("BR","","","");
			
	}

@Override public void exitSi(LangageParser.SiContext ctx) { 
	//saut 
	//si condition vrai alors executer le then et sauter le else
	//je pense que ce test est en plus  
			if(condition==1) {
				Quadruplet quad  = s.quadruplets.getQuad(i);
				String qc = Integer.toString(i);
				quad.setOperateur1(qc);
				s.quadruplets.addQuadruplet("BR","","","");
			
			}
}



@Override public void exitSinon(LangageParser.SinonContext ctx) {
	//mise a jour de quad de saut vers fin 
}

	@Override
	public void enterScan2(LangageParser.Scan2Context ctx) {
	scan = true;
	}

	@Override
	public void exitScan2(LangageParser.Scan2Context ctx) {
		scan = false;
	}



	@Override
	public void exitAssig2(LangageParser.Assig2Context ctx) {
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}

	@Override
	public void exitAssig3(LangageParser.Assig3Context ctx) {
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}

	@Override
	public void exitAssig4(LangageParser.Assig4Context ctx) {
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}

	@Override
	public void exitAssig5(LangageParser.Assig5Context ctx) {
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}
}
	