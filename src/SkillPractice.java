import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String cent = JOptionPane.showInputDialog("How many dimes to you have?"); 

int mun = Integer.parseInt(cent);


// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null,"You have "+mun*10+" cents");



// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("How tall are you in inches");

int hi = Integer.parseInt(height);

// If they are shorter than 36 inches, tell them to eat their Wheaties
if(hi<36) {
	JOptionPane.showMessageDialog(null, "You need to eat more Wheaties!");
}

else  {
	JOptionPane.showMessageDialog(null, "You've had enough Wheaties.");
}
}


void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for(int i = 0; i < 31; i+=3) {
	System.out.println(i);
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
	 Random r1 = new Random();
	 int random = new Random().nextInt(20);
System.out.println("First Random: " +random);

// Get another random number that is less than 10 and print it to the console 
Random r2 = new Random();
int random2 = new Random().nextInt(10);
System.out.println("Second Random: " +random2);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, "The difference of both the random numbers is: "+(random-random2));


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String monkeh = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 
if(monkeh.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city!");
}


// Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego!");
}

	


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = JOptionPane.showInputDialog("How many cars does you family have?");

int car = Integer.parseInt(cars);

if(car==0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation!");
}
// If there is 1 car, use a pop-up to display the make/model of the car 
if(car==1) {
	JOptionPane.showMessageDialog(null, "You have a Honda Civic!");
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else {
	JOptionPane.showMessageDialog(null,"In all, your cars have this many wheels: " +car*4);
}



}
void skill5() { // In a pop-up, ask the user for the name of their school 
String badSchool = JOptionPane.showInputDialog("What is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null,badSchool+ " sounds like a 0.2 star school! I feel bad that you go there. Just kidding. But it does sound like a 2 star school. Still pretty bad." );


}
}