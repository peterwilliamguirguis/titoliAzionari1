package titoliazionari.ing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileServizio {
	
public static boolean esistenzafile(File file) {
	if(file.exists())
		return true;
		else 
		return false;
}
public static void creareUnoNuovo(PortaFoglio portaFoglio,ArrayList<Titolo> titoli,ElencoTitoli elencoTitoli , ArrayList<Lotto> lotto) 
		throws IOException,ClassNotFoundException,FileNotFoundException {
	File file=new File("E:\\peter.txt");
	ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ;
	
	out.writeObject(portaFoglio);
	out.writeObject(titoli);
	out.writeObject(elencoTitoli);
	out.writeObject(lotto);
	out.close();
	
	
}

public static void trovareUnoNuovo(PortaFoglio portaFoglio,ArrayList<Titolo> titoli,ElencoTitoli elencoTitoli , ArrayList<Lotto> lotto) 
		throws IOException,ClassNotFoundException,FileNotFoundException {
	File file=new File("E:\\peter.txt");
	ObjectInputStream out=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))) ;
	portaFoglio = (PortaFoglio) out.readObject();
	titoli =(ArrayList<Titolo>) out.readObject();
	lotto=(ArrayList<Lotto>) out.readObject();
	elencoTitoli=(ElencoTitoli)out.readObject();
	out.close();
	
	
	
}}




