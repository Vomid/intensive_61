/**
 * Реализация интерфейса DependencyFactory.
 */
public class DependencyFactoryImpl implements DependencyFactory {
    @Override
    public <T> T createInstance(Class<T> clazz, String packageName) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();
        new InjectionServiceImpl().injectDependencies(instance, packageName);
        return instance;
    }
}
