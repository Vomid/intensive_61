/**
 * Класс Main для демонстрации работы контекста IntensiveComponent_DanilaPakhomov.
 */
public class main {
    public static void main(String[] args) throws Exception {
        IntensiveContext_DanilaPakhomov context = new IntensiveContext_DanilaPakhomov("your.package.name");
        AnotherClass test1 = context.getObject(AnotherClass.class);
        test1.run();
    }
}