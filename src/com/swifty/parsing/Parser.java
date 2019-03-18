package com.swifty.parsing;

import com.swifty.domain.CompilationUnit;
import com.swifty.parser.SwiftyLexer;
import com.swifty.parser.SwiftyParser;
import com.swifty.parsing.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by Alex
 */
public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath - file containing first swift code file
        SwiftyLexer lexer = new SwiftyLexer(charStream);  //create lexer (pass swift file to it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SwiftyParser parser = new SwiftyParser(tokenStream);

        SwiftyTreeWalkErrorListener errorListener = new SwiftyTreeWalkErrorListener(); //SwiftyTreeWalkErrorListener - handles parse tree visiting error events
        // parser.addErrorListener(errorListener);


        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
