import java.util.Scanner;

public class Countries {
// it works, but need to polish off the entire program still.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valid = true;
		do{
		System.out.println("would you like to see all of the countries or would you like to add to them? type 'add' or 'see'");
		String choice = scan.nextLine();

		
		if(choice.equals("add")){
			CountriesTextFiles.addCountries();
		}else if (choice.equals("see")){
		CountriesTextFiles.readCountries();
		}else {
			System.out.println("well thsat wasnt a good command, lets try that again.");
		}
		
		while(true){

		System.out.println("would you like to continue? y/n?");
		
		String cont = scan.nextLine();
		if(cont.equals("y")){
			break;
		}else if (cont.equals("n")){
		return;
		}
		
		
		}
		}while(valid);
		}

}
