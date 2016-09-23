/**
 * Created by Gleb on 21.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(5, 10, 5);
        Figure square = new Square(3, 10, 5);
        Figure circle = new Circle(6, 5,15);
        Figure rhombus = new Rhombus(10, 10, 5);
        Figure pyramid = new Pyramid(5, 15, 10);

        area(rectangle, square, circle, rhombus, pyramid);
    }

    static void area(Figure... figures) {
        for (Figure Figures : figures) {
            Figures.area();
            System.out.println(Figures.area());
        }
    }
}
