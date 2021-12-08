package com.moodanalyzer;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {

		try {
		if (this.message.contains("sad")) 
			return "SAD";
		 else 
			return "HAPPY";
		
		}catch(NullPointerException obj){
			return "Happy";
		}
	}
}
