import java.util.logging.Level;
import logger.Log;
import task.Application;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        System.out.println("Hello world!!!");
        Application app = new Application();
        app.run();
    }
}