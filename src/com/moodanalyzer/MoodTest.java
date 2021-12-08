package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodTest {

	@Test
	public void moodSad() {
		MoodAnalyzer call = new MoodAnalyzer("I am sad");
		assertEquals("SAD", call.analyseMood());
	}
	
	@Test
	public void happySad() {
		MoodAnalyzer call = new MoodAnalyzer("I am in any mood");
		assertEquals("HAPPY", call.analyseMood());
	}
}
