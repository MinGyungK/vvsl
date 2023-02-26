// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link vvslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface vvslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code pgrm}
	 * labeled alternative in {@link vvslParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPgrm(vvslParser.PgrmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_tab}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_tab(vvslParser.Exp_tabContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_paren}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_paren(vvslParser.Exp_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_bin_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_bin_bool(vvslParser.Exp_bin_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_id(vvslParser.Exp_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_andor}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_andor(vvslParser.Exp_andorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_bool(vvslParser.Exp_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_ari}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_ari(vvslParser.Exp_ariContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_comp}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_comp(vvslParser.Exp_compContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_un_plus}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_un_plus(vvslParser.Exp_un_plusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_int}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_int(vvslParser.Exp_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_un_not}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_un_not(vvslParser.Exp_un_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp_un_min}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_un_min(vvslParser.Exp_un_minContext ctx);
}