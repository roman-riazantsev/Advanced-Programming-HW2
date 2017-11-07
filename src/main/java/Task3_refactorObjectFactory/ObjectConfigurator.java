package Task3_refactorObjectFactory;

public interface ObjectConfigurator{
    <T> T applyConfiguration( T obj);
}
