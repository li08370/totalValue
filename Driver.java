
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Value> numOfValues = new ArrayList<>();
        int[] example = {99, 86, 99, 99, 95, 86};
        numOfValues.add(new Value(example[0], 1));
        for (int i = 1; i < example.length; i++) {
            for (int j = 0; j < numOfValues.size(); j++) {
                if (example[i] == (numOfValues.get(j).getKey())) {
                    numOfValues.get(j).updateNum();
                    //System.out.println(numOfValues.get(0));
                }else{
                    numOfValues.add(new Value(example[i], 0));
                }
            }
        }
        for(int t = 0; t < numOfValues.size(); t++)
            System.out.println(numOfValues.get(t));
    }


}
