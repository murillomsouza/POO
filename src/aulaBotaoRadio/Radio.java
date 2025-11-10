package aulaBotaoRadio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JRadioButton radio1 = new JRadioButton("Manhã");
	JRadioButton radio2 = new JRadioButton("Tarde");
	JRadioButton radio3 = new JRadioButton("Noite");
	
	public Radio() {
		super("Horário");
		Container cont = getContentPane();
		
		ButtonGroup grupo = new ButtonGroup();
		
		JButton botao = new JButton("Verificar");
		
		JLabel rotulo = new JLabel("Selecione um período: ");
		setLayout(null);
		
		grupo.add(radio1);
		grupo.add(radio2);
		grupo.add(radio3);
		
		cont.add(rotulo);
		
		cont.add(radio1);
		cont.add(radio2);
		cont.add(radio3);
		cont.add(botao);
		
		rotulo.setBounds(50,30,200,20);
		radio1.setBounds(50,60,100,20);
		radio2.setBounds(50,90,100,20);
		radio3.setBounds(50,120,100,20);
		
		botao.setBounds(50,150,100,20);
		
		
		ClicaBotao evento = new ClicaBotao();
		botao.addActionListener(evento);
		
		setVisible(true);
		setSize(500,300);
	}
	
	public class ClicaBotao implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(radio1.isSelected()==true) {
				JOptionPane.showMessageDialog(null,"É mentiraaaaaaa");
				
			}else if(radio2.isSelected()==true) {
				JOptionPane.showMessageDialog(null, "Você é besta?");
			
			}else if (radio3.isSelected()==true){
				JOptionPane.showMessageDialog(null, "Ta certo");
				
			}else{
				JOptionPane.showMessageDialog(null, "Selecione algum faz favor");
				
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		new Radio();
		
	}
}
