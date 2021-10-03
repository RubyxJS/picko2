import java.awt.*;
    // class which inherits the Canvas class
    // to create Canvas
    class Wheel extends Canvas {
        // class constructor
        public Wheel() {
            setBackground(Color.GRAY);
            setSize(1000, 1000);
        }
        public void paint(Graphics g){
            g.setColor(Color.WHITE);
            g.fillOval(100, 100, 800, 800);
        }
    }