package net.justonedev.helix;

/**
 * The main entry point class of the engine. Called by any application including the engine,
 * usually in the main method.
 * @author JustOneDeveloper
 */
public class Engine {

    /**
     * The main entry point of the engine. Not to be confused with the regular
     * main method that should be present in the games, not the engine itself.<br/>
     * This method should be called from the main function of the games at start.
     * @param args The command line arguments from the applications main method.
     */
    public static void launch(String[] args) {
        System.out.println("Engine Running!");
    }
}