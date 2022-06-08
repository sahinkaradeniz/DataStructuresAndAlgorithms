package Hashtable;

public class Entry {
    int key;
    Object value;
    Entry next;
    public Entry(int key,Object value){
        this.key=key;
        this.value=value;
        next=null;
    }
    public Entry(){
        next=null;
    }
    public Object getValue(){
        return  value;
    }
    public int getKey(){
        return key;
    }
}
