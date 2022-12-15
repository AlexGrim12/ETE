import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
public class VentanaHerencia extends JFrame{
	public VentanaHerencia(String titulo){ // Constructor
		configurar(titulo);
		agregaElementos();
		agregaElementos2();
	}
	public void configurar(String titulo){ // Método para configurar las caracteristicas de la ventana
		this.setBounds(150,400,500,500);
		this.setVisible(true);
		this.setTitle(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}
	public void agregaElementos(){
		JLabel etiqueta=new JLabel();
		etiqueta.setBounds(0,0,150,20);
		etiqueta.setText("Hola Mundo");
		add(etiqueta);
	}
	public void agregaElementos2(){
		JLabel etiqueta=new JLabel();
		etiqueta.setBounds(0,0,200,100);
		etiqueta.setText("Alejandro Gutiérrez Grimaldo");
		add(etiqueta);
	}
	public static void main (String args[]){
		String titulo="Mi primer ventana";
		//Scanner guarda=new Scanner(System.in);
		//System.out.print("Escribe un titulo para la ventana: ");
		//titulo=guarda.nextLine();
		VentanaHerencia ventana=new VentanaHerencia(titulo);
		
		
	}
}