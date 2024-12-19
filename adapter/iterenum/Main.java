package adapter.iterenum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("Essential for Java");
        books.add("Javascript In depth");
        books.add("HTML for kids");

        Enumeration<String> enumeration = Collections.enumeration(books); // change list to enumerator
        Iterator<String> iterator = books.iterator();

        printIterator(iterator);

        Iterator<?> enumerationToIterator = new EnumerationToIterator((enumeration));

        printIterator(enumerationToIterator);

        Enumeration<?> iteratorToEnumeration = new IteratorToEnumeration(iterator);

        printEnumerator(enumeration);
        printEnumerator(iteratorToEnumeration);

    }

    public static void printIterator(Iterator<?> iterator){

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    public static void printEnumerator(Enumeration<?> enumeration){
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
