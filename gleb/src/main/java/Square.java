/**
 * Created by Gleb on 21.09.2016.
 */
public class Square extends Figures {
    int s = 0;
    public Square(int a, int b) {
        super(a, b);
        s = a * b;
    }
    public void area () {System.out.println(s + " Square");}
}
