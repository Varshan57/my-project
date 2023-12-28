package Awt_Swing;
import java.awt.*;

public class Sample extends Frame {
	Sample(){
		Button b1=new Button("Click Me");
		add(b1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(100,100);
		
	}
	
	

	public static void main(String[] args) {
		new Sample();

	}

}
