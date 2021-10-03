import java.awt.*;
// class to construct a frame and containing main method    
class MyCanvas {
    // class constructor
    public MyCanvas(int frameWidth, int frameHeight) {

        // creating a frame
        Frame f = new Frame("Picko");
        // adding canvas to frame
        f.add(new Wheel());

        // setting layout, size and visibility of frame
        f.setLayout(null);
        f.setSize(frameWidth, frameHeight);
        f.setVisible(true);
    }
}