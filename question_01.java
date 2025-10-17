import java.lang.Math;
import java.util.Scanner;
class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {  
        this.height = h;
    }

    //Method to calculate Volume
    public double getVolume() {
        double volume= Math.PI * radius * radius * height; // V = πr²h
        return Math.round(volume*100.0)/100.0; // rounding to 2 decimal places

    }

    //Method to calculate Surface Area
    public double getSurfaceArea() {
        double area=   2 * Math.PI * radius * (radius + height); // A = 2πr(r + h)
        return Math.round(area*100.0)/100.0; //r rounding to 2 decimal places
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Cylinder c1 = new Cylinder();
       System.out.println("Enter radius and height of the cylinder:");
        int r= sc.nextInt();
        c1.setRadius(r);
        System.out.println("Enter height of the cylinder:");
        int h= sc.nextInt(); 
        c1.setHeight(h);

        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println("Surface Area: " + c1.getSurfaceArea());
    }
}
