/**
 * Контекст для управления компонентами, аннотированными @IntensiveComponent_DanilaPakhomov.
 */
public class IntensiveContext_DanilaPakhomov implements IntensiveContext {
    private final String packageName;
    private final SearchService searchService;
    private final DependencyFactory dependencyFactory;

    /**
     * Конструктор класса IntensiveContext_DanilaPakhomov.
     *
     * @param packageName Пакет для поиска классов, аннотированных @IntensiveComponent_DanilaPakhomov.
     */
    public IntensiveContext_DanilaPakhomov(String packageName) {
        this.packageName = packageName;
        this.searchService = new SearchServiceImpl();
        this.dependencyFactory = new DependencyFactoryImpl();
    }

    /**
     * Получить экземпляр класса, аннотированного @IntensiveComponent_DanilaPakhomov.
     *
     * @param type Тип класса, экземпляр которого нужно получить.
     * @param <T>  Тип класса.
     * @return Экземпляр класса.
     * @throws Exception Если произошла ошибка при создании экземпляра.
     */
    @Override
    public <T> T getObject(Class<T> type) throws Exception {
        Class<? extends T> implClass = searchService.findImplementation(type, packageName);
        return dependencyFactory.createInstance(implClass, packageName);
    }
}
