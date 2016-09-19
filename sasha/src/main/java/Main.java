import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Sasha on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] age = {7,6,11};
        int[] weight = {9,13,4};
        double[] height = {45.0,55.0,36.0};
        String[] color = {"black","white","brown"};
        Pet petOne = new Pet();
        petOne.age = 15;
        petOne.weight = 9;
        petOne.height = 45.0;
        petOne.color = "black";

        Pet petTwo = new Pet();
        petTwo.age = 12;
        petTwo.weight = 13;
        petTwo.height = 55.0;
        petTwo.color = "white";

        Pet petTree = new Pet();
        petTree.age = 11;
        petTree.weight = 4;
        petTree.height = 36.0;
        petTree.color = "brown";

        Pet[] pets = {petOne, petTwo, petTree};
        Pet oldestPets = getOldestPet(pets);
        System.out.println(oldestPets.age);

    }
    static Pet getOldestPet(Pet[] pets){
        Pet result = pets[0];
        for (Pet pet : pets){
            if (result.age < pet.age){
                result = pet;
            }
        }
        return result;
    }
}
