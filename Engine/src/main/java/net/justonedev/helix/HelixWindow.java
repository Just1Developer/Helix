package net.justonedev.helix;

import javax.swing.*;
import java.awt.*;

/**
 * The class to create and access the main window in any Helix application.
 * @author JustOneDeveloper
 */
public class HelixWindow {

    private static final boolean WINDOW_BORDERLESS_DEFAULT = false;

    private static JFrame Window;

    /**
     * Creates the window for the application.
     * See {@link HelixWindow#getWindow() getWindow()} for the window.
     * <br/><br/>
     * If a Window already exists, the old one will be destroyed. There can only be one.
     * @param width The width.
     * @param height The height.
     * @param title The window title.
     */
    protected static void createWindow(final int width, final int height, final String title) {
        JFrame window = createJFrame(width, height);
        window.setTitle(title);
        setWindow(window);
    }

    /**
     * Creates a new default JFrame with some properties set to standards.
     * @param width The width.
     * @param height The height.
     * @return The created JFrame object.
     */
    protected static JFrame createJFrame(final int width, final int height) {
        JFrame Frame = new JFrame();
        Frame.setBackground(Color.BLACK);
        Frame.setSize(width, height);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setLocationRelativeTo(null);
        Frame.setLayout(null);
        Frame.setUndecorated(WINDOW_BORDERLESS_DEFAULT);
        Frame.setResizable(false);
        Frame.requestFocus();
        Frame.setVisible(true);
        return Frame;
    }

    /**
     * Sets the current window to the provided JFrame. If the current window is not
     * null, the old window will be closed and discarded.
     */
    protected static void setWindow(final JFrame window) {
        if (Window != null) {
            Window.dispose();
        }
        Window = window;
    }

    /**
     * Gets the current JFrame window.
     * @return The current window.
     */
    protected static JFrame getWindow() {
        return Window;
    }

    /**
     * Please note that this currently does not work.
     * @param borderless If the window should be borderless.
     */
    @Deprecated
    protected static void setWindowBorderless(final boolean borderless) {
        if (Window == null) return;
        try {
            Window.setUndecorated(borderless);
        } catch (IllegalComponentStateException ignored) {}
    }

}
