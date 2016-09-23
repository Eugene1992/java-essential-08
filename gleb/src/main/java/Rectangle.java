/**
 * Created by Gleb on 21.09.2016.
 */
public class Rectangle extends Figure {

    Rectangle(int a, int b, int h)
    {
        super(a, b, h);
    }

    public double area() {
        return a * b;
    }
}
