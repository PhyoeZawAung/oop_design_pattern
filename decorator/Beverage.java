package decorator;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    String description = "there is no description";

    public String getDescription(){
        return this.description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract float cost();
}
