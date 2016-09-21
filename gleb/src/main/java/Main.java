/**
 * Created by Gleb on 21.09.2016.
 */
public class Main {
    public static void main (String [] args){
        Figures Figures = new Figures (5, 10);
        Figures Square = new Square(5, 10);
        area (Figures, Square);
    }
    static void area (Figures... figures){
        for ( Figures Figures : figures) {
            Figures.area();
        }
    }
}
