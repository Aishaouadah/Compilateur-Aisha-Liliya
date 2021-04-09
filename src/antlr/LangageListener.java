// Generated from Langage.g4 by ANTLR 4.9.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangageParser}.
 */
public interface LangageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIdentifiers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListIdentifiers(LangageParser.ListIdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIdentifiers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListIdentifiers(LangageParser.ListIdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterIdentifers(LangageParser.IdentifersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitIdentifers(LangageParser.IdentifersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decs1}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDecs1(LangageParser.Decs1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Decs1}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDecs1(LangageParser.Decs1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Decs2}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDecs2(LangageParser.Decs2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Decs2}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDecs2(LangageParser.Decs2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LangageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LangageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LangageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDec(LangageParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LangageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDec(LangageParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LangageParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LangageParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assig1}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssig1(LangageParser.Assig1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assig1}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssig1(LangageParser.Assig1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assig2}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssig2(LangageParser.Assig2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assig2}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssig2(LangageParser.Assig2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assig3}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssig3(LangageParser.Assig3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assig3}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssig3(LangageParser.Assig3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assig4}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssig4(LangageParser.Assig4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assig4}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssig4(LangageParser.Assig4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assig5}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssig5(LangageParser.Assig5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assig5}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssig5(LangageParser.Assig5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le1}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe1(LangageParser.Le1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le1}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe1(LangageParser.Le1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le2}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe2(LangageParser.Le2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le2}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe2(LangageParser.Le2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le3}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe3(LangageParser.Le3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le3}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe3(LangageParser.Le3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le4}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe4(LangageParser.Le4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le4}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe4(LangageParser.Le4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le6}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe6(LangageParser.Le6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le6}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe6(LangageParser.Le6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le7}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe7(LangageParser.Le7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le7}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe7(LangageParser.Le7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le8}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe8(LangageParser.Le8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le8}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe8(LangageParser.Le8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le9}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe9(LangageParser.Le9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le9}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe9(LangageParser.Le9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le10}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe10(LangageParser.Le10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le10}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe10(LangageParser.Le10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code le11}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLe11(LangageParser.Le11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code le11}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLe11(LangageParser.Le11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ae4}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAe4(LangageParser.Ae4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ae4}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAe4(LangageParser.Ae4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ae1}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAe1(LangageParser.Ae1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ae1}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAe1(LangageParser.Ae1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ae3}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAe3(LangageParser.Ae3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ae3}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAe3(LangageParser.Ae3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ae2}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void enterAe2(LangageParser.Ae2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ae2}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 */
	void exitAe2(LangageParser.Ae2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(LangageParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(LangageParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else(LangageParser.If_then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else(LangageParser.If_then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LangageParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LangageParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#sinon}.
	 * @param ctx the parse tree
	 */
	void enterSinon(LangageParser.SinonContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#sinon}.
	 * @param ctx the parse tree
	 */
	void exitSinon(LangageParser.SinonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printcheck1}
	 * labeled alternative in {@link LangageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintcheck1(LangageParser.Printcheck1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code printcheck1}
	 * labeled alternative in {@link LangageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintcheck1(LangageParser.Printcheck1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code printcheck2}
	 * labeled alternative in {@link LangageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintcheck2(LangageParser.Printcheck2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code printcheck2}
	 * labeled alternative in {@link LangageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintcheck2(LangageParser.Printcheck2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code scan2}
	 * labeled alternative in {@link LangageParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan2(LangageParser.Scan2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code scan2}
	 * labeled alternative in {@link LangageParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan2(LangageParser.Scan2Context ctx);
}