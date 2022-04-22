package wordle.io;

public class ColoredStrings {
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE


    public static String getInGreen(String s) {
        return (GREEN + s + RESET);
    }

    public static String getInYellow(String s) {
        return (YELLOW + s + RESET);
    }

    public static String getInCyan(String s) {
        return (CYAN + s + RESET);
    }


}
