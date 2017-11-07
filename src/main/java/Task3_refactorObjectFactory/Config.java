package Task3_refactorObjectFactory;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
