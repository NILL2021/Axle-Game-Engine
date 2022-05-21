// import the packages needed to make a GUI
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Position;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.util.Vector;

import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        // create a window
        JFrame window = new JFrame();
        // set the window size
        window.setSize(300, 300);

        window.setLocation(100, 100);

        window.setTitle("Axle Game Engine - GameWindow");

        window.setVisible(true);

        // create a sprite using the NewSprite function
        Sprite sprite = new Sprite();
        ImageIcon img = sprite.create("MySprite", 0, 0, "hi.png", 50, 50, window);
        

        JLabel label = new JLabel(img);
        window.add(label);

    }
    
}

