/**
 * Интерфейс для создания экземпляров классов.
 */
public interface DependencyFactory {
    /**
     * Создать экземпляр указанного класса с инъекцией зависимостей.
     *
     * @param clazz       Класс, экземпляр которого нужно создать.
     * @param packageName Пакет для поиска классов.
     * @param <T>         Тип создаваемого экземпляра.
     * @return Созданный экземпляр класса.
     * @throws Exception Если произошла ошибка при создании экземпляра.
     */
    <T> T createInstance(Class<T> clazz, String packageName) throws Exception;
}
