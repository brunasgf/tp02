package um;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();
	private Logger LOGG;
	private final String arquivo = "arquivo.txt";
	public final int verbosidade = 853658348;
	
	private Singleton() {
		try {
			LOGG = new Logger(arquivo, verbosidade);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	public void setEventos(String log) throws IOException {
		LOGG.log(log);
	}
	
}
