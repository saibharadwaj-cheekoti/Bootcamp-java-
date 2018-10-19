public class A {

    public static void main(String[] args) {
        A a = new C();
        C c = (C)a;
        a.print();
        c.store();
   /* String a = "Cat";
    String b = "Cat";
    String d = "Dog";
    String  = new String("Cat");
    String e = "cat";

        System.out.println("a==b: "+(a==b));
        System.out.println("a==b: "+a.equals(b));
        System.out.println("a==c: "+(a==c));
        System.out.println("a==d: "+(a==d));
        System.out.println("a==e: "+(a==e));*/




    }

    public  void print(){
        System.out.println("A invoked");
    }
}


