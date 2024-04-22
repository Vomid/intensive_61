import java.util.*;

/**
 * Класс имплементирует интерфейс IntensiveList и предоставляет необходимый функционал
 * @param <E> Тип элементов списка
 * */
public class ArrayList_DanilaPakhomov<E> implements IntensiveList<E> {
    private List<E> list = new ArrayList<>();

    /**
     * Определение размера списка
     * @return Размер списка
     */
    @Override
    public int size(){
        return list.size();
    }

    /**
     * Добавляет элемент в конец списка
     * @param element Элемент для добавления
     * */
    @Override
    public void add(E element){
        list.add(element);
    }

    /**
     * Добавляет элемент в указанную позицию
     * @param index Позиция
     * @param element Элемент для добавления
     * */
    @Override
    public void add(int index, E element){
        list.add(index, element);
    }

    /**
     * Получает элемент из списка по индексу
     * @param index Индекс элемента
     * @return Элемент списка
     * */
    @Override
    public E get(int index){
        return list.get(index);
    }

    /**
     * Устанавливает элемент на указанный индекс с заменой
     * @index Индекс элемента для замены
     * @param element Элемент для добавления
     * @return Предыдущий элемент на этой позиции
     * */
    @Override
    public E set(int index, E element){
        return list.set(index, element);
    }

    /**
     * Удаляет элемент с указанной в index позиции
     * @index Позиция удаляемого элемента
     * @return Удалённый элемент
     * */
    @Override
    public E remove(int index){
        return list.remove(index);
    }

    /**
     * Очищает весь список
     * */
    @Override
    public void clear(){
        list.clear();
    }

    /**
     * Реализует быструю сортировку списка
     * @param comparator Компаратор для сравнения элеменов списка
     * */
    @Override
    public void quickSort(Comparator<E> comparator) {
        list.sort(comparator);
    }

    /**
     * Проверяет, отсортирован ли список
     * @return true, если отсортирован, иначе - false
     * */
    @Override
    public boolean isSorted() {
        return list.isEmpty() || binarySearchForward(list, list.get(0)) >= 0 && binarySearchForward(list, list.get(list.size() - 1)) >= 0;
    }

    /**
     * Выполняет бинарный поиск вперед в списке.
     *
     * @param list Список для поиска
     * @param key Ключ, который нужно найти
     * @return Индекс первого вхождения ключа в списке, если ключ найден. Если ключ не найден, то возвращает отрицательное число,
     *         которое является индексом, где ключ должен быть вставлен, чтобы сохранить порядок списка.
     */
    private int binarySearchForward(List<E> list, E key) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int cmp = compare(key, list.get(mid));
            if (cmp < 0) {
                high = mid - 1;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                return mid; // ключ найден
            }
        }
        return -(low + 1); // ключ не найден
    }

    private int compare(E o1, E o2) {
        return ((Comparable<? super E>) o1).compareTo(o2);
    }

    /**
     * Обрезает список до указанной в index позиции
     * @param size Размер, до которого нужно обрезать список
     * */
    @Override
    public void split(int size) {
        if (size > list.size()) {
            throw new IllegalArgumentException("Размер должен быть меньше или равен текущему размеру list");
        }
        list = list.subList(0, size);
    }
}