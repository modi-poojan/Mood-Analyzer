package com.moodanalyzer;

import java.util.Scanner;

public class MoodMain {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		MoodAnalyzer call = new MoodAnalyzer();
		
		System.out.println("Mood Analyzer\n");
		System.out.println("Please define your to mood continue\n");
		String message = scan.nextLine();
		
		String output = call.analyseMood(message);
		
	}
	
	
	
}
