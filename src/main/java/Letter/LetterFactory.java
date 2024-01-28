package Letter;

import Interface.Transform;
import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letter = new BaseShape();

        Rectangle r1 = new Rectangle(20.0,110.0);
        r1.rotate(r1.getCoords(),Math.toRadians(160));

        Rectangle r2 = new Rectangle(20.0,110.0);
        r2.rotate(r2.getCoords(),Math.toRadians(-160));


        letter.add(r1);
        letter.add(r2);

        return letter;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letter = new BaseShape();

        Rectangle r1 = new Rectangle(20.0,150.0);
        r1.translate(r1.getCoords(),new Point2d(-30.0,0.0));

        Circle el1 = new Circle(60.0);
        el1.translate(el1.getCoords(),new Point2d(0.0,-45.0));

        Ellipse el2 = new Ellipse(80.0,95.0);
        el2.translate(el2.getCoords(), new Point2d(0.0,25.0));

        Circle antiEl1 = new Circle(45.0);
        antiEl1.translate(antiEl1.getCoords(),new Point2d(0.0,-45.0));

        Ellipse antiEl2 = new Ellipse(50.0,80.0);
        antiEl2.translate(antiEl2.getCoords(),new Point2d(-1.0,25.0));

        letter.add(el1);
        letter.add(el2);

        letter.remove(antiEl1);
        letter.remove(antiEl2);

        letter.add(r1);
        return letter;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letter = new BaseShape();

        Ellipse el1 = new Ellipse(80.0,150.0);

        Ellipse el2 = new Ellipse(60.0,130.0);

        Rectangle r1 = new Rectangle(30.0,80.0);
        r1.translate(r1.getCoords(),new Point2d(40.0,0.0));

        letter.add(el1);

        letter.remove(el2);
        letter.remove(r1);

        return letter;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letter = new BaseShape();

        Rectangle r1 = new Rectangle(80.0,150.0);

        Rectangle AntiR1Top = new Rectangle(80.0,50.0);
        AntiR1Top.translate(AntiR1Top.getCoords(),new Point2d(20.0,-34.0));

        Rectangle AntiR1Bot = new Rectangle(80.0,50.0);
        AntiR1Bot.translate(AntiR1Bot.getCoords(),new Point2d(20.0,34.0));

        letter.add(r1);

        letter.remove(AntiR1Top);
        letter.remove(AntiR1Bot);

        return letter;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letter = new BaseShape();

        Rectangle r1 = new Rectangle(80.0,150.0);

        Rectangle AntiR1Top = new Rectangle(40.0,85.0);
        AntiR1Top.translate(AntiR1Top.getCoords(),new Point2d(0.0,-60.0));

        Rectangle AntiR1Bot = new Rectangle(40.0,85.0);
        AntiR1Bot.translate(AntiR1Bot.getCoords(),new Point2d(0.0,60.0));

        letter.add(r1);

        letter.remove(AntiR1Top);
        letter.remove(AntiR1Bot);


        return letter;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letter = new BaseShape();

        Rectangle r1 = new Rectangle(20.0,100.0);
        r1.rotate(r1.getCoords(),Math.toRadians(160));
        //r1.translate(r1.getCoords(), new Point2d(0.0,.0));

        Rectangle r2 = new Rectangle(20.0, 150.0);
        r2.translate(r2.getCoords(),new Point2d(52.0,0.0));

        Rectangle r3 = new Rectangle(20.0, 150.0);
        r3.translate(r3.getCoords(),new Point2d(-50.0,0.0));

        letter.add(r2);
        letter.add(r3);
        letter.add(r1);
        return letter;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse el1 = new Ellipse(80.0,150.0);
        Ellipse el2 = new Ellipse(60.0,130.0);
        el1.remove(el2);

        return el1;
    }

}
