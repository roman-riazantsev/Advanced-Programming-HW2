package Task3_refactorObjectFactory;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;


public class RandConf implements ObjectConfigurator {


    private Random random = new Random();

    @SneakyThrows
    @Override
    public <T> T applyConfiguration(T obj) {

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {

            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int randomIntValue = random.nextInt(max - min) + min;
                field.setAccessible(true);
                field.set(obj,randomIntValue);
            }
        }
        return obj;
    }
}
