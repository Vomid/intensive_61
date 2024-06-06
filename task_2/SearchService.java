/**
 * Интерфейс для поиска реализации классов
 */
public interface SearchService {
    /**
     * Нахождение реализации для указанного типа в заданном пакете
     *
     * @param type        Тип, для которого нужно найти реализацию
     * @param packageName Пакет для поиска классов
     * @param <T>         Тип класса
     * @return Реализация указанного класса
     * @throws Exception Если не найдена реализация/найдено несколько реализаций
     */
    <T> Class<? extends T> findImplementation(Class<T> type, String packageName) throws Exception;
}
