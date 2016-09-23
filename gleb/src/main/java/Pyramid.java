/**
 * Created by Gleb on 22.09.2016.
 */
public class Pyramid extends Figure {
    Pyramid (int a, int b, int h){
        super(a, b, h);
    }
    public double area (){
        return a * h / 2;
    }
}
