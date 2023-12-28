package Awt_Swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sign_Up_Form {
	
	Sign_Up_Form(){
		Frame f =new Frame("Signup form");
		Label email=new Label("email");
		email.setBounds(50, 30, 50, 40);
		Label password=new Label("password");
		password.setBounds(50, 60, 50, 40);
		Label degree=new Label("degree");
		degree.setBounds(50, 90, 50, 40);
		TextField Emailinput = new TextField("Enter email");
		Emailinput.setBounds(150, 30, 150, 20);
		TextField Passwordinput = new TextField("Enter password");
		Passwordinput.setBounds(150, 60, 150, 20);
		TextField degreeinput = new TextField("Enter degree");
		degreeinput.setBounds(150, 90, 150, 20);
		
		Button submit=new Button("register");
		submit.setBounds(150, 200, 150, 20);
		
		ActionListener sl=new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				System.out.println(Emailinput.getText());
				System.out.println(Passwordinput.getText());
				System.out.println(degreeinput.getText());

				
				
			}
			
		};
		submit.addActionListener(sl);
		f.add(email);
		f.add(password);
		f.add(degree);
		f.add(Emailinput);
		f.add(Passwordinput);
		f.add(degreeinput);
		f.add(submit);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);


		
	}

	public static void main(String[] args) {
		new Sign_Up_Form();

	}

}
