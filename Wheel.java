import java.awt.*;

// class which inherits the Canvas class
// to create Canvas
class Wheel extends Canvas {
    // class constructor
    public Wheel() {
        setBackground(Color.GRAY);
        setSize(Window.WIDTH, Window.HEIGHT);
    }

    public void paint(Graphics g) {
        // draws arc for each option in array GAMES
        for (int i = 0; i < Picker.GAMES.length; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.BLUE);
            } else if (i % 2 > 0) {
                g.setColor(Color.RED);
            }
            g.fillArc(100, 100, 800, 800, 0 + (i * 360 / Picker.GAMES.length), 360 / Picker.GAMES.length);
        }
    }
}