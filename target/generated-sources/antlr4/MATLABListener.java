// Generated from MATLAB.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MATLABParser}.
 */
public interface MATLABListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MATLABParser#command_args}.
	 * @param ctx the parse tree
	 */
	void enterCommand_args(@NotNull MATLABParser.Command_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#command_args}.
	 * @param ctx the parse tree
	 */
	void exitCommand_args(@NotNull MATLABParser.Command_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#activity_reference}.
	 * @param ctx the parse tree
	 */
	void enterActivity_reference(@NotNull MATLABParser.Activity_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#activity_reference}.
	 * @param ctx the parse tree
	 */
	void exitActivity_reference(@NotNull MATLABParser.Activity_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_input}.
	 * @param ctx the parse tree
	 */
	void enterF_input(@NotNull MATLABParser.F_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_input}.
	 * @param ctx the parse tree
	 */
	void exitF_input(@NotNull MATLABParser.F_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#functionMFile}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMFile(@NotNull MATLABParser.FunctionMFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#functionMFile}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMFile(@NotNull MATLABParser.FunctionMFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MATLABParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MATLABParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_def_line}.
	 * @param ctx the parse tree
	 */
	void enterF_def_line(@NotNull MATLABParser.F_def_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_def_line}.
	 * @param ctx the parse tree
	 */
	void exitF_def_line(@NotNull MATLABParser.F_def_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#entity_reference}.
	 * @param ctx the parse tree
	 */
	void enterEntity_reference(@NotNull MATLABParser.Entity_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#entity_reference}.
	 * @param ctx the parse tree
	 */
	void exitEntity_reference(@NotNull MATLABParser.Entity_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#command_form}.
	 * @param ctx the parse tree
	 */
	void enterCommand_form(@NotNull MATLABParser.Command_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#command_form}.
	 * @param ctx the parse tree
	 */
	void exitCommand_form(@NotNull MATLABParser.Command_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_body}.
	 * @param ctx the parse tree
	 */
	void enterF_body(@NotNull MATLABParser.F_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_body}.
	 * @param ctx the parse tree
	 */
	void exitF_body(@NotNull MATLABParser.F_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull MATLABParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull MATLABParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#while_command}.
	 * @param ctx the parse tree
	 */
	void enterWhile_command(@NotNull MATLABParser.While_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#while_command}.
	 * @param ctx the parse tree
	 */
	void exitWhile_command(@NotNull MATLABParser.While_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#if_command}.
	 * @param ctx the parse tree
	 */
	void enterIf_command(@NotNull MATLABParser.If_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#if_command}.
	 * @param ctx the parse tree
	 */
	void exitIf_command(@NotNull MATLABParser.If_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterF_argument_list(@NotNull MATLABParser.F_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitF_argument_list(@NotNull MATLABParser.F_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#global_command}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_command(@NotNull MATLABParser.Global_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#global_command}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_command(@NotNull MATLABParser.Global_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull MATLABParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull MATLABParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#list_reference}.
	 * @param ctx the parse tree
	 */
	void enterList_reference(@NotNull MATLABParser.List_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#list_reference}.
	 * @param ctx the parse tree
	 */
	void exitList_reference(@NotNull MATLABParser.List_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#for_command}.
	 * @param ctx the parse tree
	 */
	void enterFor_command(@NotNull MATLABParser.For_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#for_command}.
	 * @param ctx the parse tree
	 */
	void exitFor_command(@NotNull MATLABParser.For_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#return_command}.
	 * @param ctx the parse tree
	 */
	void enterReturn_command(@NotNull MATLABParser.Return_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#return_command}.
	 * @param ctx the parse tree
	 */
	void exitReturn_command(@NotNull MATLABParser.Return_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MATLABParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MATLABParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MATLABParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MATLABParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#scriptMFile}.
	 * @param ctx the parse tree
	 */
	void enterScriptMFile(@NotNull MATLABParser.ScriptMFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#scriptMFile}.
	 * @param ctx the parse tree
	 */
	void exitScriptMFile(@NotNull MATLABParser.ScriptMFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull MATLABParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull MATLABParser.Argument_listContext ctx);
}