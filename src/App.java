import cells.Pin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by neil on 03.02.16.
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("connect.csv");
        List<Pin> pinList = new ArrayList<Pin>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lines = line.split(";"); // x, y, id, type
            pinList.add(new Pin(lines[2],lines[3], lines[0], lines[1]));
        }
    }
}
