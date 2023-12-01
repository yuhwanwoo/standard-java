package test.reflection;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) {
        Class buildingClass = Building.class;

        Field[] fields = buildingClass.getFields();
        for (Field field : fields) {
            System.out.println("field.getName() = " + field.getName());
        }

        Field[] declaredFields = buildingClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField.getName() = " + declaredField.getName());
        }
    }
}
