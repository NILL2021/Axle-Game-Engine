
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Sprite extends Object {
    JFrame ParentWindow = null;

    public ImageIcon create(String name, int x, int y, String image, int width, int height, JFrame ParentWindow) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.ParentWindow = ParentWindow;
        this.name = name;
        ImageIcon img = new ImageIcon(image);
        return img;
    }

}