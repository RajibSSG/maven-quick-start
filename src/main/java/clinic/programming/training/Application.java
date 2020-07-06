package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
		System.out.println ("Inside Application - extra line added");
    }

    // method main(): ALWAYS the APPLICATION entry point
	
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		System.out.println ("Starting Application - extra line added");
	    Application app = new Application();
         }
     }