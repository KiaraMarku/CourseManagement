import java.util.List;

public class Mockito {

    private static Object returnValue;

    public static <T> T mock(Class<T> classToMock) {
        return (T) java.lang.reflect.Proxy.newProxyInstance(
                classToMock.getClassLoader(),
                new Class<?>[]{classToMock},
                (proxy, method, args) -> {
                    // You can customize the behavior of the mock here
                    return returnValue;
                }
        );
    }

    public static <T> void when(T methodCall) {
        // This method is intentionally left empty
    }

    public static <T> void thenReturn(T value) {
        returnValue = value;
    }
}
