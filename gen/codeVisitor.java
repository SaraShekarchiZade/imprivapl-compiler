// Generated from D:/term7/compiler/Code/project/src/code.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link codeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface codeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link codeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(codeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(codeParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(codeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(codeParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#makeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMakeStmt(codeParser.MakeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(codeParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#repeatStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStmt(codeParser.RepeatStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(codeParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(codeParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(codeParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(codeParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(codeParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(codeParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(codeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(codeParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(codeParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(codeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(codeParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link codeParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(codeParser.FactorContext ctx);
}