package um;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Logger {

	private String arquivo = null;
	private static int verbosidade; 
	private static RandomAccessFile rf;

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public Logger(String arquivo, int verbosidade) throws FileNotFoundException {
		this.arquivo = arquivo;
		Logger.verbosidade = verbosidade;
		Logger.rf = new RandomAccessFile(arquivo, "rw");
	}
	
	public void log (String texto) throws IOException {
		rf.seek(rf.length());
		rf.writeBytes(verbosidade + ";" +  texto + "\n");
	}
	
}