import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Practica3 extends JFrame{
	JLabel lblResultado=new JLabel();
	JTextField txtAltura=new JTextField();
	JTextField txtBase=new JTextField();
	public Practica3(){
		configurar();
		agregaElementos();
	}
	
	public void configurar(){
		this.setBounds(50,50,500,500);
		this.setTitle("Alto y la base de un tri\u00e1ngulo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}
	
	public void agregaElementos(){
		JLabel lblDesc=new JLabel();
		JLabel lblAltura=new JLabel();
		JLabel lblBase=new JLabel();
		JLabel lblTextoRes=new JLabel();
		lblDesc.setBounds(0,0,500,20);
		lblDesc.setText("Aplicación que solicita al usuario el alto y la base de un tri\u00e1ngulo");
		lblAltura.setBounds(0,30,50,20);
		lblAltura.setText("Altura:");
		lblBase.setBounds(0,50,50,20);
		lblBase.setText("Base:");
		lblTextoRes.setBounds(0,60,100,50);
		lblTextoRes.setText("Resultado:");
		lblResultado.setBounds(70,75,100,20);

		txtAltura.setBounds(51,30,60,20);
		txtBase.setBounds(51,50,60,20);

		add(lblDesc);
		add(lblAltura);
		add(lblBase);
		add(lblTextoRes);
		add(lblResultado);
		add(txtAltura);
		add(txtBase);

	}
	
	public static void main(String args[]){
		Practica3 ventana=new Practica3();
		ventana.setVisible(true);
	}
}