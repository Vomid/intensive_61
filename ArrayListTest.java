import java.util.Comparator;

public class ArrayListTest {
        public static void main(String[] args) {
            // Создание экземпляра класса
            IntensiveList<Integer> list = new ArrayList_DanilaPakhomov<>();
            //Компаратор для сортировки списка по возрастанию чисел
            Comparator<Integer> comparator = Comparator.comparingInt(a -> a);
            // Добавление элементов в список
            list.add(0, 0);
            list.add(1, 1);
            list.add(2);

            // Проверка размера списка
            System.out.println("Размер списка: " + list.size());

            // Получение и вывод элементов списка
            System.out.println("Первый список:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Элемент под индексом " + i + ": " + list.get(i));
            }

            // Удаление элемента из списка
            list.remove(1);

            // Добавление новых чисел в список и проверка работы компаратора
            list.add(1, 3);
            list.add(1);
            list.quickSort(comparator);

            // Вывод оставшихся элементов после удаления первого элемента списка
            System.out.println("Второй список:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Элемент под индексом " + i + ": " + list.get(i));
            }


            // Проверяем сортировку
            if (list.isSorted()) {
                System.out.println("Список отсортирован");
            } else {
                System.out.println("Список не отсортирован");
            }

            // Заменяем число в списке и обрезаем до index = 3
            list.set(1, 5);
            list.split(3);
            System.out.println("Третий список:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Элемент под индексом " + i + ": " + list.get(i));
            }

            // Проверяем сортировку
            if (list.isSorted()) {
                System.out.println("Список отсортирован");
            } else {
                System.out.println("Список не отсортирован");
            }

            // Очистка списка
            list.clear();

            // Проверка пустоты списка
            if (list.size() == 0) {
                System.out.println("Лист пуст");
            } else {
                System.out.println("Лист не пуст");
            }
        }
}
