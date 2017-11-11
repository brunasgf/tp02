package dois;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LoggerArquivo extends Logger {
	
	private String arquivo = null;
	private static RandomAccessFile rf;

	public LoggerArquivo(String arquivo, int verbosidade) throws FileNotFoundException {
		super(verbosidade);
		this.arquivo = arquivo;
		LoggerArquivo.rf = new RandomAccessFile(arquivo, "rw");
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	@Override
	public void log(String texto) throws IOException {
		rf.seek(rf.length());
		rf.writeBytes(verbosidade + ";" +  texto + "\n");
		
	}

}
