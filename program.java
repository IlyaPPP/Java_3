// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class program {

    public static void main(String[] args) {
        task1(100, 100);
    }

    public static void task1(int size, int growthrandom) {
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0;
        int sr = 0;
        for (int i = 0; i < size; i++)
            list.add((int) (Math.random() * growthrandom));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if ((int) o % 2 == 0)
                iterator.remove();
            else {
                s = s + 1;
                sr = sr + (int) o;
            }
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Минимальное значение -> " + list.get(0));
        System.out.println("Максимальное значение -> " + list.get(s - 1));
        System.out.println("Среднее значение -> " + sr / list.size());
    };
}