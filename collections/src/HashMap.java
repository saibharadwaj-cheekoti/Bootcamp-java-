import java.util.*;

 class Hash {

    public static void main(String[] args) {

        Map<String,Integer> marks = new HashMap<>();

        marks.put("Ayaan",10);
        marks.put("Shayaan",11);
        marks.put("Harinda",12);

        for (Map.Entry<String,Integer> mark: marks.entrySet())
        {
            System.out.println(mark.getKey() + " - " + mark.getValue());
        }

    }

}
