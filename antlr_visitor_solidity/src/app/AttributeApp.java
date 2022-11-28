package app;


import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprLexer;
import antlr.ExprParser;
import source_unit.AntlrToA_Expr;
import source_unit.AntlrToEventDef;
import source_unit.AntlrToFuncDef;
import source_unit.AntlrToList_Amodifier;
import source_unit.AntlrToList_Expression;
import source_unit.AntlrToPragmaDirective;
import source_unit.AntlrTo_Imports;
import source_unit.AntlrtoStateVariable;
import source_unit.List_Amodifier;
import source_unit.Pragma_Directive;
import source_unit.VersionConstraint;

public class AttributeApp {

	public static void main(String[] args) {
		if(args.length!=1)
			System.out.println("Usage : filename");
		else {
			String filename = args[0];
			ExprParser parser = getParser(filename);
			//tell Antlr to build a parse tree
			//parse from start symbol 'PragmaDirective'
			ParseTree antlrAST= parser.sourceUnit();
			//Create a Visitor for converting ParseTree into Attributes
			AntlrToPragmaDirective pragmavisitor = new AntlrToPragmaDirective();
			
			
			Pragma_Directive prag = pragmavisitor.visit(antlrAST);
			AntlrtoStateVariable statevar = new AntlrtoStateVariable("Warning");
			statevar.visit(antlrAST);
			AntlrToList_Amodifier modifVisitor = new AntlrToList_Amodifier();
			modifVisitor.visit(antlrAST);
			AntlrToFuncDef funcDef = new AntlrToFuncDef("Warning");
			funcDef.visit(antlrAST);
			AntlrToEventDef eventDef = new AntlrToEventDef("Warning");
			eventDef.visit(antlrAST);
			//AntlrToList_Expression exp = new AntlrToList_Expression();
			AntlrToA_Expr exp = new AntlrToA_Expr("Warning");
			exp.visit(antlrAST);
			
			AntlrTo_Imports c = new AntlrTo_Imports("warning");
			c.visit(antlrAST);
			AntlrToIfCond ifcond = new AntlrToIfCond("Warning");
			ifcond.visit(antlrAST);
			AntlrToFor forcond = new AntlrToFor("Warning");
			forcond.visit(antlrAST);
			AntlrToWhile whilecond = new AntlrToWhile("Warning");
			whilecond.visit(antlrAST);
			//System.out.println(pragmavisitor.VersionError);
//			String Error = pragmavisitor.VersionError;
//			//System.out.println(pragmavisitor.VersionError);
//			if(Error.length()>1) {
//				//String Error = pragmavisitor.VersionError;
//				
//				System.out.println(Error);
//				//System.out.println(pragmavisitor.VersionError);
//			}
//			else {
//				System.out.println("All Good");
//			}
		}
		
		
	    
		// TODO Auto-generated method stub

	}
	/*
	 Types of Lexer and Parser are specific to grammar name.
	 */
	private static ExprParser getParser(String fileName) {
		ExprParser parser = null;
		
		try {
			CharStream input =  CharStreams.fromFileName(fileName);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ExprParser(tokens);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return parser;
	}

}
