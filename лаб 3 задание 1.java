public class lab3 {
    public static void main(String args[]){
        Flower f1 = new Rose();
        System.out.println("Стоимость одной розы: " + f1.getPrice());
        Flower f2 = new Romashka();
        System.out.println("Стоимость одной ромашки: " + f2.getPrice());
        Flower f3 = new Gerbera();
        System.out.println("Стоимость одной герберы: " + f3.getPrice());
        Flower f4 = new Tulp();
        System.out.println("Стоимость одного тьльпана: " + f4.getPrice());
        Flower f5 = new Astra();
        System.out.println("Стоимость одной астры: " + f5.getPrice());

        Flower[] buket1 = {new Rose(), new Rose(), new Rose(), new Rose(), new Rose()};
        Flower[] buket2 = {new Gerbera(), new Gerbera(), new Gerbera(), new Romashka(), new Romashka()};
        Flower[] buket3 = {new Astra(), new Astra(), new Astra(), new Tulp(), new Tulp()};

        System.out.println("Стоимость первого букета: " + Flower.getBuketPrice(buket1));
        System.out.println("Стоимость второго букета: " + Flower.getBuketPrice(buket2));
        System.out.println("Стоимость третьего букета: " + Flower.getBuketPrice(buket3));

        Flower[][] bukets = {buket1, buket2, buket3};
        System.out.println("Количество цветов во всех букетах: " + Flower.getFlowerCount(bukets));
    }
}
public abstract class Flower {
    int price;
    public int getPrice(){
        return price;
    }
    public static int getBuketPrice(Flower[] buket){
        int sum = 0;
        for(Flower f:buket){
            sum += f.getPrice();
        }
        return sum;
    }
    public static int getFlowerCount(Flower[][] bukets){
        int count = 0;
        for (Flower[] bs:bukets)
            for(Flower b:bs) {
                count++;
            }
            return count;
    }
}
public class Rose extends Flower{
    @Override
    public int getPrice(){
        price = 150;
        return price;
    }
}
public class Romashka extends Flower{
    @Override
    public int getPrice(){
        price = 70;
        return price;
    }
}
public class Gerbera extends Flower{
    @Override
    public int getPrice(){
        price = 100;
        return price;
    }
}
public class Tulp extends Flower{
    @Override
    public int getPrice(){
        price = 60;
        return price;
    }
}
public class Astra extends Flower{
    @Override
    public int getPrice(){
        price = 90;
        return price;
    }
}

