package seminar4.cw.z4;

import java.util.ArrayList;
import java.util.List;

public class LRUCache <E>{
    ArrayList<E> listE;
    int size;

    public LRUCache(int size) {
        this.size = size;
        listE = new ArrayList<>();
    }



    public void addElement(E employee) {
        if (listE.size() > size){
            listE.remove(0);
        }
        this.listE.add(employee);
    }

    public E getElement(int ind){
        if (ind >= listE.size()){
            return null;
        }
        return this.listE.get(ind);
    }

    public List<E> getAllElement(){
        return this.listE;
    }

}