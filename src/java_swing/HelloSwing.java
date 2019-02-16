 package java_swing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import  java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementa heranca da classe JFrame
public class HelloSwing extends JFrame{
	//construtor da Classe
	public HelloSwing() {
		super ("Minha Janela");
		
		//definir dimensao
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		//criação de objeto JLabel
//		JLabel jLabel = new JLabel ("Hello Java's Visual Word!");
		
		//adicionar ao frame
//		add(jLabel, BorderLayout.CENTER);
	
		//criação de um botão
		JButton buttonNorte = new JButton ("Norte");
		JButton buttonSul = new JButton ("Sul");
		JButton buttonLeste = new JButton ("Leste");
		JButton buttonOeste = new JButton ("Oeste");
		JButton buttonCentro = new JButton ("Centro");
		
		//adicionar ao frame
		add (buttonNorte, BorderLayout.NORTH);
		add (buttonSul, BorderLayout.SOUTH);
		add (buttonLeste, BorderLayout.EAST);
		add (buttonOeste, BorderLayout.WEST);
		add (buttonCentro, BorderLayout.CENTER);
		
		buttonCentro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Click Botão Centro!");
			}
		});
		
		
		//habilitar visibilidade do frame após iniciar componentes
				setVisible(true);
		}
		
		
	
	public static void main (String[] args) {
		new HelloSwing();
	}
	
}
