import logger.Logger;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        log.info(CircleUtils.PI);
        log.info(CircleUtils.circleLength(5));
        log.info(CircleUtils.circleArea(5));
        log.info(CircleUtils.squareEquivalent(1));
        log.info(Math.sqrt(CircleUtils.PI));
    }
}
