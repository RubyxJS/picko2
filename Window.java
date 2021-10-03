import java.awt.*;
import java.awt.event.*;

// class to construct a frame and containing main method    
class Window {
    static final int WIDTH = 1000;
    static final int HEIGHT = 1000;

    // class constructor
    public Window() {

        // creating a frame
        Frame f = new Frame("Picko");
        // adding canvas to frame
        f.add(new Wheel());

        // setting layout, size and visibility of frame
        f.setLayout(null);
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
    }
}