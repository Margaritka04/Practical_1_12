import java.io.*;

public class Car {
    public int year;
    public String model;
    public int run;
    public String color;
    public int maxSpeed;

    public Car (int year, String model, int run, String color, int maxSpeed){
        this.year = year;
        this.model = model;
        this.run = run;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car () {}

    public void  writeExternal (ObjectOutput out) throws IOException {
        out.writeObject(this.getYear());
        out.writeObject(this.getModel());
        out.writeObject(this.getRun());
        out.writeObject(this.getColor());
        out.writeObject(this.getMaxSpeed());
    }
}
