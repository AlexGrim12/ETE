import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;
public class PVentana extends JFrame implements ActionListener{
    JButton boton= new JButton(); 
    public PVentana(){ 
        configuraVentana("hola"); //this.setExtendedState(this.MAXIMIZED_BOTH);
        agregaElementos();
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==boton)
        {
            int count = 0;
            count++;
            String numero = String.valueOf(count);
        System.out.printf("Presionaste el bot\u00f3n %s vez/veces!!\n",numero);
        System.out.printf("Presionaste el bot\u00f3n 2 vez/veces!!\n");
        System.out.printf("Presionaste el bot\u00f3n 3 vez/veces!!\n");
        System.out.printf("Presionaste el bot\u00f3n 4 vez/veces!!\n");
        System.out.printf("Presionaste el bot\u00f3n 5 vez/veces!!\n");
        System.out.printf("Presionaste el bot\u00f3n 6 vez/veces!!\n");
        }
        
    }

    public void agregaElementos(){ 
        int anchoventana;

   

        JLabel etiqueta=new JLabel(); 
        JLabel etiqueta2=new JLabel(); 
        JLabel etiqueta3=new JLabel(); 
        JLabel etiqueta4=new JLabel(); 
        JLabel etiqueta5=new JLabel(); 
        JLabel etiqueta6=new JLabel(); 
        JLabel etiqueta7=new JLabel(); 
        JLabel etiqueta8=new JLabel(); 
        JLabel etiqueta9=new JLabel(); 
        JLabel etiqueta10=new JLabel(); 
        JLabel etiqueta11=new JLabel(); 
        JLabel etiqueta12=new JLabel(); 
        JLabel etiqueta13=new JLabel();
        JLabel etiqueta14=new JLabel();
        JLabel etiqueta15=new JLabel();
        JLabel etiqueta16=new JLabel();

        JTextField cajaTxt = new JTextField();
        JTextField cajaTxt2 = new JTextField();
        JTextField cajaTxt3 = new JTextField();
        JTextField cajaTxt4 = new JTextField();
        JTextField cajaTxt5 = new JTextField();
        JTextField cajaTxt6 = new JTextField();
        JTextField cajaTxt7 = new JTextField();
        JTextField cajaTxt8 = new JTextField();
        JTextField cajaTxt9 = new JTextField();
        JTextField cajaTxt10 = new JTextField();
        JTextField cajaTxt11 = new JTextField();
        JTextField cajaTxt12 = new JTextField();

        anchoventana = (int) this.getSize().getWidth();
        etiqueta.setBounds((anchoventana-266)/2,0,266,10);
        etiqueta.setText("Universidad Nacional Aut\u00f3noma de M\u00E9xico");
        etiqueta2.setBounds((anchoventana-266)/2,15,200,9);
        etiqueta2.setText("Escuela Nacional Preparatoria"); //se indica el Texto
        etiqueta3.setBounds((anchoventana-266)/2,30,150,9);
        etiqueta3.setText("Plantel 5 Jose Vaconcelos");
        etiqueta4.setBounds((anchoventana-266)/2,45,500,9);
        etiqueta4.setText("Estudios Técnicos Especializados en Computaci\u00f3n");
        etiqueta5.setBounds((anchoventana-266)/2,60,200,9);
        etiqueta5.setText("Segundo año");
        etiqueta6.setBounds(1,70,200,9);
        etiqueta6.setText("Ingreso de datos de Usuario");
        etiqueta7.setBounds(1,90,200,9);
        etiqueta7.setText("Nombre: ");
        cajaTxt.setBounds(70,88,200,18);
        etiqueta8.setBounds(1,110,200,9);
        etiqueta8.setText("No. Cuenta: ");
        cajaTxt2.setBounds(70,108,200,18);
        etiqueta9.setBounds(1,130,200,9);
        etiqueta9.setText("Fecha Nac.:                 /            /");
        cajaTxt3.setBounds(85,128,25,18);
        cajaTxt4.setBounds(125,128,25,18);
        cajaTxt5.setBounds(165,128,25,18);
        etiqueta10.setBounds(1,150,200,10);
        etiqueta10.setText("Tipo de Sangre: ");
        cajaTxt6.setBounds(100,148,100,18);
        etiqueta11.setBounds(1,170,200,10);
        etiqueta11.setText("Grupo: ");
        cajaTxt7.setBounds(70,168,80,18);
        etiqueta12.setBounds(1,190,200,10);
        etiqueta12.setText("Calle y No.: ");
        cajaTxt8.setBounds(70,188,250,18);
        etiqueta13.setBounds(1,210,200,10);
        etiqueta13.setText("Colonia: ");
        cajaTxt9.setBounds(70,208,200,18);
        etiqueta14.setBounds(1,230,200,10);
        etiqueta14.setText("Delegación: ");
        cajaTxt10.setBounds(70,228,230,18);
        etiqueta15.setBounds(1,250,200,10);
        etiqueta15.setText("C.P.: ");
        cajaTxt11.setBounds(70,248,80,18);
        etiqueta16.setBounds(1,270,200,10);
        etiqueta16.setText("Carreras de intéres: ");
        cajaTxt12.setBounds(130,268,280,180);
        boton.setBounds((anchoventana-150)/2,500,150,40);
        boton.setText("Presiona aqui!"); 
        boton.addActionListener(this);

        add(etiqueta);
        add(etiqueta2);
        add(etiqueta3);
        add(etiqueta4);
        add(etiqueta5);
        add(etiqueta6);
        add(etiqueta7);
        add(etiqueta8);
        add(etiqueta9);
        add(etiqueta10);
        add(etiqueta11);
        add(etiqueta12);
        add(etiqueta13);
        add(etiqueta14);
        add(etiqueta15);
        add(etiqueta16);

        add(cajaTxt); 
        add(cajaTxt2); 
        add(cajaTxt3); 
        add(cajaTxt4); 
        add(cajaTxt5); 
        add(cajaTxt6); 
        add(cajaTxt7); 
        add(cajaTxt8); 
        add(cajaTxt9); 
        add(cajaTxt10); 
        add(cajaTxt11); 
        add(cajaTxt12);

        add(boton); 
 
    }
    public void configuraVentana (String titulo){
        this.setLayout(null);
        
        this.setSize(800, 600);
        this.setTitle(titulo);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setExtendedState(this.MAXIMIZED_BOTH); 
        //Pone la ventana en pantalla completa
    }
    public static void main (String [] args){
        PVentana v= new PVentana(); 
        v.setVisible(true);

    }
}