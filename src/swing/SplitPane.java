/*
 * JSplitPane: split the pane horizontally/ vertically.
 * Case: create a GUI of Merriam-Webster's dictionary.
 */
package swing;
import java.awt.*;
import javax.swing.*;

public class SplitPane extends JFrame{
	//define components
	JSplitPane jsp;
	JList jl;
	JLabel jlb; //This time the label is an image

	public static void main(String[] args) {
		SplitPane sp =  new SplitPane();
	}
	public SplitPane(){
		//build components
		String[] words = {"Merriam","Webster","Thesaurus"};
		jl = new JList(words);
		
		jlb = new JLabel(new ImageIcon("images/merriam.png"));
		//split the pane
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jl, jlb);
		//make it expandable
		jsp.setOneTouchExpandable(true);
		//set layout (Note: JFrame use BorderLayout by default)
		//add components
		this.add(jsp);
		this.setTitle("Merriam-Webster's Dictionary");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
