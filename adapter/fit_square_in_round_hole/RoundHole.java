package adapter.fit_square_in_round_hole;

public class RoundHole {
    private float radius;

    public RoundHole(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }


    public boolean fit(Round object) {
        boolean fit = this.radius > object.getRadius();

        return fit;
    }
}
