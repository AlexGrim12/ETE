import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;
public class prueba extends JFrame implements ActionListener{
	JButton boton=new JButton();
	JButton boton2=new JButton();

	JTextField caja1=new JTextField();
	JTextField caja2=new JTextField();
	JLabel resultado=new JLabel();
	public prueba(String titulo1){ 
		configurar(titulo1);
		agregaElementos();
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==boton2)
		{
			double num1,num2,res;
			num1=Double.parseDouble(caja1.getText());
			num2=Double.parseDouble(caja2.getText());
			res=num1*num2;
			resultado.setText(String.valueOf(res));
        }
		}
		
	public void configurar(String titulo2){
		this.setBounds(150,400,520,500);
		this.setTitle(titulo2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}
	public void agregaElementos(){
		JLabel etiqueta=new JLabel();
		JLabel etiqueta2=new JLabel();
		JLabel etiqueta3=new JLabel();
		JLabel etiqueta4=new JLabel();
		JLabel etiqueta5=new JLabel();
		int anchoventana= (int) this.getSize().getWidth();
		etiqueta.setBounds((anchoventana-66)/2,0,66,20);
		etiqueta.setText("Practica 3 (I)");
		etiqueta2.setBounds((anchoventana-46)/2,20,46,20);
		etiqueta2.setText("Alejandro Gutiérrez Grimaldo");
		etiqueta3.setBounds(0,40,45,20);
		etiqueta3.setText("Valor a:");
		caja1.setBounds(50,40,100,20);
		etiqueta4.setBounds(0,60,66,20);
		etiqueta4.setText("Valor b:");
		etiqueta5.setBounds(100,150,60,20);
		etiqueta5.setText("Resultado");
		resultado.setBounds(160,150,180,40);
		caja2.setBounds(50,60,100,20);

		add(etiqueta);
		add(etiqueta2);
		add(etiqueta3);
		add(etiqueta4);
		add(caja1);
		add(caja2);

		
	}
	public static void main(String args[]){
		String titulo="alto y la base de un triángulo";
		VentanaHerencia ventana=new VentanaHerencia(titulo);
		ventana.setVisible(true);
	}
}