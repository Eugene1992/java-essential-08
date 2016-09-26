/**
 * Created by Gleb on 23.09.2016.
 */
//Подсчитать одинаковые числа в одномерном массиве
public class Equal {
    static public void main(String[] args) {
        int[] arr = {3, 0, 5, 5, 7, 5, 7, 3, 5};
        int sum = 0;
        int equal = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    equal++;
                }
            }
            equal -= 1;
            if (equal > 0) {
                equal -= equal - 1;
                sum += equal;
                equal = 0;
            }
        }
        System.out.println(sum);
    }

}
