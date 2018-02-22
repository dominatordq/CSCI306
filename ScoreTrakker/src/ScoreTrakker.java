import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author dquintana, ztmills
 * ScoreTrakker class
 */
public class ScoreTrakker {
	private ArrayList<Student> studentArray = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	
	public void loadDataFromFile(String fileName) throws FileNotFoundException {
		FileReader reader = new FileReader(fileName);
		Scanner in = new Scanner(reader);
		
		String name = "";
		String score = "";
		int parsedScore = 0;
		while(in.hasNextLine()) {
			name = in.nextLine();
			score = in.nextLine();
			try {
				parsedScore = Integer.parseInt(score);
				Student tempStudent = new Student(name, parsedScore);
				studentArray.add(tempStudent);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + score);
				System.out.println();
			}
		}
		in.close();
	}
	
	public void printInOrder() {
		System.out.println("Student Score List");
		Collections.sort(studentArray);
		for (Student s : studentArray) {
			System.out.println(s);
		}
	}
	
	public void processFiles() {
		int fileNum = 2; //can change to test file in files array
		try {
			loadDataFromFile(files[fileNum]);
			printInOrder();
		} catch (FileNotFoundException e){
			System.out.println("Can't open file: " + files[fileNum]);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreTrakker tracker = new ScoreTrakker();
		tracker.processFiles();

	}

}
