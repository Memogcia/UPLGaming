import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//A01227416
//Guillermo García Contreras

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


//A01227416
//Guillermo García Contreras
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;
//
//public class copyFile {
//	
//	private JFileChooser fc;
//	private int revalR,
//				revalW,
//				revalF;
//	private BufferedReader br;
//	private String line;
//	private PrintWriter pw;
//	
//	public copyFile(){
//		this.start();
//	}
//	
//	private void start(){
//		this.fc = new JFileChooser();
//		this.askReadFile();
//		this.askWriteFile();
//		this.copy();
//		this.finish();
//	}
//	
//	private void askReadFile(){
//		JOptionPane.showMessageDialog(null, "Choose the file you want to copy.", "Copy 1.0", JOptionPane.PLAIN_MESSAGE);
//		revalR = this.fc.showOpenDialog(null);
//		if(revalR == JFileChooser.APPROVE_OPTION){
//			try {
//				this.br = new BufferedReader(new FileReader(this.fc.getSelectedFile()));
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	private void askWriteFile(){
//		JOptionPane.showMessageDialog(null, "Now select where is going to be saved the copied file.", "Copy 1.0", JOptionPane.PLAIN_MESSAGE);
//		this.revalW = this.fc.showSaveDialog(null);
//		if(this.revalW == JFileChooser.APPROVE_OPTION){
//			try {
//				this.pw = new PrintWriter(new FileWriter(this.fc.getSelectedFile()));
//			} catch (FileNotFoundException e) {
//				System.out.println("The file was not found");
//			}
//			catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	private void copy(){
//		try {
//			while((line = br.readLine()) != null){
//				pw.println(line);
//			}
//			this.br.close();
//			this.pw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	private void finish(){
//		this.revalF = JOptionPane.showConfirmDialog(null , "Do you want to copy another file?","Copy 1.0", JOptionPane.YES_NO_OPTION);
//		if(revalF == 0){
//			this.start();
//		} else {
//			JOptionPane.showMessageDialog(null, "Thanks for use Copy 1.0/nCreated by Guillermo.", "Copy 1.0", JOptionPane.PLAIN_MESSAGE);
//		}
//	}
//
//	public static void main(String[] args) {
//		copyFile start = new copyFile();
//	}
//
//}
