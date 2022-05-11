Need to add the following: 
output shall be a single text file displaying the name of the input file in a heading

// Prompt the user for the name of a file and count the occurrences of each word in the file.
// Prompt the user to supply the name of the output file that stores the information
// Generate report for the frequencies of the words to the output file.

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
	   public static void main(String[] args) throws FileNotFoundException {

	       // prompt the user for the name of the file

	       Scanner input = null;
	       File selectedFile = null;
	       JFileChooser chooser = new JFileChooser();
	       chooser.setDialogTitle("WORD COUNTER: SELECT A TEXT FILE");
	       // choose file
	       if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	           selectedFile = chooser.getSelectedFile();
	           input = new Scanner(selectedFile);
	       }

	       // count occurrences
	       Map <String, Integer> wordCounts = new TreeMap <String, Integer>();

	       // this part may need tweaking
	       while (input.hasNext()) {
	           String next = input.next().toLowerCase();
	           if (!wordCounts.containsKey(next)) {
	               wordCounts.put(next, 1);
	           } else {
	               wordCounts.put(next, wordCounts.get(next) + 1);
	           }
	       }

	       // report frequencies
	       JOptionPane.showMessageDialog(null, "Total words = " + wordCounts.size(), "Total", JOptionPane.PLAIN_MESSAGE);

	       // prompt the user for the name of the output file
	       
	       String outName = JOptionPane.showInputDialog("Save As?");

	       // print
	       PrintWriter outFile = new PrintWriter(new File(outName));
	       outFile.println("Word count from  " + selectedFile);
	       outFile.println("Total words = " + wordCounts.size());
	       for (String word : wordCounts.keySet()) {
	           int count = wordCounts.get(word);
	           outFile.println(word + "\t" + count);
	       }
	       outFile.close();

	       // ending prompt
	       JOptionPane.showMessageDialog(null, "Your file has been saved. Thanks!", "File Saved", JOptionPane.PLAIN_MESSAGE);
	   }
	}

