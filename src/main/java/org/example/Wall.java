package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double cWidth) {
        if (cWidth < 0) {
            this.width = 0;
        } else {
            this.width = cWidth;
        }
    }
    public void setHeight(double cHeight) {
        if (cHeight < 0) {
            this.height = 0;
        } else {
            this.height = cHeight;
        }
    }
    public double getArea() {
        return this.width * this.height;
    }
}
