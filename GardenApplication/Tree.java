package GardenApplication;

public class Tree extends Plant {

    public Tree() {
    }

    public Tree(String color) {
        super(color);
    }

    @Override
    public void watering(int amount) {
        this.waterStatus += (amount * 0.4);
    }

    @Override
    public boolean needsWater() {
        if (this.waterStatus < 10){
            return true;
        }
        return false;
    }

    @Override
    public void needPrinter() {
        if (this.needsWater()){
            System.out.println("The " + this.color + " tree needs water.");
        } else {System.out.println("The " + this.color + " tree does not need water.");}
    }
}