
public class UseReadFromFile {
	// How to use ReadFromFile
	public static void main(String[] args) throws Exception {
		new ReadFromFile(".", "config.txt").readAll();
	}
}

/*public static void main1(String[] args) throws Exception {
		ReadFromFile f = new ReadFromFile(".", "config.txt");
		String line = f.readline();
		while (line != null) {
			System.out.println(line);
			line = f.readline();

		}
	}*/