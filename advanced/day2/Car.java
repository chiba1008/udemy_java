package advanced.day2;

public class Car {
    private int fuel = 0;
    private int migration = 0;

    public Car() {
        System.out.println("Carオブジェクト生成");
    }

    public void move() {
        if (fuel > 0) {
            migration++;
            fuel--;
        }
        System.out.println("移動距離: " + migration);
        System.out.println("燃料: " + fuel);
    }

    public void supply(int fuel) {
        if (fuel > 0) {
            this.fuel += fuel;
        }
        System.out.println("燃料: " + fuel);
    }

}
