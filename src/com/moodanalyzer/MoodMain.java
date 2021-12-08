package com.moodanalyzer;

import java.util.Scanner;

public class MoodMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MoodAnalyzer call = new MoodAnalyzer();

		System.out.println("Mood Analyzer\n");
		
		//String sadMood = call.analyseMood("I am in sad mood");
		//System.out.println("User's mood is "+ sadMood);
		
		String anyMood = call.analyseMood("I am in any mood ");
		System.out.println("User's mood is "+ anyMood);
	}
}
