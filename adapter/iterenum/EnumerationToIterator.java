package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationToIterator implements Enumeration<Object> {
    Iterator<?> iterator;

    public EnumerationToIterator(Iterator<?> iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
