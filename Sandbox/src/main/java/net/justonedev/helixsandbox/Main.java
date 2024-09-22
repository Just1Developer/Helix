package net.justonedev.helixsandbox;

import net.justonedev.helix.Engine;
import net.justonedev.helix.HelixWindow;

public class Main extends HelixWindow {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws InterruptedException {
        Engine.launch(args);
        createWindow(800, 600, "Test Application");

        Thread.sleep(3000);

        createWindow(1000, 500, "Test Application 2");
        setWindowBorderless(true);

        System.out.println("Hello world!");
    }
}