import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[20];
        for (int i =0; i < 20; i++){
            nums[i] = (int)(Math.random() * 15) + 1;
        }
        System.out.println("Вывод: " + Arrays.toString(nums));
        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < 20; i++) {

            if (myHashMap.containsKey(nums[i])){
                myHashMap.put(nums[i], myHashMap.get(nums[i])+1);
            } else {
                myHashMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: myHashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число " + entry.getKey() + " встречается " + entry.getValue() + " раза");
            }
        }
    }
}