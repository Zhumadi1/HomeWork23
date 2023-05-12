import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sortArr = new int[10];
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            list.add(random.nextInt(2));
        }

        System.out.println(Arrays.toString(sort(sortArr)));
        System.out.println(sort(arrayList));
        System.out.println(sort(list));

    }

    public static int[] sort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        return sortArr;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> a) {
        Collections.sort(a);
        return a;
    }

    public static LinkedList<Integer> sort(LinkedList<Integer> a) {
        Collections.sort(a);
        return a;
    }
}