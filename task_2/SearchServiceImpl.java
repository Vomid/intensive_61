import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса SearchService.
 */
public class SearchServiceImpl implements SearchService {
    @Override
    public <T> Class<? extends T> findImplementation(Class<T> type, String packageName) throws Exception {
        Reflections reflections = new Reflections(packageName);
        List<Class<? extends T>> implementations = new ArrayList<>(reflections.getSubTypesOf(type));

        if (implementations.size() == 1) {
            return implementations.get(0);
        } else if (implementations.size() > 1) {
            throw new RuntimeException("Множественные имплементации найдены для " + type);
        } else {
            throw new RuntimeException("Не найдено имплементаций для " + type);
        }
    }
}