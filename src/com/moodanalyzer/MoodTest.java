package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodTest {

	@Test
	public void moodSad() throws Exception {
		MoodAnalyzer call = new MoodAnalyzer("I am in sad Mood ");
		assertEquals("SAD", call.analyseMood());
	}

	@Test
	public void moodHappy() throws Exception {
		MoodAnalyzer call = new MoodAnalyzer("I am in happy mood");
		assertEquals("HAPPY", call.analyseMood());
	}

}
