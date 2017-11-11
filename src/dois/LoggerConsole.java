package dois;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoggerConsole extends Logger {

	public LoggerConsole(int verbosidade) throws FileNotFoundException {
		super(verbosidade);
	}

	@Override
	public void log(String texto) throws IOException {
		System.out.println(texto);
		
	}

}
