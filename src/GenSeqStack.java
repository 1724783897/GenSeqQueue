public class GenSeqStack<E>{
    final int DEF_SIZE = 10;
    E[] A = null;
    int size;
    int n;
    @SuppressWarnings("unchecked")
    public GenSeqStack(){
        size = DEF_SIZE;
        A = (E[])new Object[size];
        n = 0;
    }

    @SuppressWarnings("unchecked")
    public GenSeqStack(int s){
        if(s < 2 || s > 10000)
            size = DEF_SIZE;
        else
            size = s;
        A = (E[])new Object[size];
        n = 0;
    }

    public Status enQueue(E value,getType<E> oldV){
        if(n==size){
            System.out.println("队列已满，无法入队");
            return null;
        }
        A[n] = value;
        oldV.value = value;
        n++;
        return Status.OK;
    }

    public Status deQueue(getType<E> oldV){
        n--;
        if(isEmpty()){
            n=0;
            System.out.print("队列已空，无法出栈");
            return null;
        }
        oldV.value = A[0];
        for(int i=0; i<n;i++){
            A[i] = A[i+1];
        }
        A[n]=null;
        return Status.OK;
    }

    public Status getQueueHead(getType<E> oldV){
        if(isEmpty()){
            System.out.println("队列为空，无法获取队头");
            A[0]=null;
            return null;
        }else{
            oldV.value = A[0];
        }
        return Status.OK;
    }

    private Boolean isEmpty(){
        return A[0]==null;
    }


    public int size(){
        return n;
    }

    public void show(){
        for(int i =0; i < n; i++){
            System.out.print(A[i] + "  ");
        }
        System.out.println();
    }
}
