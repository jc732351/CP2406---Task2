//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Graphics;

public class Sedan extends Car {
    Sedan(Road road) {
        super(road);
        this.width = 30;
        this.height = 12;
    }

    public void paintMeHorizontal(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(this.xPos, this.yPos, this.width, this.height);
    }

    public void paintMeVertical(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(this.yPos, this.xPos, this.height, this.width);
    }
}
