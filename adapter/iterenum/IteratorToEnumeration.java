package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Iterator<Object> {

    Enumeration<?> enumeration;

    public IteratorToEnumeration(Enumeration<?> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
}
