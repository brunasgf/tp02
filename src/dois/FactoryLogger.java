package dois;

import java.io.FileNotFoundException;

public class FactoryLogger {

	public Logger getLogger (int verbosidade, String l) throws FileNotFoundException {
		if (l.equals("a")) {
			return new LoggerArquivo("arquivo.txt", verbosidade);
		}
		else if (l.equals("c")) {
			return new LoggerConsole(verbosidade); 
		}
		else {
			return null; 
		}
	}
	
	
	
	
	
	
}
