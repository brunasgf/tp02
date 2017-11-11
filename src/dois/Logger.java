package dois;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Logger {

	protected static int verbosidade;
	protected String tipo; 

	protected Logger(int verbosidade) throws FileNotFoundException {
		Logger.verbosidade = verbosidade;
		}
	
	public abstract void log (String texto) throws IOException;
	
}