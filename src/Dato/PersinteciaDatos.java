package Dato;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import LogicaNegocio.Stock;

public class PersinteciaDatos {

	public void Grabar(Stock newStock) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("fichero.Txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(newStock);
		out.close();
	}

	public Stock Recuperar() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("fichero.Txt");
		ObjectInputStream input = new ObjectInputStream(fileInputStream);
		Stock stockBis = (Stock) input.readObject();
		input.close();
		return stockBis;
	}

}
