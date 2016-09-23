/**
 * Created by Gleb on 22.09.2016.
 */
public class Square extends Figure {


    Square(int a, int b, int h) {
        super(a, b, h);
    }

    @Override
    public double area() {
        return a * a;
    }
}
