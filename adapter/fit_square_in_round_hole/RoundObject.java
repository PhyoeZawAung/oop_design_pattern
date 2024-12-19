package adapter.fit_square_in_round_hole;

public class RoundObject implements Round {
    private final float radius;

    public RoundObject(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
}
