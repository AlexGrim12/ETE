    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.JButton;
    import java.awt.event.*;

    public class Practica3III extends JFrame implements ActionListener{
        JLabel lblResultado=new JLabel();
        JTextField txtPalabra=new JTextField();
        JButton btnCalcular=new JButton();
        public Practica3III(){
            configurar();
            agregaElementos();
        }
        
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource()==btnCalcular)
            {
            String a = txtPalabra.getText();
            StringBuilder b = new StringBuilder(a);
            a = b.reverse().toString();
            lblResultado.setText(String.valueOf(b));
            }
        }
        
        public void configurar(){
            this.setBounds(50,50,500,500);
            this.setTitle("Voltea palabra");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
        }
        
    public void agregaElementos(){

        JLabel lblDesc=new JLabel();
        JLabel lblPalabra=new JLabel();
        JLabel lblTextoRes=new JLabel();

        lblDesc.setBounds(0,0,500,20);
		lblDesc.setText("Aplicación que solicita al usuario una palabra y la voltea");
        lblPalabra.setBounds(0,30,150,20);
        lblPalabra.setText("Inserta una palabra:");
        lblTextoRes.setBounds(0,60,70,20);
        lblTextoRes.setText("Resultado:");
        lblResultado.setBounds(80,60,250,20);

        txtPalabra.setBounds(120,30,250,20);

        btnCalcular.setBounds(0,90,100,40);
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this);

        add(lblDesc);
        add(lblPalabra);
        add(lblTextoRes);
        add(lblResultado);
        add(txtPalabra);
        add(btnCalcular);
    }
        
     public static void main(String args[]){
        Practica3III ventana=new Practica3III();
        ventana.setVisible(true);
    }
}