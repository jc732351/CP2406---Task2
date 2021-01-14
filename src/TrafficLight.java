//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class TrafficLight {
    private double rateOfChange = 0.7D;
    private String currentColor = "green";
    private int redTime = 0;
    private int greenTime = 0;

    public TrafficLight() {
    }

    public String getCurrentColor() {
        return this.currentColor;
    }

    public void operate() {
        if (this.currentColor.equals("red")) {
            this.rateOfChange = 1.0D;
            ++this.redTime;
        } else {
            this.rateOfChange = 0.0D;
            ++this.greenTime;
        }

        if (this.redTime == 10 || this.greenTime == 6) {
            this.redTime = 0;
            this.greenTime = 0;
            this.rateOfChange = 0.3D;
        }

        double num = Math.random();
        if (num < this.rateOfChange) {
            this.currentColor = "red";
        } else {
            this.currentColor = "green";
        }

    }
}
