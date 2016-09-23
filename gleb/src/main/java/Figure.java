/**
 * Created by Gleb on 21.09.2016.
 */
public abstract class Figure {
    /*private int pyramid;
    private int parallelogram;
    private int trapeze;*/
    protected int a;
    protected int b;
    protected int h;

    public Figure(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public abstract double area();
}
