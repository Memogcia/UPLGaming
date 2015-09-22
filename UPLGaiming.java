import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//A01227416
//Guillermo García Contreras
//With this comment from Alfonso

public class UPLGaiming {
	
	String source,
		   temp,
		   line;
	private BufferedReader br;
	private PrintWriter pw;
	
	public UPLGaiming(){
		this.source = "C:/Users/Guillermo/AppData/Local/Logitech/Logitech Gaming Software/profiles/{29A3A279-D451-4667-AACF-2B131358B6E4}.xml";
		this.temp = "C:/Users/Guillermo/AppData/Local/Logitech/Logitech Gaming Software/profiles/temp.xml";
		this.update();
	}
	
	private void update(){
		try {
			this.br = new BufferedReader(new FileReader(source));
			this.pw = new PrintWriter(new FileWriter(temp));
			while((line = br.readLine()) != null){
				pw.println(line);
			}
			this.pw.close();
			this.br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo source");
		}catch(IOException e){
			System.out.println("Escritura de archivo temp inválida");
		}
	}
	
	public static void main(String[] args) {
		UPLGaiming start = new UPLGaiming();
	}

}

/*
public class UPLGaiming {
	
	String source,
		   temp,
		   line;
	private BufferedReader br;
	private PrintWriter pw;
	
	public UPLGaiming(){
		this.source = "C:/Users/Guillermo/AppData/Local/Logitech/Logitech Gaming Software/profiles/{29A3A279-D451-4667-AACF-2B131358B6E4}.xml";
		this.temp = "C:/Users/Guillermo/AppData/Local/Logitech/Logitech Gaming Software/profiles/temp.xml";
		this.update();
	}
	
	private void update(){
		try {
			this.br = new BufferedReader(new FileReader(source));
			this.pw = new PrintWriter(new FileWriter(temp));
			while((line = br.readLine()) != null){
				pw.println(line);
			}
			this.pw.close();
			this.br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo source");
		}catch(IOException e){
			System.out.println("Escritura de archivo temp inválida");
		}
	}
	
	public static void main(String[] args) {
		UPLGaiming start = new UPLGaiming();
	}
*/
