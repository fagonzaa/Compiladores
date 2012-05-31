package mint;

import java.io.*;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import iic2322.tools.CLI.*;

class Main {
    public static void main(String[] args) {
    
    try {
        CLI.parse (args, new String[0]);
        
        InputStream inputStream = args.length == 0 ?
            System.in : new java.io.FileInputStream(CLI.infile);

        //CLI.target = CLI.SYMTABLE;
        		
         
        if (CLI.target == CLI.SCAN)
        {
            MintLexer lexer = new MintLexer(new ANTLRInputStream(inputStream));
            Token token;
            boolean done = false;
            while (!done)
            {
                try
                {
                    for (token=lexer.nextToken(); token.getType() != MintLexer.EOF ; token=lexer.nextToken())
                    {
                        if( token.getType() == MintLexer.ERROR ) {
                            System.out.println(String.format("error %s: invalid token %s", token.getLine(), token.getText()));
                            continue;
                        }

                        if(token.getChannel() == MintLexer.HIDDEN) {
                            continue;
                        }

                        String text = token.getText();
        
                        switch (token.getType())
                        {
                            case MintLexer.IDENTIFIER:
                                text = "IDENTIFIER " + text;
                                break;
                            case MintLexer.INDENT:
                                text = "INDENT";
                                break;
                            case MintLexer.DEDENT:
                                text = "DEDENT";
                                break;

                            case MintLexer.INTEGER_LITERAL:
                                text = "INTEGER " + text;
                                break;

                            case MintLexer.STRING_LITERAL:
                                text = "STRING " + text;
                                break;

                            case MintLexer.CHAR_LITERAL:
                                text = "CHAR " + text;
                                break;

                            case MintLexer.FLOAT_LITERAL:
                                text = "FLOAT " + text;
                                break;
                        }

                        System.out.println (String.format("%d %s", token.getLine(), text));
                    }
                    done = true;
                } catch(Exception e) {
                    // print the error:
                    System.out.println(CLI.infile+" "+e);
                    lexer.reportError ((RecognitionException)e);
                }
            }
        }
        else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        {
            MintLexer lexer = new MintLexer(new ANTLRInputStream(inputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MintParser parser = new MintParser(tokens);
            parser.compilationUnit();
        }
        else if (CLI.target == CLI.ANALIZE)
        {
            MintLexer lexer = new MintLexer(new ANTLRInputStream(inputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MintParser parser = new MintParser(tokens);
            CommonTree compilationUnit = (CommonTree)parser.compilationUnit().getTree();
            SymTable table = new SymTable(compilationUnit);
            Semanticizer sem = new Semanticizer(table);
            sem.analize(compilationUnit);
        }
        else if (CLI.target == CLI.SYMTABLE )
        {            
            MintLexer lexer = new MintLexer(new ANTLRInputStream(inputStream));
    		CommonTokenStream tokens = new CommonTokenStream(lexer);
    		MintParser parser = new MintParser(tokens);
    		MintParser.compilationUnit_return result =	parser.compilationUnit();
    		
    		CommonTree t = (CommonTree)result.getTree();
            //System.out.println(t.toStringTree());
            printTree(t, 0);
        }
        else if(CLI.target == CLI.ASSEMBLY)
        {
            MintLexer lexer = new MintLexer(new ANTLRInputStream(inputStream));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MintParser parser = new MintParser(tokens);
            CodeGen codegen = new CodeGen((CommonTree)parser.compilationUnit().getTree());
            codegen.start();

        }
    } catch(Exception e) {
        // print the error:
        System.out.println(CLI.infile+" "+e);
        e.printStackTrace();
    }
    }
    
    
    public static void printTree(CommonTree t, int indent) {
    	if ( t != null ) {
    		StringBuffer sb = new StringBuffer(indent);
    		for ( int i = 0; i < indent; i++ )
    			sb = sb.append("   ");
    		
    		System.out.println(sb.toString() + t.getText() + " - " + t.getType());
    		
    		for ( int i = 0; i < t.getChildCount(); i++ ) {
    			printTree((CommonTree)t.getChild(i), indent+1);
    		}
    	}
    }
}

