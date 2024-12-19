package  adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

class EnumerationToIterator implements Iterator<Object> {

    private final Enumeration<?> enumeration;

    public EnumerationToIterator(Enumeration<?> enumeration){
        this.enumeration = enumeration;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException("this operation does not support");
    }

}