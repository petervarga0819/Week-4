package GardenApplication;

import java.util.ArrayList;
import java.util.List;


public class Garden {

    static List<Plant> listOfPlants = plantInitiaizer();

    public static void main(String[] args) {


        plantInitiaizer();
        doesNeedExists();
        gardenWatering(40);
        gardenWatering(70);

    }

    private static void gardenWatering(int amount) {
        System.out.println();
        System.out.println("Watering with " + amount + ".");
        int size = listOfPlants.size();

        amount /= sizeOptimalizer(size);
        for (Plant p : listOfPlants) {
            if (p.needsWater()) {
                p.watering(amount);
                p.needPrinter();
            } else {
                p.needPrinter();
            }

        }

    }

    private static int sizeOptimalizer(int size) {
        for (Plant p : listOfPlants) {
            if (!p.needsWater()) {
                size--;
            }
        }
        return size;
    }

    private static List<Plant> plantInitiaizer() {
        List<Plant> listOfPlants = new ArrayList<>();

        listOfPlants.add(new Flower("yellow"));
        listOfPlants.add(new Flower("blue"));
        listOfPlants.add(new Tree("purple"));
        listOfPlants.add(new Tree("orange"));

        return listOfPlants;
    }

    public static void doesNeedExists (){
        for (Plant p : listOfPlants) {
            p.needPrinter();
        }


    }
}
