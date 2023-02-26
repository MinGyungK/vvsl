// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vvslParser}.
 */
public interface vvslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code pgrm}
	 * labeled alternative in {@link vvslParser#p}.
	 * @param ctx the parse tree
	 */
	void enterPgrm(vvslParser.PgrmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pgrm}
	 * labeled alternative in {@link vvslParser#p}.
	 * @param ctx the parse tree
	 */
	void exitPgrm(vvslParser.PgrmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_tab}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_tab(vvslParser.Exp_tabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_tab}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_tab(vvslParser.Exp_tabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_paren}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_paren(vvslParser.Exp_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_paren}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_paren(vvslParser.Exp_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_bin_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_bin_bool(vvslParser.Exp_bin_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_bin_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_bin_bool(vvslParser.Exp_bin_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_id(vvslParser.Exp_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_id(vvslParser.Exp_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_andor}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_andor(vvslParser.Exp_andorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_andor}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_andor(vvslParser.Exp_andorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_bool(vvslParser.Exp_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_bool}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_bool(vvslParser.Exp_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_ari}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_ari(vvslParser.Exp_ariContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_ari}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_ari(vvslParser.Exp_ariContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_comp}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_comp(vvslParser.Exp_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_comp}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_comp(vvslParser.Exp_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_un_plus}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_un_plus(vvslParser.Exp_un_plusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_un_plus}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_un_plus(vvslParser.Exp_un_plusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_int}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_int(vvslParser.Exp_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_int}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_int(vvslParser.Exp_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_un_not}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_un_not(vvslParser.Exp_un_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_un_not}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_un_not(vvslParser.Exp_un_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_un_min}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_un_min(vvslParser.Exp_un_minContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_un_min}
	 * labeled alternative in {@link vvslParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_un_min(vvslParser.Exp_un_minContext ctx);
}