import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No specific datatype
        System.out.println("Initial size of ArrayList: " + list.size());

        // Use reflection to get the capacity
        try {
            Field dataField = ArrayList.class.getDeclaredField("elementData");
            dataField.setAccessible(true);
            Object[] elementData = (Object[]) dataField.get(list);
            System.out.println("Default capacity of ArrayList: " + elementData.length);
        } catch (Exception e) {
            System.out.println("Unable to access ArrayList capacity: " + e.getMessage());
        }
    }
}