package com.mondayassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BattingStatCalculator 
{
	

public static void main(String[] args)
{
		
	
	
	
	float  sumOfBasesFromAtBats = 0;
	float battingAverage = 0;
	float sluggingPercentage = 0;
	float totalHits = 0;
	
	ArrayList<Float> atBatsResults = new ArrayList <>();
	System.out.println("Welcome to the Batting Stat Calculator!");
	System.out.println("Enter the number of at-bats for the player:");
	Scanner bats = new Scanner(System.in);
	String atBats = bats.nextLine();
	
	try
	{
		int testNum = Integer.parseInt(atBats);
		if (Float.parseFloat(atBats) < 0)
		{
			throw new Exception ("lessThanZero");
		}
		else
	{
			Scanner bases = new Scanner(System.in);	
	float numberOfAtBatsAsFloat = Float.parseFloat(atBats);

	
	for (int i = 0; i < numberOfAtBatsAsFloat; i++) 
	{
		System.out.println("What was the result of at bat "  + (i + 1) +" (valid answers are 0-4)");
		String results = bats.nextLine();
		int testNum2 = Integer.parseInt(results);
		if (Float.parseFloat(results) > 4)
		{
			throw new Exception("greaterThanFour");
		}
		if (Float.parseFloat(results) < 0)
		{
			throw new Exception("lessThanZero");
		}
		float numberOfAtBats = Float.parseFloat(results);
		
		atBatsResults.add(numberOfAtBats);
		
			
		}
	System.out.println(atBatsResults);
	
	for (int i = 0; i < atBatsResults.size(); i++)
	{
		sumOfBasesFromAtBats += atBatsResults.get(i);
	}
	
	System.out.println("Total Bases: " + sumOfBasesFromAtBats);
	
	sluggingPercentage = (sumOfBasesFromAtBats/numberOfAtBatsAsFloat);
	System.out.printf("The player's slugging percentage is %.3f" , sluggingPercentage);
	
	for (int i = 0; i < atBatsResults.size(); i++) 
	{
		if (atBatsResults.get(i) > 0)
		{
			totalHits ++;
		}
	}
	battingAverage = totalHits / numberOfAtBatsAsFloat;
	System.out.println();
	System.out.printf("The player's batting average is %.3f" ,  battingAverage);
	}
	}	
	catch (Exception Negentry)
	{
		System.out.println("You made an error. Please try again");
	}
	}
}

	


	

