import java.awt.*;

public class Grid {
    protected int x, y, size;
    protected Color color;

    public Grid() {
        x = Field.WIDTH;
        y = Field.HEIGHT;
        size = 10;
        color = Color.black;
    }

    /*public void draw(Graphics c) {
        c.translate(x/2, y / 2);
        c.drawLine(-x/2, 0, x/2,0);
        c.drawLine(0,y/2,0,-y/2);
    }

     */
}
