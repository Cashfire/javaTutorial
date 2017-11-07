/*
 * JTextArea: multiple text boxes
 * Case: QQ chat window
 */
package swing;
import java.awt.*;
import javax.swing.*;
import java.net.*;

public class JTextAreaDemo extends JFrame {
	JTextArea jta = null;
	JScrollPane jsp = null;
	JPanel jp = null;
	JComboBox jcb = null;
	JTextField jtf = null;
	JButton jb = null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTextAreaDemo chatwindow = new JTextAreaDemo();
	}
	public JTextAreaDemo(){
		//build the components
		jta = new JTextArea(); //container for the chats
		jsp = new JScrollPane(); //we can scroll the chat pane 
		jp = new JPanel();
		String[] friends = {"Trump", "Obama"};
		jcb = new JComboBox(friends);
		jtf = new JTextField(10);
		jb = new JButton("Send");
		//set layout
		//add the components to the jpanel
		jp.add(jcb);
		jp.add(jtf);
		jp.add(jb);
		//add the panels to jframe
		this.add(jsp);
		this.add(jp, BorderLayout.SOUTH);
		//set frame
		this.setTitle("QQ chat window");
		//set icon in the title part?????
		URL url = getClass().getResource("../icon.jpg");
		System.out.println(url);
		ImageIcon icon = new ImageIcon(url);
		this.setIconImage(icon.getImage());
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
