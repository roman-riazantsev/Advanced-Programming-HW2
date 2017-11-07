package Task2_enum_marital;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    public int age;
    public String name;
    public MaritalStatus maritalStatus;

    @Override
    public String toString() {
        return name + " age: " + age + ", " + maritalStatus;
    }
}
