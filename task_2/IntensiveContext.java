public interface IntensiveContext {
    <T> T getObject(Class<T> type) throws Exception;
}
