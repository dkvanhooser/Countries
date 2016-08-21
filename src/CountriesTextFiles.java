import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFiles {
	static Path countriesPath = Paths.get("./Countries.txt");
	static File countriesFile = countriesPath.toFile();

	
	public static void readCountries() {


		try {
			FileReader fr = new FileReader(countriesFile);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line !=null){
			String country = br.readLine();
			System.out.println(country);
			
			
			line = br.readLine();
			}
		} catch (FileNotFoundException e) {

			System.out.println("oops file not found!!!!");
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	// theres a bug that sometimes put null in the countries list that i need to fix.
	//
	public static void addCountries(){

		Scanner scan = new Scanner(System.in);
		try {
			//FileWriter fr = new FileWriter(countriesFile);
			System.out.println("please enter a country to add to the end of the list.");
			String line = scan.nextLine();
			FileWriter fw = new FileWriter(countriesFile, true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter out = new PrintWriter(bw);
//			out.println(line);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.newLine(); 
			bw.write(line); 
			bw.flush();
		} catch (FileNotFoundException e) {

			System.out.println("oops file not found!!!!");
			return;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
//not implemented yet working on this method still
	public static void removeCountires(){
		try {
			FileReader fr = new FileReader(countriesFile);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line !=null){
			String country = br.readLine();
			System.out.println(country);
			
			
			line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("oops file not found!!!!");
			return;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
 }

}
