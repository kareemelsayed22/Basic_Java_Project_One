
//Kareem El Sayed 11D
import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

// The dates will be in the form yyyymmdd (such as 20181001 for October 1, 2018). The GUI should
//have a GridLayout with one row and two columns. The left column should display the dates in the
//format read from the file, and the right column should display the dates as Date212 object in sorted
//order
public class DatesGui extends JFrame {
	JFrame gui;
	String[] stringarray;
	Dates212[] dates;

	public DatesGui(String[] array, Dates212[] dates) {
		stringarray = array;
		this.dates = dates;
		this.setSize(1000, 400);
		this.setLocation(200, 200);
		this.setLayout(new GridLayout(1, 2));

		String rawFormat = "";
		String dateFormat = "";

		for (Dates212 date : dates) {
			rawFormat += date.getDate() + " ";
			dateFormat += date.tostring() + " ";
		}

		this.add(new JLabel(rawFormat));
		this.add(new JLabel(dateFormat));

		this.setTitle("Date212");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	static TextFileInput inFile;
	static String inFileName = "input.txt";
	static Container cPane;
	static TextArea original, different;

	public static void initialize() {
		inFile = new TextFileInput(inFileName);
		original = new TextArea();
		different = new TextArea();

	}

	public static void readNumbersFromFile(String fileName) {
		/*
		 * Add code to this method so... - the two text areas are added to the content
		 * pane of the JFrame (see the code in the PowerPoint on GUIs) - numbers are
		 * read from the file, and even numbers are put in the TextArea "even", odd
		 * numbers in "odd". - At end of file, the JFrame is made visible.
		 */
		String line;
		line = inFile.readLine();
		while (line != null) {

		} // while
	} // readSSNsFromFile

}
