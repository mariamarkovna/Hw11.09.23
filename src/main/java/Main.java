import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //       1) Создайте ArrayList, заполните его 100 случайными значениями, используя библиотеку Random
//    Решите две задачи и пришлите решение ссылкой на гитхаб
//
//    1) Выведите все элементы списка, которые больше предыдущего элемента этого же списка.
//    Пример, если список выглядит так - 1 5 2 4 3
//    То мы выведем - 5 4
//
//    2) Выведите значение наименьшего из всех положительных элементов в списке
//
//    Пример, если список выглядит так - 5 -4 3 -2 1
//    То мы выведем - 1


        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(-100, 100);
            arrayList.add(randomNumber);
        }
        ;

        System.out.println(arrayList);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > arrayList.get(i - 1))
            {
                System.out.println(arrayList.get(i));
            }
            System.out.println("----");
        }

        int min = Integer.MAX_VALUE;
        for (Integer integer:arrayList) {

            if(integer >0 && integer < min){
                min =integer;
            }
        }
        System.out.println(min);
    }
}
