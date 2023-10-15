package CuboRubix;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana() {
		this.setLayout(null);;
		this.setTitle("Cubo Rubix");
		this.setSize(500,500);
		this.Components();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public void Components() {
			
			Panel Pan = new Panel();
			Pan.setBounds(10, 10, 100, 100);;
			Pan.setBackground(Color.blue);
			this.add(Pan);
			Panel Pan1 = new Panel();
			Pan1.setBounds(110, 10, 100, 100);;
			Pan1.setBackground(Color.orange);
			this.add(Pan1);
			Panel Pan2 = new Panel();
			Pan2.setBounds(210, 10, 100, 100);;
			Pan2.setBackground(Color.red);
			this.add(Pan2);
			Panel Pan3 = new Panel();
			Pan3.setBounds(10, 110, 100, 100);;
			Pan3.setBackground(Color.white);
			this.add(Pan3);
			Panel Pan4 = new Panel();
			Pan4.setBounds(210, 210, 100, 100);;
			Pan4.setBackground(Color.yellow);
			this.add(Pan4);
			Panel Pan5 = new Panel();
			Pan5.setBounds(10, 210, 100, 100);;
			Pan5.setBackground(Color.green);
			this.add(Pan5);
			Panel Pan6 = new Panel();
			Pan6.setBounds(110, 110, 100, 100);;
			Pan6.setBackground(Color.blue);
			this.add(Pan6);
			Panel Pan7 = new Panel();
			Pan7.setBounds(110, 210, 100, 100);;
			Pan7.setBackground(Color.red);
			this.add(Pan7);
			Panel Pan8 = new Panel();
			Pan8.setBounds(210, 110, 100, 100);;
			Pan8.setBackground(Color.white);
			this.add(Pan8);
		}
	}
	


