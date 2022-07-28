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
        circle(x,HEIGHT*1/5);
        circle(y,HEIGHT*2/5);
        circle(z,HEIGHT*3/5);
        circle(j, HEIGHT*4/5);
        x+=1;
        y+=2;
        z+=3;
        j+=4;
    }

    private void circle(int inc, int pos) {
        ellipse(inc, pos,10,10);
    }
}
