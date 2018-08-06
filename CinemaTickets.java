import java.util.Scanner;

public class CinemaTickets {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String showTime = "";
		int StandTicket, OTicket, STicket, CTicket;
		
		
		System.out.println("How many standard tickets do you need?");
		StandTicket = keyboard.nextInt();
			
		System.out.println("How many OAP tickets do you need?");
		OTicket = keyboard.nextInt();
		
		System.out.println("How many student tickets do you need?");
		STicket = keyboard.nextInt();
		
		System.out.println("How many child tickets do you need?");
		CTicket = keyboard.nextInt();
	
		
		System.out.println("Please enter day of showing:");
		showTime = keyboard.next();
		if(showTime.equals("Wednesday")){
				
			int sumdis = 6*StandTicket + 4*OTicket + 4*STicket + 2*CTicket;
			
			System.out.println("The total cost of tickets for this movie is £" +sumdis);
			}
			
			else 	{
				int sum = 8*StandTicket + 6*OTicket + 6*STicket + 4*CTicket;
				
				System.out.println("The total cost of tickets for this movie is £" +sum);}
	}
}
