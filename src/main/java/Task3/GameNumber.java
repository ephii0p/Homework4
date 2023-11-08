package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(10));
        }
        System.out.println("Дана последовательность " + arrayList);
        System.out.println("Количество вычеркиваний: " + Count(arrayList));
    }

    public static int Count(List<Integer> arrayList) {
        int count = 0;
        for (int x = 0; x < arrayList.size(); ) {
            if (x == arrayList.size() - 1) {
                break;
            }
            if (arrayList.get(x) + arrayList.get(x + 1) == 9 ||
                    arrayList.get(x) == (arrayList.get(x + 1))) {
                System.out.println("Вычеркнуто " + arrayList.remove(x) + " и " + arrayList.remove(x));
                System.out.println("Осталось в последовательности " + arrayList);
                count++;
                if (x != 0) {
                    x--;
                }
            } else {
                x++;
            }
        }
        return count;
    }
}

