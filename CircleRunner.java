

import java.awt.*;

public class CircleRunner {
    public static void main(String[] args) {
        CircleAnimations app = new CircleAnimations(600); //supply window size, will be 600x600

        //test your methods below (with the app object)

        //app.addCircles();
        //app.addCircles(2);
        app.noOverlapping(10);

        //testCircleOverlap(); //uncomment to test your overlap method, when required
        app.movingCircles();


       
    }

    public static void testCircleOverlap() { //uncomment contents to use
        /*
         * The distance between a and b is ~2.83, which is greater than the combined radius of 2 (a and b do NOT overlap)
         *
         * The distance between a and c is ~2.83, which is lessthan the combined radius of 6 (a and c overlap)
         */
        Circle a = new Circle(1, 1, 1, null); //color is irrelevant for this
        Circle b = new Circle(3, 3, 1, null);
        Circle c = new Circle(3, 3, 5, null);

        System.out.println(a.overlaps(b)); //should print false
        System.out.println(a.overlaps(c)); //should print true

    }
}