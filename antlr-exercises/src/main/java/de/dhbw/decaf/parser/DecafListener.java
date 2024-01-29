// Generated from /Users/yannick/Development/compiler-construction/antlr-exercises/src/main/antlr4/de/dhbw/decaf/Decaf.g4 by ANTLR 4.12.0
package de.dhbw.decaf.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(DecafParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(DecafParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(DecafParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(DecafParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DecafParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DecafParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DecafParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DecafParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DecafParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DecafParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DecafParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DecafParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(DecafParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(DecafParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(DecafParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(DecafParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn(DecafParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn(DecafParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnVoid(DecafParser.ReturnVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnVoid(DecafParser.ReturnVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak(DecafParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak(DecafParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue(DecafParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue(DecafParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCallExpression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCallExpression(DecafParser.FunCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCallExpression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCallExpression(DecafParser.FunCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DecafParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DecafParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(DecafParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(DecafParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Location}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocation(DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Location}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocation(DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(DecafParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(DecafParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(DecafParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(DecafParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(DecafParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(DecafParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(DecafParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(DecafParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(DecafParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(DecafParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DecafParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DecafParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DecafParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DecafParser.IdContext ctx);
}