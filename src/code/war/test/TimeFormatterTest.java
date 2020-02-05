package code.war.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.kata.TimeFormatter;

public class TimeFormatterTest {

	@Test
	public void formatDurationTest() {
		assertEquals("1 second", TimeFormatter.formatDuration(1));
		assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
		assertEquals("2 minutes", TimeFormatter.formatDuration(120));
		assertEquals("1 hour", TimeFormatter.formatDuration(3600));
		assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
	}

	@Test
	public void cleverFormatDurationTest() {
		assertEquals("1 second", TimeFormatter.cleverFormatDuration(1));
		assertEquals("1 minute and 2 seconds", TimeFormatter.cleverFormatDuration(62));
		assertEquals("2 minutes", TimeFormatter.cleverFormatDuration(120));
		assertEquals("1 hour", TimeFormatter.cleverFormatDuration(3600));
		assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.cleverFormatDuration(3662));
	}

}
