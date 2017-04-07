Name 	: Tejashwini
Date	: 06/04/2017
Task	: Program which accepts a user location as a pair of co-ordinates, and returns a list of the five closest events, along with the cheapest ticket price for each event.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. The program was built in Eclipse IDE .

2. All code was programmed using Java

3. File: src > EventsAround.java
	 > Coordinates.java

4. Run : CTRL + F11
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Instructions to Compile and Run the program from command prompt

-> From the Command Prompt, navigate to the directory containing the src folder. Use the following command to compile the program unit.

	>javac -d ../bin Coordinate.java
	>javac -d ../bin -cp ../bin EventsAround.java

	OR
	>javac -d ../bin *.java (To compile all the .java files in the src folder)

->After sucessful compilation,use the following java command to execute your program

	>java -cp ../bin viagogo.EventsAround

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Sample Output:

Enter the x and y coordinates:
10
10
Closest Events to (10,10):
Event 9 - $17.93, Distance 3
Event 6 - $20.71, Distance 6
Event 3 - $21.73, Distance 6
Event 1 - $33.24, Distance 6
Event 4 - $43.08, Distance 7

The Program will ask the user to enter the coordiate values. 
The user inputs (10,10)
The Program finds the closest events around the coordinate(10,10), sorts the list based on the distance and outputs the 5 nearest location along with the price and even id. 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assumptions :

1. All values are randomly generated. 

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

How might you change your program if you needed to support multiple events at the same location?

answer:  I would use Hashmap instead of 2dimensional array and store the multiple events for a coordinate. 

How would you change your program if you were working with a much larger world size?

answer: I would still use the same code for larger world size and I would run java -XmxM based on my world size to boost the heap memory. 
Another solution would be using hasmap . 


