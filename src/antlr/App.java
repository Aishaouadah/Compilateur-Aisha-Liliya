package antlr;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharStream input = (CharStream) CharStreams.fromFileName("C:\\Users\\User\\eclipse-workspace\\Compilateur-Aisha-Liliya\\src\\test\\test1.txt");
		LangageLexer lexer = new LangageLexer((org.antlr.v4.runtime.CharStream) input);
		LangageParser parser = new 	LangageParser(new CommonTokenStream(lexer));
		Listener l =new Listener();
		parser.addParseListener(l);
		
		ParseTree tree = parser.code();
	l.s.printTE();
	l.s.printTS();
	l.s.printQuad();
	}

}