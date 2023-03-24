import javax.swing.*;
import java.awt.*;

public class Field extends JFrame{

    public Field(){
        this.setSize(Config.WIDTH, Config.HEIGHT);
        this.setTitle("GameOfLife");
        this.setLocation(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



    /*public void paint(Graphics g){ // сетка
        for (int i = 0; i <= WIDTH; i+=10) {
            for (int j = 0; j <= HEIGHT; j += 10) {
                g.drawRect(i, j, 10 ,10);
            }
        }
    }

     */ // сетка
}
