
public class ArrayListTest {
        public static void main(String[] args) {
            // Создание экземпляра класса
            IntensiveList<Integer> list = new ArrayList_DanilaPakhomov<>();

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

            // Вывод оставшихся элементов после удаления первого элемента списка
            System.out.println("Второй список:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Элемент под индексом " + i + ": " + list.get(i));
            }

            // Очистка списка
            list.clear();

            // Проверка пустоты списка
            if(list.toString().isEmpty()){
                System.out.println("Лист пуст");
            }else{
                System.out.println("Лист не пуст");
            }
        }
}
