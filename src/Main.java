import com.nrdc.*;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by localadmin on 7/27/16.
 */

public class Main {
    public static void main( String[] args) {
        System.out.println("In Main");
        House h = new House();
        Room r1 = new Room( "Kitchen", Floor.Tile,(float) 3.25, Paint.Gloss, (float) 0.51, 12, 13, 10);
        Room r2 = new Room( "Bedroom1", Floor.Tile,(float) 3.25, Paint.Gloss, (float) 0.51, 12, 13, 10);
        Room r3 = new Room( "Bedroom2", Floor.Tile,(float) 3.25, Paint.Gloss, (float) 0.51, 12, 13, 10);
        Room r4 = new Room( "Loft", Floor.Tile,(float) 3.25, Paint.Gloss, (float) 0.51, 12, 13, 10);
        h.addRoom(r1);
        h.addRoom(r2);
        h.addRoom(r3);
        h.addRoom(r4);
        h.addRoom(r3);
        System.out.println("Floor cost of room is " + r1.floorCost());
        System.out.println("Paint cost of room is " + r1.paintCost());
        System.out.println("House is " + h.totalCost());

    };
}
