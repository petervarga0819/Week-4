package GardenApplication;

public class Plant {

    int waterStatus;
    String color;

    public Plant(){
        this.waterStatus = 0;
    }

    public Plant(String color) {
        this.waterStatus = 0;
        this.color = color;
    }

    public boolean needsWater(){
        return false;
    }

    public void watering(int i) {

    }

    public void needPrinter(){

    }


}