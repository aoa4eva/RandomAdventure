package notdefaultpackage;
import java.util.Scanner;

import anotherpackage.OtherClass;

public class MainAdventure {
	/**
	 * This is a simple sample of the Main Adventure application using classes...and methods. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String startLoc = null; 
		AdventureOptions myAdventure = new AdventureOptions();
		System.out.println("Where would you like to start? The (k)itchen or the (b)edroom?");
		startLoc = sc.nextLine();
		myAdventure.whereToStart(startLoc);
		System.out.println(myAdventure.getToDisplay());
		OtherClass oc = new OtherClass();
		System.out.println(oc.getCountdown());
	}
}
