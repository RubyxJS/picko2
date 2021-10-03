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
                g.setColor(Color.getHSBColor((float) i/Picker.GAMES.length , 1, 1));
            g.fillArc(100, 100, 800, 800, 0 + (i * 360 / Picker.GAMES.length), 360 / Picker.GAMES.length);
        }
    }
}