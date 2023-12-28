package Awt_Swing;
import java.awt.*;
public class Simple_Demo {
	Simple_Demo(){
		Frame frm=new Frame("Varshan app");
		/*Button b1=new Button("Click Me");
		frm.add(b1);
		Button b2=new Button("Click Me");
		frm.add(b2);*/
		/*
		 * Label 1=new Label("UserName"); frm.add(1); TextField tf =new
		 * TextField("Enter username"); frm.add(tf); TextArea ta=new
		 * TextArea("Enter Discription"); frm.add(ta);
		 */
		Checkbox cb=new Checkbox("Male");
		//frm.add(cb);
		Choice c=new Choice();
		c.add("B.E");
		c.add("BSC");
		c.add("M.E");
		c.add("B.Tech");
		frm.add(c);
		
		frm.setLayout(new FlowLayout());
		frm.setVisible(true);
		frm.setSize(300,300);

	}

	public static void main(String[] args) {
		new Simple_Demo();

	}

}
