import processing.core.PApplet;

public class CircleProcessing extends PApplet {

    public static int x = 0;
    public static int y = 0;
    public static int z = 0;
    public static int j = 0;

    public static final int WIDTH = 700;
    public static final int HEIGHT = 700;

    public static void main(String[] args){ PApplet.main("CircleProcessing",args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int i=1;i<=4;i++){
            circle(x*i,HEIGHT*i/5);
        }
        x+=1;

    }

    private void circle(int speed, int pos) {
        ellipse(speed, pos,10,10);
    }
}
