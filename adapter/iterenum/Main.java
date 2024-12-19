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

        Iterator<String> iterator = books.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        printIterator(iterator);



        Enumeration<String> enumeration = Collections.enumeration(books);

        <String> enumToIterator = new IteratorToEnumeration(enumeration);

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

    public static void printIterator(Iterator<?> iterator){

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
