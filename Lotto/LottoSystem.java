

import java.util.ArrayList;
import java.util.Random;

public class LottoSystem {

    private int ARRAY_SIZE = 6;
    static int MAX_LOTTO_NUM = 59;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private ArrayList<UserTicket> ticketDB = new ArrayList<UserTicket>();

    public LottoSystem() {

    }

    public void generateNumbers() {

	final Random random = new Random();

	for (int i = 0; i < ARRAY_SIZE; i++) {
	    numbers.add(random.nextInt(MAX_LOTTO_NUM));
	}
    }

    public int findMatches(ArrayList<Integer> userNums) {
	int matches = 0;
	for (int i : userNums) {
	    if (numbers.contains(i)) {
		matches++;
	    }
	}
	return matches;
    }

   public void addUserTicket(UserTicket ticket) {
	ticketDB.add(ticket);
    }

    public void checkAllTickets() {
	for (int i : numbers) {
	    System.out.println("Number drawn: " + i);
	}
	for (UserTicket t : ticketDB) {
	    System.out.println(t);
	    System.out.println("Number of matches: " + findMatches(t.getUserNumbers()));
	}
    }
}