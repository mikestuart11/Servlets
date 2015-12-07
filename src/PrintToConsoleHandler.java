import java.util.HashMap;

/**
 * Created by Mike on 12/4/2015.
 */
public class PrintToConsoleHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        System.out.println(" This is the information: " + dataMap);
    }
}
