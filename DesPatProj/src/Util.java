import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;


public class Util {
	
	public static Scanner readFile(String filename){
		String path = System.getProperty("user.dir") + "/src/files/";
		Scanner scan = null;
		try{
		scan = new Scanner(new FileReader(path + filename));
		}
		catch(FileNotFoundException fnf){
			System.err.print(fnf);
		}
		return scan;
	}

}
