package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        double maxX = widthDiameter/2;
        for (double x = -maxX; x < maxX; x+=0.5) {

            double maxY = Math.sqrt(Math.pow(heightDiameter/2,2)* (1 - (Math.pow(x,2)/Math.pow(widthDiameter/2, 2))));

            for (double y = -maxY;y < maxY; y+=0.5) {
                this.add(new Point2d(x,y));
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return (Ellipse) super.clone();
    }
}
