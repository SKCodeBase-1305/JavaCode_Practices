import java.util.*;

public class ArrayListPractice {
    public static void  main(String[] args)
    {
        ArrayList al = new ArrayList(); // No specific datatype

        al.add("java");
        al.add("abc");
        al.add(10);
        al.add(true);
        System.out.println("Elements in ArrayList: " + al);

        al.add(0, "First" );

        System.out.println("After adding 'First' at index 0: " + al);

        al.subList(1, 3).clear(); // Clear elements from index 1 to 2
        System.out.println("After clearing elements from index 1 to 2: " + al);
               // ...existing code...
        // al.retainAll(Collections.singleton("java")); // Retain only elements equal to "java"
        // // ...existing code...
        // System.out.println("After retaining 'java': " + al);

        ListIterator it = al.listIterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }
// ...existing code...
System.out.println("After retaining 'java': " + al);

// Iterate using for loop
for (int i = 0; i < al.size(); i++) {
    System.out.println("Element: " + al.get(i));
    if(al.get(i).equals("java")) {
        al.remove(i);
        i--; // Adjust index after removal
    }   
}
// ...existing code...

// Iterate using for-each loop
for (Object element : al) {
    System.out.println("Element: " + element);
}

// ...existing code...
// Remove the ListIterator code if you only want the for
    }
}
