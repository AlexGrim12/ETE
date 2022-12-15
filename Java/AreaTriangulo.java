import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
public class AreaTriangulo extends JFrame implements ActionListener{
	JLabel lblResultado=new JLabel();
	JTextField txtAltura=new JTextField();
	JTextField txtBase=new JTextField();
	JButton btnCalcular=new JButton();
	public AreaTriangulo(){
		configurar();
		agregaElementos();
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==btnCalcular)
		{
			double alt,base,area;
			alt=Double.parseDouble(txtAltura.getText());
			base=Double.parseDouble(txtBase.getText());
			area=(alt*base)/2;
			lblResultado.setText(String.valueOf(area));
		}
	}
	
	public void configurar(){
		this.setBounds(50,50,500,500);
		this.setTitle("\u00c1rea de un tri\u00e1ngulo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}
	
	public void agregaElementos(){
		JLabel lblAltura=new JLabel();
		JLabel lblBase=new JLabel();
		JLabel lblTextoRes=new JLabel();
		lblAltura.setBounds(0,0,50,20);
		lblAltura.setText("Altura:");
		lblBase.setBounds(0,30,50,20);
		lblBase.setText("Base:");
		lblTextoRes.setBounds(0,50,50,20);
		lblTextoRes.setText("\u00c1rea:");
		lblResultado.setBounds(51,50,50,20);
		txtAltura.setBounds(51,0,60,20);
		txtBase.setBounds(51,30,60,20);
		btnCalcular.setBounds(0,90,100,40);
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(this);
		add(lblAltura);
		add(lblBase);
		add(lblTextoRes);
		add(lblResultado);
		add(txtAltura);
		add(txtBase);
		add(btnCalcular);
	}
	
	public static void main(String args[]){
		AreaTriangulo ventana=new AreaTriangulo();
		ventana.setVisible(true);
	}
}