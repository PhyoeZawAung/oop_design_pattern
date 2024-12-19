package adapter.fit_square_in_round_hole;

public class SquareToRoundAdapter implements Round {

    private final SquareObject square;

    public SquareToRoundAdapter(SquareObject object){
        this.square = object;
    }

    public float getRadius(){
        return (float) (Math.sqrt((Math.pow(this.square.getWidth(), 2)) + Math.pow(this.square.getWidth(),2)) / 2);
    }

    public float getRadius1() {
        return (float) Math.sqrt(Math.pow((this.square.getWidth() / 2), 2) * 2);
    }
}
