import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
public class Practica3II extends JFrame implements ActionListener{
	JLabel lblResultado=new JLabel();
    JLabel lblResultado2=new JLabel();
	JTextField txtValorA=new JTextField();
	JTextField txtValorB=new JTextField();
    JTextField txtValorC=new JTextField();
	JButton btnCalcular=new JButton();
	public Practica3II(){
		configurar();
		agregaElementos();
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource()==btnCalcular)
		{
			int a,b,c;
			a=Integer.parseInt(txtValorA.getText());
			b=Integer.parseInt(txtValorB.getText());
            c=Integer.parseInt(txtValorB.getText());
            //d=(b*b-(4*a*c));
			//x1=((-b+Math.sqrt(d))/(2*a));
            double x1=((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            //x2=((-b-Math.sqrt(d))/(2*a));
            double x2=((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			lblResultado.setText(String.valueOf(x1));
            lblResultado2.setText(String.valueOf(x2));
		}
	}
	
	public void configurar(){
		this.setBounds(50,50,500,500);
		this.setTitle("Formula General");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
	}
	
	public void agregaElementos(){
		JLabel lblValorA=new JLabel();
        JLabel lblValorB=new JLabel();
        JLabel lblValorC=new JLabel();
		JLabel lblTextoRes=new JLabel();
		lblValorA.setBounds(0,0,70,20);
		lblValorA.setText("Valor de A:");
		lblValorB.setBounds(0,30,70,20);
		lblValorB.setText("Valor de B:");
        lblValorC.setBounds(0,60,70,20);
		lblValorC.setText("Valor de C:");
		lblTextoRes.setBounds(0,90,70,20);
		lblTextoRes.setText("Resultado:");
		lblResultado.setBounds(65,90,50,20);
        lblResultado.setText("3");
        lblResultado2.setBounds(65,105,50,20);
        lblResultado2.setText("1");
		txtValorA.setBounds(65,0,60,20);
		txtValorB.setBounds(65,30,60,20);
        txtValorC.setBounds(65,60,60,20);
		btnCalcular.setBounds(0,140,100,40);
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(this);
		add(lblValorA);
		add(lblValorB);
        add(lblValorC);
		add(lblTextoRes);
		add(lblResultado);
        add(lblResultado2);
		add(txtValorA);
		add(txtValorB);
        add(txtValorC);
		add(btnCalcular);
	}
	
	public static void main(String args[]){
		Practica3II ventana=new Practica3II();
		ventana.setVisible(true);
	}
}