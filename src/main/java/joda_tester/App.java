package joda_tester;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

/**
 * The Joda Format Test Program
 */
public class App 
{
	/**
	 * The JodaTester Program. Use this program to test whether a given date matches a given
	 * Joda format
	 * @param args An array where the first element is a joda format and the second is a string 
	 * representation of a date to attempt to parse using the format
	 */
    public static void main( String[] args )
    {
    	if (!App.validateArgs(args)) {
    		System.exit(2);
    	}
    	
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(args[0]); 
    	
    	try {
    		DateTime time = fmt.parseDateTime(args[1]);
            System.out.println(time.toString());
    	} catch (IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    		System.exit(1);
    	}
    }
    
    /**
     * Validates that there were exactly 2 arguments given to the program and prints error 
     * messages if that is not the case
     * @param args An array of program arguments to validate
     * @return Whether the argument list is valid
     */
    public static Boolean validateArgs(String[] args) {
    	String usage = "Usage: joda-tester \"yyyyMMdd\" \"201505028\"";
    	if (args.length < 1) {
    		System.err.println("You have not specified a Format. " + usage);
    	} else if (args.length < 2) {
    		System.err.println("You have not specified a date to parse. " + usage);
    	} else if (args.length > 2) {
    		System.err.println("Too many arguments, wrap your args in quotes " + usage);
    	} else {
    		return true;
    	}
    	return false;
    }
}
