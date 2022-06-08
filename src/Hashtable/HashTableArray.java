package Hashtable;

public class HashTableArray<S> {
    Entry[] arrayHash;
    int size;
    public HashTableArray(int size){
        this.size=size;
        arrayHash=new Entry[size];
        for (int i=0;i<size;i++){
            arrayHash[i]=new Entry(); // indexler icerisinde bulunan Entry degerlerine null atıyoruz
        }

    }
    int getHash(int key){
        return key%size;  // yerlesecegi index numarasını belieliyoruz
    }
    public void put(int key,Object value){
        int hashIndex=getHash(key); //getHash ile nesnenin hangi indexde olucagına karar veriyoruz.
        Entry arrayValue=arrayHash[hashIndex]; //sonrasında bulunan index numarasını arrayValue ile bağlıyoruz. Ve artik bu nesne o indexi isaret ediyor
        //arrayValue nesnesinin Entry sinifindan olusmasinin sebebi Entry özelliklerini kullanabilmesi next,value gibi
        Entry newItem=new Entry(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;
    }
    public String get(int key){
        String value=null;
        int hashIndex=getHash(key);
        Entry arrayValue=arrayHash[hashIndex];
        while (arrayValue!=null){
            if (arrayValue.getKey()==key){
                value= (String) arrayValue.getValue();
            }
            arrayValue=arrayValue.next;
        }
        return  value;
    }
}
