// Generated from Langage.g4 by ANTLR 4.9.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link LangageParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIdentifiers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIdentifiers(LangageParser.ListIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifers}
	 * labeled alternative in {@link LangageParser#listId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifers(LangageParser.IdentifersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decs1}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecs1(LangageParser.Decs1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Decs2}
	 * labeled alternative in {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecs2(LangageParser.Decs2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LangageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dec}
	 * labeled alternative in {@link LangageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(LangageParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LangageParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assig1}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig1(LangageParser.Assig1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assig2}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig2(LangageParser.Assig2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assig3}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig3(LangageParser.Assig3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assig4}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig4(LangageParser.Assig4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assig5}
	 * labeled alternative in {@link LangageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssig5(LangageParser.Assig5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le1}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe1(LangageParser.Le1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le2}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe2(LangageParser.Le2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le3}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe3(LangageParser.Le3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le4}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe4(LangageParser.Le4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le6}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe6(LangageParser.Le6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le7}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe7(LangageParser.Le7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le8}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe8(LangageParser.Le8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le9}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe9(LangageParser.Le9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le10}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe10(LangageParser.Le10Context ctx);
	/**
	 * Visit a parse tree produced by the {@code le11}
	 * labeled alternative in {@link LangageParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe11(LangageParser.Le11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ae4}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAe4(LangageParser.Ae4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ae1}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAe1(LangageParser.Ae1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ae3}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAe3(LangageParser.Ae3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ae2}
	 * labeled alternative in {@link LangageParser#arithmitic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAe2(LangageParser.Ae2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(LangageParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#if_then_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else(LangageParser.If_then_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LangageParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#sinon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinon(LangageParser.SinonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scan2}
	 * labeled alternative in {@link LangageParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan2(LangageParser.Scan2Context ctx);
}