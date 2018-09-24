import java.util.*;
import java.awt.*;

/*

    Corey Carter
    09-23-18
    CSCI-1933
    Project One: Object-oriented geometry and fractals
    Triangle Class: Holds Triangle object data

*/

public class Triangle{

    // private variables for Triangle class
    private double thisX = 0;
    private double thisY = 0;
    private double thisWidth = 0;
    private double thisHeight = 0;
    private Color thisColor = null;

    public Triangle(double x, double y, double width, double height){
        //Default constructor for Triangle class
        this.thisX = x;
        this.thisY = y;
        this.thisWidth = width;
        this.thisHeight = height;
    }

    public double calculatePerimeter(){
        // calculates shapes perimeter
        double halfWidth = this.thisWidth / 2;
        double sideA = (Math.pow(halfWidth, 2) + Math.pow(this.thisHeight, 2));
        sideA = Math.sqrt(sideA);
        return((2 * sideA) + this.thisWidth);
    }

    public double calculateArea(){
        // calculates shapes area
        return((this.thisHeight * this.thisWidth) / 2);
    }

    // Setter Methods

    public void setColor(Color newColor){
        // Sets shapes color
        this.thisColor = newColor;
    }

    public void setPos(double x, double y){
        // Sets 'X' and 'Y' positions
        this.thisX = x;
        this.thisY = y;
    }

    public void setHeight(double height){
        // Setter for shapes height
        this.thisHeight = height;
    }

    public void setWidth(double width){
        // Setter for shapes width
        this.thisWidth = width;
    }

    // Getter Methods

    public Color getColor(){
        // Getter method for shape Color
        return(this.thisColor);
    }

    public double getXPos(){
        // Getter for shapes 'X' position
        return(this.thisX);
    }

    public double getYPos(){
        // Getter for shapes 'Y' position
        return(this.thisY);
    }

    public double getHeight(){
        // Getter for shapes height
        return(this.thisHeight);
    }

    public double getWidth(){
        // Getter for shapes width
        return(this.thisWidth);
    }


}