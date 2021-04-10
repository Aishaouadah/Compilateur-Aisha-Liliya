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

import java.util.Scanner;

import static antlr.Quadruplets.getBranchement;

public class Listener extends LangageBaseListener {
	public static String type;

	Semantique s;
	int condition = 0;
	boolean print = false;
	boolean scan = false;
	//pour instruction if
	int Sauv_BZ;
	int Sauv_BR;

	public Listener() {
		this.s = new Semantique();
	}

	@Override
	public void exitIdentifers(IdentifersContext ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getText();
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();

		s.AddElementTS(id, type, true, line, column);

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
	public void exitListIdentifiers(ListIdentifiersContext ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ctx.ID().getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.AddElementTS(id, type, true, line, column);
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
		print = false;
	}


	@Override
	public void exitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		type = ctx.getText();
	}


	@Override
	public void exitLe1(Le1Context ctx) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.getChild(0)).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);


		//child2
		String id1 = ctx.getChild(2).getText();
		Token idToken1 = ((TerminalNode) ctx.getChild(2)).getSymbol();
		int line1 = idToken1.getLine();
		int column1 = idToken1.getCharPositionInLine();
		s.Nondeclarer(id1, line1, column1);


		//quad
		String operation = ctx.getChild(1).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, id, id1, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}

	@Override
	public void exitLe2(Le2Context ctx) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//quad
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, id, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");

	}

	@Override
	public void exitLe3(Le3Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//quad
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, id, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");

	}

	@Override
	public void exitLe4(Le4Context ctx) {
// TODO Auto-generated method stub
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//quad
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, id, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");

	}

	@Override
	public void exitLe6(Le6Context ctx) {

		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, id, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}

	@Override
	public void exitLe7(Le7Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//quad
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, id, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}

	@Override
	public void exitLe8(Le8Context ctx) {
		// TODO Auto-generated method stub
		String id = ctx.getChild(2).getText();
		Token idToken = ((TerminalNode) ctx.ID()).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, id, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}


	//apres la condition
	@Override
	public void exitLe9(Le9Context ctx) {
		// TODO Auto-generated method stub
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else 
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");

	}


	@Override
	public void exitAe1(LangageParser.Ae1Context ctx) {
		// TODO Auto-generated method stub
		//child0
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.getChild(0)).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
	}

	@Override
	public void exitAe4(LangageParser.Ae4Context ctx) {
		Token idToken = ((TerminalNode) ctx.getChild(0)).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();

		if (operation.equals("/") && (operand2.equals("0")))
			//add err a la te
			System.out.println("erreur division par 0 line = " + line + " column = " + column);
		else
			s.quadruplets.addQuadruplet(operation, operand1, operand2, "");

	}


	@Override
	public void enterLe10(LangageParser.Le10Context ctx) {
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}

	@Override
	public void exitLe10(LangageParser.Le10Context ctx) {
		String operand1 = ctx.getChild(0).getText();
		String operation = ctx.getChild(1).getText();
		String operand2 = ctx.getChild(2).getText();
		String br = getBranchement(operation);
		//sauv quad de expr
		//sauv condtion pour mettre a jour
		condition = s.quadruplets.addQuadruplet(br, operand1, operand2, "");
		String Tcondition = Integer.toString(condition);
		//si condition vrai alors sauter le then et executer le else
		Sauv_BZ = s.quadruplets.addQuadruplet("BZ", "", Tcondition, "");


	}

	@Override
	public void exitIf_then_else(LangageParser.If_then_elseContext ctx) {
		//mise a jour de Sauv BR fin
		s.quadruplets.getQuad(Sauv_BR - 1).setOperateur1("" + (s.quadruplets.size() + 1));

	}

	// debut de sinon
	@Override
	public void exitSi(LangageParser.SiContext ctx) {
		//branchement vers la fin
		Sauv_BR = s.quadruplets.addQuadruplet("BR", "", "", "");

		s.quadruplets.getQuad(Sauv_BZ - 1).setOperateur1("" + (s.quadruplets.size()));
	}


	@Override
	public void exitScan2(LangageParser.Scan2Context ctx) {
		scan = false;
	}

	@Override
	public void enterScan2(LangageParser.Scan2Context ctx) {
		scan = true;
	}


	@Override
	public void exitAssig1(LangageParser.Assig1Context ctx) {
		String id = ctx.getChild(0).getText();
		Token idToken = ((TerminalNode) ctx.getChild(0)).getSymbol();
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine();
		s.Nondeclarer(id, line, column);
		//sauv dans qc

		String id1 = ctx.getChild(2).getText();
		Token idToken1 = ((TerminalNode) ctx.getChild(2)).getSymbol();
		int line1 = idToken1.getLine();
		int column1 = idToken1.getCharPositionInLine();
		s.Nondeclarer(id1, line1, column1);
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

	@Override
	public void exitProgram(LangageParser.ProgramContext ctx) {
		s.ass.TraducQuad(s.quadruplets);
	}


}
	