/**
 * Интерфейс для инъекции зависимостей в поля объектов.
 */
public interface InjectionService {
    /**
     * Выполнить инъекцию зависимостей в поля объекта.
     *
     * @param instance    Объект, в поля которого необходимо выполнить инъекцию.
     * @param packageName Пакет для поиска классов.
     * @param <T>         Тип объекта.
     * @throws Exception Если произошла ошибка при инъекции зависимостей.
     */
    <T> void injectDependencies(T instance, String packageName) throws Exception;
}
