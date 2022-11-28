// Generated from Expr.g4 by ANTLR 4.7.2

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#sourceUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceUnit(ExprParser.SourceUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#pragmaDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaDirective(ExprParser.PragmaDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#pragmaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaName(ExprParser.PragmaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#pragmaValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmaValue(ExprParser.PragmaValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersion(ExprParser.VersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#versionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionOperator(ExprParser.VersionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VersionCheck}
	 * labeled alternative in {@link ExprParser#versionConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionCheck(ExprParser.VersionCheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ExprParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#importDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDirective(ExprParser.ImportDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#natSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatSpec(ExprParser.NatSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#contractDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractDefinition(ExprParser.ContractDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceSpecifier(ExprParser.InheritanceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#contractPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPart(ExprParser.ContractPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVariableDeclaration(ExprParser.StateVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingForDeclaration(ExprParser.UsingForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(ExprParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#constructorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDefinition(ExprParser.ConstructorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#modifierDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierDefinition(ExprParser.ModifierDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#modifierInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierInvocation(ExprParser.ModifierInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(ExprParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#returnParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnParameters(ExprParser.ReturnParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkModifier}
	 * labeled alternative in {@link ExprParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckModifier(ExprParser.CheckModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#eventDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDefinition(ExprParser.EventDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(ExprParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(ExprParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ExprParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ExprParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#eventParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameterList(ExprParser.EventParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#eventParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventParameter(ExprParser.EventParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameterList(ExprParser.FunctionTypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameter(ExprParser.FunctionTypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ExprParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserDefinedTypeName(ExprParser.UserDefinedTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping(ExprParser.MappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeName(ExprParser.FunctionTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#storageLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageLocation(ExprParser.StorageLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stateMutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMutability(ExprParser.StateMutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ExprParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ExprParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(ExprParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ExprParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineAssemblyStatement(ExprParser.InlineAssemblyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ExprParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(ExprParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(ExprParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ExprParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ExprParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#emitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(ExprParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(ExprParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ExprParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(ExprParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryTypeName(ExprParser.ElementaryTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlusMinus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlusMinus(ExprParser.ExprPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTilde}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTilde(ExprParser.ExprTildeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogicalOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalOr(ExprParser.ExprLogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRoBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRoBr(ExprParser.ExprRoBrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprdel}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprdel(ExprParser.ExprdelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCompare}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompare(ExprParser.ExprCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newKeyword}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewKeyword(ExprParser.NewKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_or_sub}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_or_sub(ExprParser.Add_or_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCheck}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCheck(ExprParser.ExprCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInc(ExprParser.ExprIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogicalAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogicalAnd(ExprParser.ExprLogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAll}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAll(ExprParser.ExprAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(ExprParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTernary}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTernary(ExprParser.ExprTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprcalc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcalc(ExprParser.ExprcalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprXor}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprXor(ExprParser.ExprXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFnc}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFnc(ExprParser.ExprFncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPrime}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrime(ExprParser.ExprPrimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(ExprParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(ExprParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCmp}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCmp(ExprParser.ExprCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSqBr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSqBr(ExprParser.ExprSqBrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exorOr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExorOr(ExprParser.ExorOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMul}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(ExprParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprGreater}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGreater(ExprParser.ExprGreaterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ExprParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ExprParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#nameValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValueList(ExprParser.NameValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#nameValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValue(ExprParser.NameValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(ExprParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ExprParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyBlock(ExprParser.AssemblyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyItem(ExprParser.AssemblyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyExpression(ExprParser.AssemblyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCall(ExprParser.AssemblyCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLocalDefinition(ExprParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyAssignment(ExprParser.AssemblyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierOrList(ExprParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIdentifierList(ExprParser.AssemblyIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyStackAssignment(ExprParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(ExprParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblySwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblySwitch(ExprParser.AssemblySwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyCase(ExprParser.AssemblyCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionDefinition(ExprParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFunctionReturns(ExprParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyFor(ExprParser.AssemblyForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyIf(ExprParser.AssemblyIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblyLiteral(ExprParser.AssemblyLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#subAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssembly(ExprParser.SubAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(ExprParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameExpression(ExprParser.TypeNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(ExprParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ExprParser.IdentifierContext ctx);
}