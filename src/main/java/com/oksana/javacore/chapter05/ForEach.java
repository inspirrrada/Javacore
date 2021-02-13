package main.java.com.oksana.javacore.chapter05;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        //использовать цикл в стиле for each для вывода и суммирования значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);

        //----------------------------------------------------------
        //Применение оператора break в цикле for в стиле for each
        int sum2 = 0;
        for (int x: nums) {
            System.out.println("Значение равно: " + x);
            sum2 += x;

            if (x == 5) {
                break; //прервать цикл после получения 5 значений
            }
        }
        System.out.println("Сумма пяти первых элементов равна: " + sum2);

        //----------------------------------------------------------
        //Переменная цикла в стиле for each доступна только для чтения
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; //этот опреатор не оказывает никакого влияния на массив nums
        }
        System.out.println();

        for (int x: nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
