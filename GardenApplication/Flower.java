package GardenApplication;

public class Flower extends Plant {

    public Flower() {
    }

    public Flower(String color) {
        super(color);
    }

    @Override
    public void watering(int amount) {
        this.waterStatus += (amount * 0.75);
    }

    @Override
    public boolean needsWater() {
        if (this.waterStatus < 5){
            return true;
        }
        return false;
    }

    @Override
    public void needPrinter() {

        if (this.needsWater()){
            System.out.println("The " + this.color + " flower needs water.");
        } else {System.out.println("The " + this.color + " flower does not need water.");}
    }
}