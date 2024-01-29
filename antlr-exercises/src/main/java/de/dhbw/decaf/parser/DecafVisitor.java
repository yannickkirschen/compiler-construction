// Generated from /Users/yannick/Development/compiler-construction/antlr-exercises/src/main/antlr4/de/dhbw/decaf/Decaf.g4 by ANTLR 4.12.0
package de.dhbw.decaf.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(DecafParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DecafParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(DecafParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(DecafParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DecafParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DecafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DecafParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DecafParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DecafParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(DecafParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(DecafParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVoid}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVoid(DecafParser.ReturnVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(DecafParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Continue}
	 * labeled alternative in {@link DecafParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue(DecafParser.ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DecafParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCallExpression}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallExpression(DecafParser.FunCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DecafParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(DecafParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Location}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(DecafParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(DecafParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(DecafParser.LocContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(DecafParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(DecafParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(DecafParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DecafParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DecafParser.IdContext ctx);
}