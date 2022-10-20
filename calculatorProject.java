import java.util.Scanner;

public class calculatorProject {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Скорость автомобиля: ");
        double speed = in.nextDouble();
        System.out.println("Выберите состояние дороги\n1. Сухая\n2. Мокрая");
    }
    public void stopping_distance(double speed){
        double distance = speed;
        System.out.println("Тормозной путь: " + distance);
    }
}