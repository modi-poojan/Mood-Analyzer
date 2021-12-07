package com.moodanalyzer;

import java.util.Scanner;

public class MoodMain {

	public static void main(String[] args) {
 TestCase_1.1

		Scanner scan = new Scanner(System.in);
		MoodAnalyzer call = new MoodAnalyzer();

		System.out.println("Mood Analyzer\n");
		
		String output = call.analyseMood("I am in sad mood");
		System.out.println("User's mood is "+ output);
	}

	
		Scanner scan = new Scanner(System.in);
		MoodAnalyzer call = new MoodAnalyzer();
		
		System.out.println("Mood Analyzer\n");
		System.out.println("Please define your to mood continue\n");
		String message = scan.nextLine();
		
		String output = call.analyseMood(message);
		
	}
	
	
	
 main
}
