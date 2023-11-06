package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(10));
        }
        System.out.println(arrayList);
        System.out.println(Count(arrayList));
        System.out.println(arrayList);
    }

    public static int Count(List<Integer> arrayList) {
        int count = 0;
        for (int x = 0; x < arrayList.size();) {
            if (x == arrayList.size() - 1) {
                break;
            }
            if (arrayList.get(x) + arrayList.get(x + 1) == 9) {
                arrayList.remove(x);
                arrayList.remove(x);
                count++;
                x--;
            } else if (arrayList.get(x) == arrayList.get(x + 1)) {
                arrayList.remove(x);
                arrayList.remove(x);
                count++;
                x--;
            } else {
                x++;
            }
        }
        return count;
    }
}
