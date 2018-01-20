package designpattern.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T>{
    private long expirationTime;
    private Hashtable<T,Long> locked,unlocked;

    public ObjectPool() {
        expirationTime = 30000;
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }
    protected abstract T create();
    protected abstract boolean validate(T o);
    protected abstract void expire(T o);

    public synchronized T checkOut(){
        long now = System.currentTimeMillis();
        T t;
        if(unlocked.size()>0){
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()){

                t = e.nextElement();
                if((now-unlocked.get(t))>expirationTime){
                    //object has expired
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                }else{
                    if (validate(t)){
                        unlocked.remove(t);
                        locked.put(t,now);
                        return (t);
                    }else{
                        //object failed
                        unlocked.remove(t);
                        expire(t);
                        t =null;
                    }
                }

            }
        }
        t = create();
        locked.put(t,System.currentTimeMillis());
        return (t);
    }
    public synchronized void checkIn(T t){
        locked.remove(t);
        unlocked.put(t,System.currentTimeMillis());
    }

}
