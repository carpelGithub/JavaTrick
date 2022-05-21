import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	
	private String fileName;
	private String directory;
	private Scanner in;

	
	// costructor
	public ReadFromFile(String directory, String fileName) {

		this.fileName = fileName;
		this.directory = directory;

		try {

			// pass the path to the file as a parameter
			in = new Scanner(new File(this.directory, this.fileName));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String readline() {

		if (in.hasNextLine())
			return in.nextLine();
		else in.close();
		return null;
	}

	public void readAll() {
		int i = 0;

		while(in.hasNextLine())
			System.out.println( in.nextLine());
		
		in.close();
	}

	// Generete getters and setters
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}
}

