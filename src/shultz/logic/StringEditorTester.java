package shultz.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringEditorTester {
	private final String testingString = "It'll be ok";
	private final int UPPERCASE_AND_ASCII = EditType.UPPERCASE | EditType.ASCII;
	private final int UPPERCASE_AND_REVERSE = EditType.UPPERCASE | EditType.REVERSE;
	private final int ASCII_AND_REVERSE = EditType.ASCII | EditType.REVERSE;
	private final int UPPERCASE_ASCII_AND_REVERSE = EditType.ASCII | EditType.UPPERCASE | EditType.REVERSE;

	@Test
	public void test() {
		assertEquals("IT'LL BE OK", StringEditor.editString(testingString, EditType.UPPERCASE));
		assertEquals("73 116 39 108 108 32 98 101 32 111 107", StringEditor.editString(testingString, EditType.ASCII));
		assertEquals("ko eb ll'tI", StringEditor.editString(testingString, EditType.REVERSE));
		assertEquals("!!!!!!!!!!It'll be ok!!!!!!!!!!", StringEditor.editString(testingString, EditType.EMPHASIS));
		assertEquals("It'll be okko eb ll'tI", StringEditor.editString(testingString, EditType.MIRROR));
	}

	@Test
	//Testing all possible combinations occurring from 1 - 8
	public void additionalTests() {
		assertEquals("73 84 39 76 76 32 66 69 32 79 75", StringEditor.editString(testingString, UPPERCASE_AND_ASCII));
		assertEquals("KO EB LL'TI", StringEditor.editString(testingString, UPPERCASE_AND_REVERSE));
		assertEquals("701 111 23 101 89 23 801 801 93 611 37", StringEditor.editString(testingString, ASCII_AND_REVERSE));
		assertEquals("57 97 23 96 66 23 67 67 93 48 37", StringEditor.editString(testingString, UPPERCASE_ASCII_AND_REVERSE));
		
		
	}
}
