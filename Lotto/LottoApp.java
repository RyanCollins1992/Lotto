

import java.util.Scanner;

public class LottoApp {

    public LottoApp() {

    }

    public static void main(String[] args) {
	LottoSystem system = new LottoSystem();
	system.generateNumbers();
	
	final Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the users address:");
	String address = scanner.nextLine();
	System.out.println("Enter the users age:");
	int age = Integer.valueOf(scanner.nextLine());
	System.out.println("Enter the users first name:");
	String firstName = scanner.nextLine();
	System.out.println("Enter the users last name:");
	String lastName = scanner.nextLine();
	
	Person person = new Person(address, age, firstName, lastName);
	UserTicket ticket = new UserTicket(person);
	ticket.inputUserNumbers();
	
	system.addUserTicket(ticket);
	
	system.checkAllTickets();
    }
}
