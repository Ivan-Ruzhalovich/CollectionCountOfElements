import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String[] mas =new String[]{"as","dsd","as"};
        System.out.println(countOfElements(mas));
    }

    public static <T> Map<T,Integer> countOfElements(T[] mas){
        Map<T,Integer> result = new HashMap<>();
        for (T object:mas){
            if (result.containsKey(object)){
                result.merge(object,1, Integer::sum);
            }
            else result.put(object,1);
        }
        return result;
    }
}