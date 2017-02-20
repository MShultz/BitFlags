package shultz.logic;

public class StringEditor {
	public static String editString(String valueToEdit, int choice) {
		String editedString = valueToEdit;
		if ((choice & EditType.UPPERCASE) == EditType.UPPERCASE)
			editedString = editedString.toUpperCase();
		if ((choice & EditType.ASCII) == EditType.ASCII)
			editedString = getAscii(editedString);
		if ((choice & EditType.REVERSE) == EditType.REVERSE)
			editedString = new StringBuffer(editedString).reverse().toString();
		if ((choice & EditType.EMPHASIS) == EditType.EMPHASIS)
			editedString = "!!!!!!!!!!" + editedString + "!!!!!!!!!!";
		if ((choice & EditType.MIRROR) == EditType.MIRROR)
			editedString = editedString + new StringBuffer(editedString).reverse().toString();
		return editedString;
	}
	
	private static String getAscii(String valueToEdit){
		String asciiConversion = "";
		for(int i = 0; i < valueToEdit.length(); ++i){
			asciiConversion += (int) valueToEdit.charAt(i) + " ";
		}
		return asciiConversion.trim();
	}
}
