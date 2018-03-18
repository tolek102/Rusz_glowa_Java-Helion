import java.awt.*;
import java.awt.event.*;
class Impreza {
	public static void main(String[] args){
		Frame f = new Frame("Impreza!!");
		Label l = new Label("Impreza u Tomka!");
		Button b = new Button("Jasne, ze bede!");
		Button c = new Button("Stary nie dzisiaj");
		Panel p = new Panel();
		p.add(l);
		p.add(b);
		p.add(c);
		f.add(p);
		f.setSize(210,210);
		f.setVisible(true);
	}
}