import java.util.Scanner;

public class calculatorProject {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Скорость автомобиля: ");
        double speed = in.nextDouble();
        System.out.println("Выберите тип дороги\n1. Сухой асфальт\n2. Мокрая дорога\n3. Укатанный снег\n4. Обледенелая дорога");
        int roadType = in.nextInt();
        double roadTypeNum = 0;
        switch (roadType){
            case 1: roadTypeNum = 0.8;
                    break;
            case 2: roadTypeNum = 0.55;
                break;
            case 3: roadTypeNum = 0.25;
                break;
            case 4: roadTypeNum = 0.25;
                break;
        }
    }
    public void stopping_distance(double speed){
        double distance = speed;
        System.out.println("Тормозной путь: " + distance);
    }
}