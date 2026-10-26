// Generated from D:/term7/compiler/Code/project/src/code.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link codeParser}.
 */
public interface codeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link codeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(codeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(codeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(codeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(codeParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(codeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(codeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(codeParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(codeParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#makeStmt}.
	 * @param ctx the parse tree
	 */
	void enterMakeStmt(codeParser.MakeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#makeStmt}.
	 * @param ctx the parse tree
	 */
	void exitMakeStmt(codeParser.MakeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(codeParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(codeParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStmt(codeParser.RepeatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#repeatStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStmt(codeParser.RepeatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(codeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(codeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(codeParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(codeParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(codeParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(codeParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(codeParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(codeParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(codeParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(codeParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(codeParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(codeParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(codeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(codeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(codeParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(codeParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(codeParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(codeParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(codeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(codeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(codeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(codeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link codeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(codeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link codeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(codeParser.FactorContext ctx);
}