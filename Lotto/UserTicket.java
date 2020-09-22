

import java.util.ArrayList;
import java.util.Scanner;

public class UserTicket {

    private Person person;
    private int ARRAY_SIZE = 6;
    private ArrayList<Integer> userNumbers = new ArrayList<Integer>();

    public UserTicket(Person person) {
	this.person = person;
    }

    public void inputUserNumbers() {
	System.out.println("Choose " + getUserDetails().getFirstName() + "'s numbers!");
	System.out.println("Enter " + ARRAY_SIZE + " numbers followed by commas (ex) 1,2,3,4,5,6");
	Scanner scanner = new Scanner(System.in);
	String[] numbers = scanner.nextLine().split(",");
	if (numbers.length == ARRAY_SIZE) {
	    for (String s : numbers) {
		int value = Integer.valueOf(s);
		userNumbers.add(value);
	    }
	} else {
	    System.out.println("You did not enter " + ARRAY_SIZE + " numbers.");
	}
	scanner.close();
    }

    public Person getUserDetails() {
	return person;
    }

    public ArrayList<Integer> getUserNumbers() {
	return userNumbers;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder(person.getFirstName() + " " + person.getLastName() + "'s ticket\n");
	for (int i : userNumbers) {
	    builder.append("User number: " + i + "\n");
	}
	return builder.toString();
    }
}