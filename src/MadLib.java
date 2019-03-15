import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MadLib {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		
		System.out.println("Enter an adjective: ");
		String s0 = kbReader.nextLine();
		System.out.println("Enter another adjective: ");
		String s1 = kbReader.nextLine();
		System.out.println("Enter a noun: ");
		String s2 = kbReader.nextLine();
		System.out.println("Enter another noun: ");
		String s3 = kbReader.nextLine();
		System.out.println("Enter a plural noun: ");
		String s4 = kbReader.nextLine();
		System.out.println("Enter a game: ");
		String s5 = kbReader.nextLine();
		System.out.println("Enter a plural noun: ");
		String s6 = kbReader.nextLine();
		System.out.println("Enter a verb ending in \"ing\": ");
		String s7 = kbReader.nextLine();
		System.out.println("Enter another verb ending in \"ing\": ");
		String s8 = kbReader.nextLine();
		System.out.println("Enter a plural noun: ");
		String s9 = kbReader.nextLine();
		System.out.println("Enter a noun ending in \"ing\": ");
		String s10 = kbReader.nextLine();
		System.out.println("Enter a noun: ");
		String s11 = kbReader.nextLine();
		System.out.println("Enter a plant: ");
		String s12 = kbReader.nextLine();
		System.out.println("Enter a part of the body: ");
		String s13 = kbReader.nextLine();
		System.out.println("Enter a place: ");
		String s14 = kbReader.nextLine();
		System.out.println("Enter a verb ending in \"ing\": ");
		String s15 = kbReader.nextLine();
		System.out.println("Enter an adjective: ");
		String s16 = kbReader.nextLine();
		System.out.println("Enter a number: ");
		String s17 = kbReader.nextLine();
		System.out.println("Enter one more plural noun: ");
		String s18 = kbReader.nextLine();
		
		System.out.println("");
		System.out.println("");
		System.out.printf("Sweet!! Here's your MadLib Vacation story:\n" +
							"A vacation is when you take a trip to some %s place\n" +
							"with your %s family. Usually you go to some place\n" +
							"that is near a/an %s or up on a/an %s.\n" +
							"A good vacation place is one where you can ride %s\n" +
							"or play %s or go hunting for %s. I like\n" +
							"to spend my time %s or %s.\n" +
							"When parents go on a vacation, they spend their time eating\n" +
							"three %s a day, and fathers play golf, and mothers\n" +
							"sit around %s. Last summer, my little brother\n" +
							"fell in a/an %s and got poison %s all\n" +
							"over his %s. My family is going to go to (the)\n" +
							"%s, and I will practice %s. Parents\n" +
							"need vacations more than kids because parents are always very\n" +
							"%s and because they have to work %s\n" +
							"hours every day all year making enough %s to pay\n" +
							"for the vacation.", 
							s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, 
							s11, s12, s13, s14, s15, s16, s17, s18);
		
		kbReader.close();
		
	}
}
