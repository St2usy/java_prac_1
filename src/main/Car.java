package main;

public class Car {
    private String model;
    private int kMs = 70000;

    public Car(String model) {
        this.model = model;
    }

    public int getkMs() { return kMs;}

    public boolean equals(Object obj) { // String의 equals() 메서드 사용
        if(obj instanceof Car) return this.model.equals(((Car)obj).model);
        else return false;
    }
}
