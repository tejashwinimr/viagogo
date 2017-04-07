package viagogo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


/**
 * The Class EventsAround.
 */
public class EventsAround {

	/** The events. Array to hold events */
	public static Coordinate [][] events = new Coordinate [20][20];
	
	/**
	 * The main method.
	 *
	 * 
	 */
	public static void main(String args[]) {
		int x,y;
		int id = 0;
		double price =0.0;
		ArrayList<String> used = new ArrayList<String>(); 
		for(int i=0;i<events.length;i++) {
			for(int j=0;j<events[0].length;j++) {
				events[i][j] = new Coordinate(i,j); 
			}
		}
		Random rand = new Random();
		//generating random values and storing it in an arraylist called 'used' 
		while(used.size() < 10) {
			x = rand.nextInt(20);
			y = rand.nextInt(20);
			String coord = x+","+y;
			if(!used.contains(coord)) {
				used.add(coord);
				//generating price randomly
				price =  10 + (40) * rand.nextDouble();
				price = Math.round(price*100.0)/100.0;
				//assigning price, tickets and event id to events .  
				events[x][y].price = price;
				events[x][y].tickets = rand.nextInt(10);
				events[x][y].event = id++;
				
			}
		}
		//User inputs the pair to coordinates. 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x and y coordinates:");
		 int input_x = input.nextInt();
		 int input_y = input.nextInt();
		 //Condition to check if the input value lies in between +10 to -10 
		 if((input_x >= -10 && input_x <= 10)&&(input_y >= -10 && input_y <= 10))
		  { 
		ArrayList<Coordinate> nearest = getNearest(input_x, input_y);

		System.out.println("Closest Events to ("+input_x+","+input_y+"):");
		System.out.println("Event "+nearest.get(0).event +" - $"+nearest.get(0).price + ", Distance " + nearest.get(0).distance);
		System.out.println("Event "+nearest.get(1).event +" - $"+nearest.get(1).price + ", Distance " + nearest.get(1).distance);
		System.out.println("Event "+nearest.get(2).event +" - $"+nearest.get(2).price + ", Distance " + nearest.get(2).distance);
		System.out.println("Event "+nearest.get(3).event +" - $"+nearest.get(3).price + ", Distance " + nearest.get(3).distance);
		System.out.println("Event "+nearest.get(4).event +" - $"+nearest.get(4).price + ", Distance " + nearest.get(4).distance);
	    	}
		 
		 else
			{
			System.out.println("Oops!! You have entered an invalid input,Please try again");
			System.exit(0);
			  
			}
	}
	/**
	 * Prints the array.
	 */
	public static void printArray() {
		for(int i=0;i<events.length;i++) {
			for(int j=0;j<events[0].length;j++) {
				System.out.print(events[i][j].event + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * Gets the nearest distance 
	 *
	
	 */
	public static ArrayList<Coordinate> getNearest(int x, int y) {
		
		ArrayList<Coordinate> distances = new ArrayList<Coordinate>();

		for(int i=0;i<events.length;i++) {
			for(int j=0;j<events[0].length;j++) {
				if(events[i][j].event != 0) {
					//Manhattan distance 
					events[i][j].distance = (Math.abs(x-events[i][j].x) + Math.abs(y-events[i][j].y));
					distances.add(events[i][j]);
				}
			}
		}
		//Sorting the distance 
		Collections.sort(distances, new Comparator<Coordinate>() {

	        public int compare(Coordinate o1, Coordinate o2) {
	            return compareDistance(o1.distance,o2.distance);
	        }
	    });
		
		return distances;
	}
	
	/**
	 * Compare distance.
	 *
	
	 */
	public static int compareDistance(int a, int b) {
	    return a < b ? -1
	         : a > b ? 1
	         : 0;
	}
}