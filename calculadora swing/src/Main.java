import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        Label label = new Label();
        label.setText("Calculadora swing");
        label.setBounds(160,10,1000,40);
        label.setFont(new Font("Trebuchet-MS",Font.BOLD,30));
        label.setForeground(new Color (255, 255, 255));
        ImageIcon image = new ImageIcon("src/GNOME_Calculator_icon_2021.svg.png"); //Crear la imagen
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground( new Color(23, 11, 11));

        Label result = new Label();
        result.setText("Resultado: ");
        result.setFont(new Font("Trebuchet-MS",Font.BOLD,20));
        result.setBounds(225,400,1000,40);
        result.setForeground(new Color(255, 255, 255));
        //Boton suma
       JTextField text=new JTextField();
        text.setBounds(150, 60, 300, 30);
        JTextField text2=new JTextField();
        text2.setBounds(150, 125, 300, 30);

        JButton button = new JButton();
        button.setBounds(150, 200, 100, 60);
        button.setText("+");
        button.setBorder(new LineBorder(Color.CYAN));
        button.setBorder(new LineBorder(Color.CYAN));
        button.setBackground( Color.white);
        button.setFont(new Font("Arial",Font.BOLD,30));
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("suma");
                String oldnum1=text.getText();
                String oldnum2= text2.getText();

                Double num1 =  Double.parseDouble(oldnum1);
                Double num2 =  Double.parseDouble(oldnum2);
                Double make = num1+num2;
                String resultado = make.toString();

                result.setText("Resultado: "+resultado);

                System.out.println(num1+num2);
            }

        });
        JButton resta = new JButton();
        resta.setBounds(350, 200, 100, 60);
        resta.setText("-");
        resta.setBorder(new LineBorder(Color.CYAN));
        resta.setBackground( Color.white);
        resta.setFont(new Font("Arial",Font.BOLD,30));
        resta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String oldnum1=text.getText();
                String oldnum2= text2.getText();

                Double num1 =  Double.parseDouble(oldnum1);
                Double num2 =  Double.parseDouble(oldnum2);
                Double make = num1-num2;
                String resultado = make.toString();

                result.setText("Resultado: "+resultado);
                System.out.println(num1-num2);
                System.out.println("resta");
            }
        });
        JButton mult = new JButton();
        mult.setBounds(150, 300, 100, 60);
        mult.setText("*");

        mult.setBackground( Color.white);
        mult.setBorder(new LineBorder(Color.CYAN));
        mult.setFont(new Font("Arial",Font.BOLD,30));
        mult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String oldnum1=text.getText();
                String oldnum2= text2.getText();

                Double num1 =  Double.parseDouble(oldnum1);
                Double num2 =  Double.parseDouble(oldnum2);
                Double make = num1*num2;
                String resultado = make.toString();

                result.setText("Resultado: "+resultado);
                System.out.println(num1*num2);
                System.out.println("multiplicacion");
            }
        });
        JButton dividir = new JButton();
        dividir.setBounds(350, 300, 100, 60);
        dividir.setText("/");

        dividir.setBackground( Color.white);
        dividir.setBorder(new LineBorder(Color.CYAN));
        dividir.setFont(new Font("Arial",Font.BOLD,30));
        dividir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String oldnum1=text.getText();
                String oldnum2= text2.getText();

                Double num1 =  Double.parseDouble(oldnum1);
                Double num2 =  Double.parseDouble(oldnum2);
                Double make = num1/num2;
                String resultado = make.toString();

                result.setText("Resultado: "+resultado);
                System.out.println(num1/num2);
                System.out.println("Division");
            }
        });
        ImageIcon icon = new ImageIcon("smile.png");
        JButton info = new JButton();
        info.setBounds(0,500,100,60);
        info.setText("Informacion");
        info.setBackground( Color.white);
        info.setFont(new Font("Arial",Font.BOLD,10));
        info.setBorder(new LineBorder(Color.CYAN));
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hecho por ¬¬ ThePowerdinoDeluxe990", "Informacion", JOptionPane.PLAIN_MESSAGE);
            }
        });


        System.out.println("Calculadora java swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se pueda salir de la aplicacion
        frame.setResizable(false);//Esto hace que el usuario no pueda cambiar el tamaño de la ventana
        frame.setSize(600,600); //Pone una dimension predeterminada a la ventana
        frame.setVisible(true);
        frame.add(label);
        frame.setLayout(null);
        frame.add(button);
        frame.add(resta);
        frame.add(mult);
        frame.add(dividir);
        frame.add(text);
        frame.add(text2);
        frame.add(result);
        frame.add(info);




    }
}
