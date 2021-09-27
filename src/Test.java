import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        getType<Integer> ot = new getType<>();
        GenSeqStack<Integer> l1 = new GenSeqStack<>();

        l1.enQueue(10,ot);
        l1.enQueue(20,ot);
        l1.enQueue(30,ot);
        l1.enQueue(40,ot);
        Scanner scan = new Scanner(System.in);
        int ch;
        int p;
        int v;
        Status s;
        ch = -1;
        while(ch != 0){
            System.out.println("---------------");
            System.out.println("1 - show");
            System.out.println("2 - enQueue");
            System.out.println("3 - deQueue");
            System.out.println("4 - size");
            System.out.println("5 - getQueueHead");
            System.out.println("0 - exit");
            System.out.println("---------------");
            System.out.print("select:");
            ch = scan.nextInt();

            switch(ch){
                case 2:
                    System.out.print("enter value:");
                    v = scan.nextInt();
                    s = l1.enQueue(v,ot);
                    if(s!=null) System.out.println("入栈的是:" + ot.value);
                    break;

                case 3:
                    s = l1.deQueue(ot);
                    if(s!=null) System.out.println("出栈的是:" + ot.value);
                    break;

                case 1:
                    l1.show();
                    break;

                case 4:
                    System.out.println("栈大小："+ l1.size());
                    break;
                case 5:
                    s = l1.getQueueHead(ot);
                    if(s!=null) System.out.println("栈头:"+ ot.value);
                    break;
            }

        }
        scan.close();

    }
}
