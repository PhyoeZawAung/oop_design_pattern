package adapter.iterenum;


import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Enumeration<Object> {

    private final Iterator<?> iterator;

    public IteratorToEnumeration(Iterator<?> iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement(){
        return iterator.next();
    }
}
