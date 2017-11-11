package um;

import java.io.IOException;

public class AplicacaoUm {

	public static void main(String[] args) throws IOException {
		Singleton s = Singleton.getInstance();
		s.setEventos("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris mauris nulla,"
				+ " vulputate sed tincidunt non, rutrum vitae orci. Suspendisse interdum justo ut dolor "
				+ "molestie posuere. In lobortis cursus sapien, vel molestie augue sollicitudin quis. "
				+ "Maecenas consequat commodo bibendum. Etiam malesuada aliquam congue. "
				+ "Etiam pulvinar bibendum metus, quis lobortis velit finibus vitae. "
				+ "Donec sollicitudin varius felis, in posuere leo vehicula molestie."
				+ " Phasellus pellentesque magna turpis, ut tempor nisl suscipit vel" 
				+ "\n" );
		
	}

}
