package com.mondayassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BattingStatCalculator {
public static void main(String[] args)
{
	Scanner bats = new Scanner(System.in);
	Scanner bases = new Scanner(System.in);
	
	float  sumOfBasesFromAtBats = 0;
	float battingAverage = 0;
	float sluggingPercentage = 0;
	float totalHits = 0;
	
	System.out.println("Welcome to the Batting Stat Calculator!");
	System.out.println("Enter the number of at-bats for the player:");
	String atBats = bats.nextLine();
	float numberOfAtBatsAsFloat = Float.parseFloat(atBats);
	ArrayList<Float> atBatsResults = new ArrayList <>();

	
	for (int i = 0; i < numberOfAtBatsAsFloat; i++) 
	{
		System.out.println("What was the result of at bat "  + (i + 1) +" (valid answers are 0-4)");
		String results = bats.nextLine();
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

	
	
	

