import java.awt.image.AbstractMultiResolutionImage;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Zadcha1 {
            public static void main(String[] args) {
            Random rand = new Random();
            String a1 = "Я сам в шоке, но, загаданное число больше, брат";
            String a2 = "Не ожидал от тебя такого. Загаданное число меньше, брат";
            String r = "RESULT";
            Scanner scanner = new Scanner(System.in);
            int x = (int) (rand.nextInt(100) + 1);
            System.out.println("Введите число от 1 до 100");
            int y = scanner.nextInt();
            int popytka =1;
            while (y>100){
                System.out.println("Вы ввели больше ста");
                y = scanner.nextInt();
                popytka = popytka+1;
            }while (y<=0){
                System.out.println("Вы ввели меньше нуля");
                y=scanner.nextInt();
                popytka = popytka+1;
            }
            while (y < x) {
                System.out.println(a1);
                y = scanner.nextInt();
                popytka = popytka+1;
            }
            while (y > x) {
                System.out.println(a2);
                y = scanner.nextInt();
                popytka=popytka+1;
            }
            while (y == x) ;{
                System.out.println(r + " Количество попыток " + popytka + " Загаданное число " + x);
            }
            }

}

