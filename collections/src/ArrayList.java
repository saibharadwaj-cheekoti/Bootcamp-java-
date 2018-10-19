import java.util.List;

public class ArrayList {


    public static void main(String[] args) {
        List<String> list1 = new java.util.ArrayList<>();

        System.out.println("Initial size "+ list1.size());

        list1.add("A");
        list1.add("E");
        list1.add("I");
        list1.add("O");
        list1.add("U");

        System.out.println("After adding " + list1.size());

        list1.remove(3);

        System.out.println("After removing " + list1.size());

        for (String str: list1) {
            System.out.println(str);
        }

    }

}
