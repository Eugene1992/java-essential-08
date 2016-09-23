/**
 * Created by Gleb on 22.09.2016.
 */
public class Circle extends Figure {
    Circle (int a, int b, int h){
        super(a, b, h);
    }
      public double area (){
          int r = h;
          double pi = 3.14;
          return (r * r * pi) / r;
      }
}
