import static logger.Logger.log;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        log(CircleUtils.PI);
        log(CircleUtils.circleLength(5));
        log(CircleUtils.circleArea(5));
        log(CircleUtils.squareEquivalent(1));
        log(Math.sqrt(CircleUtils.PI));
    }
}
