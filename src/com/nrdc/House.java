package com.nrdc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by localadmin on 7/27/16.
 */
public class House {
    public ArrayList<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room r ){
        Stream<Room> dupr = rooms.stream().filter(q -> q.getName().equals(r.getName()));
        if (dupr.count() == 0) {
            rooms.add(r);
        }
    }

    public float floorCost(){
        return rooms.stream().map(q -> q.floorCost()).reduce(0f,(a,s) -> a+s);
    }

    public float paintCost(){
        return rooms.stream().map(q -> q.paintCost()).reduce(0f,(a,s) -> a+s);
    }

    public float totalCost() {
        return floorCost() + paintCost();
    }
}
