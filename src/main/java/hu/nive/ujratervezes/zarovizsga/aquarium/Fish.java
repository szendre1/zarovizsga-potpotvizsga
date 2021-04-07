package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish  {
    private String name;
    private int weight;
    private String color;
    private boolean shortTermMemory=false;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isShortTermMemory() {
        return shortTermMemory;
    }

    public void setShortTermMemory(boolean shortTermMemory) {
        this.shortTermMemory = shortTermMemory;
    }

    public String status(){
        return getName()+", weight: "+getWeight()+", color: "+getColor()+", short term memory loss: "+isShortTermMemory();
    }

    public void feed(){

    }

    public boolean hasMemoryLoss(){
        return isShortTermMemory();
    }

}
