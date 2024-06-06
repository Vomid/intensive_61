import java.lang.reflect.Field;

/**
 * Реализация интерфейса InjectionService.
 */
public class InjectionServiceImpl implements InjectionService {
    @Override
    public <T> void injectDependencies(T instance, String packageName) throws Exception {
        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(IntensiveComponent_DanilaPakhomov.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = new DependencyFactoryImpl().createInstance(fieldType, packageName);
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
    }
}
