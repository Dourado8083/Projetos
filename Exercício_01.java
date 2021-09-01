package Exercicios;

import java.awt.*;
import java.awt.event.*;

public class Exercício_01 extends Frame {
	Button B1;
	Button B2;
	TextField Tx1;
	Label L1, L2, L3, L4;

	public Exercício_01() {
		setTitle("Entrada de um valor"); //Exercicio 01 com entrada de um valor
		setResizable(false);
		setSize(500,300);
		setLocation(100,100);
		setBackground(Color.blue);
		setLayout(null);
		
		L1 = new Label("A classe visual"); //Exercicio que mostra uma classe visual
		L1.setLocation(50, 50);
		L1.setSize(120, 30);

		L2 = new Label("Digite um valor");
		L2.setLocation(20, 100);
		L2.setSize(120, 30);

		L3 = new Label("Resultado");
		L3.setLocation(20, 160);
		L3.setSize(120, 30);

		L4 = new Label("");
		L4.setLocation(150, 160);
		L4.setSize(120, 30);

		Tx1 = new TextField("");
		Tx1.setSize(60, 30);
		Tx1.setLocation(150, 100);

		B1 = new Button("Mostrar");
		B1.setSize(120,50);
		B1.setLocation(80,235);
		B1.setBackground(new Color(150,220,255));

		B2 = new Button("Sair");
		B2.setSize(120,50);
		B2.setLocation(280, 235);
		B2.setBackground(new Color(150,220,225));

		add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(B1);
		add(B2);
		add(Tx1);

		ButtonHandler handler = new ButtonHandler();
		B1.addActionListener(handler);
		B2.addActionListener(handler);
	}

	public static void main(String[] args) {
		new Exercício_01().setVisible(true);
	}

public boolean handleEnvent(Event e) {
if(e.id ==Event.WINDOW_DESTROY)
	System.exit(0);
return(super.handleEvent(e));
}
private class ButtonHandler implements ActionListener{
public void actionPerformed(ActionEvent e)
{
String Num1;

if(e.getActionCommand() == "Sair")
	System.exit(0);
else
{
Num1 = Tx1.getText();
if(Integer.parseInt(Num1)==0)
L3.setText("O valor é zero");
else if(Integer.parseInt(Num1)%2==0)
L3.setText("O valor é par");
else
L3.setText("O valor é impar");
}
}
}
}

