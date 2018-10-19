public class Printer {

    public <E> void printArray(E[] data){
        for (E e : data){
            System.out.print(e);
        }
    }

}
