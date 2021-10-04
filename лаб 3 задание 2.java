public class lab3 {
    public static void main(String args[]){
        Engine toyotaEngine = new Engine("Toyota", 90);
        Car car1 = new Lorry("Toyota", 2000, toyotaEngine, 5000);
        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        car1.printInfo();
        Engine audiEngine = new Engine("Audi", 120);
        Car car2 = new SportCar("Audi", 800, audiEngine, 1000);
        car2.start();
        car2.turnLeft();
        car2.turnRight();
        car2.stop();
        car2.printInfo();
    }
}
public abstract class Car {
    String mark, kind;
    int weight;
    Engine engine;
    public void start(){
        System.out.println(kind + " поехал");
    }
    public void stop(){
        System.out.println(kind + " остановился");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void printInfo(){
        System.out.println("Марка автомобиля: " + mark + "\nКласс автомобиля: " + kind + "\nВес автомобиля: " + weight + "\nМощность двигателя: " + engine.power
                + "\nПроизводитель двигателя: " + engine.manufacturer);
    }
}
public abstract class Engine {
    String manufacturer;
    int power;
    public Engine(String manufacturer, int power){
        this.power = power;
        this.manufacturer = manufacturer;
    }
}
public class Lorry extends Car{
    int maxCapacity;
    public Lorry(String mark, int weight, Engine engine, int maxCapacity){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Грузовик";
        this.maxCapacity=maxCapacity;
    }
    public void start(){
        System.out.println(kind + " поехал");
    }
    public void stop(){
        System.out.println(kind + " остановился");
    }
    public void printInfo(){
        System.out.println("Марка автомобиля: " + mark + "\nКласс автомобиля: " + kind + "\nВес автомобиля: " + weight + "\nМощность двигателя: " + engine.power
                + "\nПроизводитель двигателя: " + engine.manufacturer + "\nМаксимальная грузоподъемность: " + maxCapacity);
    }
}
public class SportCar extends Car{
    int maxSpeed;
    public SportCar(String mark, int weight, Engine engine, int maxSpeed){
        this.mark=mark;
        this.weight=weight;
        this.engine=engine;
        this.kind="Sport Car";
        this.maxSpeed=maxSpeed;
    }
    public void start(){
        System.out.println(kind + " поехал");
    }
    public void stop(){
        System.out.println(kind + " остановился");
    }
    public void printInfo(){
        System.out.println("Марка автомобиля: " + mark + "\nКласс автомобиля: " + kind + "\nВес автомобиля: " + weight + "\nМощность двигателя: " + engine.power
                + "\nПроизводитель двигателя: " + engine.manufacturer + "\nМаксимальная скорость: " + maxSpeed);
    }
}



