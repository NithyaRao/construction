package com.nrdc;

/**
 * Created by localadmin on 7/27/16.
 */
public class Room implements Cost {
    private String name;
    private Paint paint;
    private Floor floor;
    private float floorCostPerSqft;
    private float paintCostPerSqft;
    private int length;
    private int width;
    private int height;

    public Room(String name, Floor floor, float floorCostPerSqft, Paint paint, float paintCostPerSqft, int length, int width, int height) {
        this.name = name;
        this.paint = paint;
        this.floor = floor;
        this.floorCostPerSqft = floorCostPerSqft;
        this.paintCostPerSqft = paintCostPerSqft;
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public float getFloorCostPerSqft() {
        return floorCostPerSqft;
    }

    public void setFloorCostPerSqft(float floorCostPerSqft) {
        this.floorCostPerSqft = floorCostPerSqft;
    }

    public float getPaintCostPerSqft() {
        return paintCostPerSqft;
    }

    public void setPaintCostPerSqft(float paintCostPerSqft) {
        this.paintCostPerSqft = paintCostPerSqft;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public float floorCost() {
        float cost = (this.length * this.width) * this.floorCostPerSqft;
        return cost;
    }

    @Override
    public float paintCost() {
        float cost = (( this.height * this.length *2 ) + (this.width * this.length * 2 ) + (this.width * this.length)) * this.paintCostPerSqft ;
        return cost;
    }
}
