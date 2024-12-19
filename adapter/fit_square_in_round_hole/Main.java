package adapter.fit_square_in_round_hole;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(100.0f);

        RoundObject ball = new RoundObject(50f);

        SquareObject square = new SquareObject(10);

        System.out.println(square.getWidth());

        SquareToRoundAdapter adapter = new SquareToRoundAdapter(square);

        System.out.println(adapter.getRadius());

        System.out.println(adapter.getRadius1());

        boolean fit = hole.fit(ball);

        if(fit) {
            System.out.println("The ball is fit in the hole");
        } else {
            System.out.println("The ball doesn't fit in the hole");
        }

        boolean fitSquare = hole.fit(adapter);

        if(fitSquare) {
            System.out.println("The square is fit in the hole");
        }else {
            System.out.println("The square doesn't fit in the hole");
        }

    }
}
