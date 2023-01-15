import java.util.Random;
import java.util.Scanner;

public class Zadasha2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = (int) (rand.nextInt(100) + 1);
        System.out.println("Введите число от 1 до 100");
        int y = scanner.nextInt();
        int popytka =1;
        do {while (y < x) {
            System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            y = scanner.nextInt();
            popytka = popytka+1;

        }while (y > x) {
            System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            y = scanner.nextInt();
            popytka=popytka+1;
        }}
        while (y!=x);
        System.out.println("RESULT" + " Количество попыток " + popytka + " Загаданное число " + x);




    }}
