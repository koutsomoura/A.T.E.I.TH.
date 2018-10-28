
public class ArrayQueue implements Queue {
    private Object[] Q;
    private int last=0;
    private int first=0;
    
    public ArrayQueue(){
        this(100);
    }
    public ArrayQueue(int cap){
         Q=new Object[cap];
    }
    @Override
    public int size() {
        return last-first;
    }

    @Override
    public boolean isEmpty() {
        return first==last;
    }

    @Override
    public boolean isFull() {
        return (size()==Q.length);
    }

    @Override
    public Object front() throws QueueEmptyException {
        
        if (isEmpty()){
            throw new QueueEmptyException("Empty queue");
        } 
        
        return Q[first];
    }

    @Override
    public void add(Object item) throws QueueFullException {
        if (isFull()){
            throw new QueueFullException("Full queue");
        }
        if(last==Q.length){
            for(int i=first;i<last;i++){
                    Q[i-first]=Q[i];
                }
                last=last-first;
                first=0;
        }
        
        Q[last]=item;
        last++;
    }
   
    @Override
    public Object remove() throws QueueEmptyException {
        
        if (isEmpty()){
            throw new QueueEmptyException("Empty queue");
        }
        Object element=Q[first];
        Q[first++]=null;
        return element;
    }
    
    public String APOTELESMA(){
        if(isEmpty()){
            return "The Queue is Empty";
        }
        else{
            String out="";
            for(int i=first;i<last;i++){
                out+="\n"+Q[i].toString();
            }
            return out;
        }
    }
}
