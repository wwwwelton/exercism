public class LogLevels {

	public static String message(String logLine) {
		String[] substring = logLine.split(":");
		return substring[1].trim();
	}

	public static String logLevel(String logLine) {
		String[] substring = logLine.split(":");
		return substring[0].substring(1, substring[0].length() - 1).toLowerCase();
	}

	public static String reformat(String logLine) {
		return message(logLine) + " (" + logLevel(logLine) + ")";
	}

	// public static void main(String[] args) {
	// System.out.println(logLevel("[ERROR]: Disk full"));
	// }

}
