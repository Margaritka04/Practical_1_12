import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Стетюха Маргарита, РИБО-04-22, Вариант 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска автомобиля: ");
        String year = scanner.nextLine();
        System.out.println("Введите модель автомобиля: ");
        String model = scanner.nextLine();
        System.out.println("Введите пробег автомобиля: ");
        String run = scanner.nextLine();
        System.out.println("Введите цвет автомобиля: ");
        String color = scanner.nextLine();
        System.out.println("Введите максимальную скорость автомобиля: ");
        String maxSpeed = scanner.nextLine();
        Car car = new Car(Integer.parseInt(year), model, Integer.parseInt(run), color, Integer.parseInt(maxSpeed));

        Thread t = new Thread(() -> {
            FileOutputStream fileOut;
            try {
                fileOut = new FileOutputStream("C:\\savedCar.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                car.writeExternal(out);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        t.start();
        System.out.println("Объект успешно сериализован и сохранен в файл C:\\savedCar.ser");
    }
}
