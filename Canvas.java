import java.awt.*;

// class to construct a frame and containing main method    
class Wheel {
    // class constructor
    public Wheel(int frameWidth, int frameHeight) {

        // creating a frame
        Frame f = new Frame("Picko");
        // adding canvas to frame
        f.add(new MyCanvas());

        // setting layout, size and visibility of frame
        f.setLayout(null);
        f.setSize(frameWidth, frameHeight);
        f.setVisible(true);
    }
    // class which inherits the Canvas class
// to create Canvas


    // main method
    public static void main(String[] args) {
        int frameWidth = 1000;
        int frameHeight = 1000;
        new Wheel(frameWidth, frameHeight);
    }
}


