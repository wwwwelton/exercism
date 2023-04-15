class SqueakyClean {
	static String clean(String identifier) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < identifier.length(); i++) {
			if (identifier.charAt(i) == ' ')
				sb.append("_");
			else if (Character.isISOControl(identifier.charAt(i)))
				sb.append("CTRL");
			else if (identifier.charAt(i) == '-') {
				i++;
				if (Character.isLetter(identifier.charAt(i)))
					sb.append(Character.toUpperCase(identifier.charAt(i)));
			} else if (!Character.isLetter(identifier.charAt(i)))
				continue;
			else if (Character.UnicodeBlock
					.of(identifier.charAt(i)) == Character.UnicodeBlock.GREEK) {
				if (Character.isLowerCase(identifier.charAt(i)))
					continue;
				else
					sb.append(identifier.charAt(i));
			} else
				sb.append(identifier.charAt(i));
		}
		return sb.toString();
	}

	// public static void main(String args[]) {
	// System.out.println(SqueakyClean.clean("à-ḃç"));
	// }
}
