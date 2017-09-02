package generadorDeArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter salida = new PrintWriter(new File("h_clinicas.in"));
		salida.println("45000");
		 for (long i = 45000; i>0 ; i--) {
			salida.println(i + " " + "Nombre y Apellido");
			
		}
		 
		salida.close();

	}

}
