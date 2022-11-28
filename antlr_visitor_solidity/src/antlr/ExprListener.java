// Generated from Expr.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(ExprParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(ExprParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(ExprParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(ExprParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void enterPragmaName(ExprParser.PragmaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void exitPragmaName(ExprParser.PragmaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void enterPragmaValue(ExprParser.PragmaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void exitPragmaValue(ExprParser.PragmaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(ExprParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(ExprParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(ExprParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(ExprParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VersionCheck}
	 * labeled alternative in {@link ExprParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVersionCheck(ExprParser.VersionCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VersionCheck}
	 * labeled alternative in {@link ExprParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVersionCheck(ExprParser.VersionCheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ExprParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ExprParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(ExprParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(ExprParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void enterNatSpec(ExprParser.NatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void exitNatSpec(ExprParser.NatSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(ExprParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(ExprParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(ExprParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(ExprParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(ExprParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(ExprParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(ExprParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(ExprParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(ExprParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(ExprParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(ExprParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(ExprParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(ExprParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(ExprParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(ExprParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(ExprParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(ExprParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(ExprParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(ExprParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(ExprParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(ExprParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(ExprParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkModifier}
	 * labeled alternative in {@link ExprParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterCheckModifier(ExprParser.CheckModifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkModifier}
	 * labeled alternative in {@link ExprParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitCheckModifier(ExprParser.CheckModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(ExprParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(ExprParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(ExprParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(ExprParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(ExprParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(ExprParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ExprParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ExprParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExprParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExprParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(ExprParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(ExprParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(ExprParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(ExprParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(ExprParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(ExprParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(ExprParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(ExprParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(ExprParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(ExprParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(ExprParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(ExprParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(ExprParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(ExprParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(ExprParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(ExprParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(ExprParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(ExprParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ExprParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ExprParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(ExprParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(ExprParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(ExprParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(ExprParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ExprParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ExprParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ExprParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ExprParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ExprParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ExprParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExprParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExprParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ExprParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ExprParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(ExprParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(ExprParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(ExprParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(ExprParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ExprParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ExprParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(ExprParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(ExprParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(ExprParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(ExprParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPlusMinus(ExprParser.ExprPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPlusMinus(ExprParser.ExprPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTilde}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprTilde(ExprParser.ExprTildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTilde}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprTilde(ExprParser.ExprTildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogicalOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalOr(ExprParser.ExprLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogicalOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalOr(ExprParser.ExprLogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRoBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRoBr(ExprParser.ExprRoBrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRoBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRoBr(ExprParser.ExprRoBrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprdel}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprdel(ExprParser.ExprdelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprdel}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprdel(ExprParser.ExprdelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCompare(ExprParser.ExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCompare(ExprParser.ExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newKeyword}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewKeyword(ExprParser.NewKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newKeyword}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewKeyword(ExprParser.NewKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_or_sub}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_sub(ExprParser.Add_or_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_or_sub}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_sub(ExprParser.Add_or_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCheck}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCheck(ExprParser.ExprCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCheck}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCheck(ExprParser.ExprCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprInc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprInc(ExprParser.ExprIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprInc(ExprParser.ExprIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogicalAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprLogicalAnd(ExprParser.ExprLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogicalAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprLogicalAnd(ExprParser.ExprLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAll}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAll(ExprParser.ExprAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAll}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAll(ExprParser.ExprAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(ExprParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(ExprParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTernary}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprTernary(ExprParser.ExprTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTernary}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprTernary(ExprParser.ExprTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprcalc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprcalc(ExprParser.ExprcalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprcalc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprcalc(ExprParser.ExprcalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprXor(ExprParser.ExprXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprXor(ExprParser.ExprXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFnc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprFnc(ExprParser.ExprFncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFnc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprFnc(ExprParser.ExprFncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPrime}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPrime(ExprParser.ExprPrimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPrime}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPrime(ExprParser.ExprPrimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(ExprParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(ExprParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(ExprParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(ExprParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCmp}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCmp(ExprParser.ExprCmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCmp}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCmp(ExprParser.ExprCmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSqBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprSqBr(ExprParser.ExprSqBrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSqBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprSqBr(ExprParser.ExprSqBrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exorOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExorOr(ExprParser.ExorOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exorOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExorOr(ExprParser.ExorOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(ExprParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(ExprParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprGreater}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprGreater(ExprParser.ExprGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprGreater}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprGreater(ExprParser.ExprGreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ExprParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ExprParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ExprParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ExprParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(ExprParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(ExprParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(ExprParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(ExprParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(ExprParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(ExprParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ExprParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ExprParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(ExprParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(ExprParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(ExprParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(ExprParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(ExprParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(ExprParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(ExprParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(ExprParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(ExprParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(ExprParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(ExprParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(ExprParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(ExprParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(ExprParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(ExprParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(ExprParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(ExprParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(ExprParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(ExprParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(ExprParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(ExprParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(ExprParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(ExprParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(ExprParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(ExprParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(ExprParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(ExprParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(ExprParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(ExprParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(ExprParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(ExprParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(ExprParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(ExprParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(ExprParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(ExprParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(ExprParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(ExprParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(ExprParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameExpression(ExprParser.TypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameExpression(ExprParser.TypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(ExprParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(ExprParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExprParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExprParser.IdentifierContext ctx);
}