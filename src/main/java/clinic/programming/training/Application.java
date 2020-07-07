package clinic.programming.training;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords (String words)  {
		
		String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    } 		
    
    public Application() {
        System.out.println ("Inside Application");
		System.out.println ("Inside Application - extra line added");
    }

    // method main(): ALWAYS the APPLICATION entry point
	
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		System.out.println ("Starting Application - extra line added");
	    Application app = new Application();
		
		int count = app.countWords(" I have four words");
		System.out.println("Word Count :" +count);
         }
     }