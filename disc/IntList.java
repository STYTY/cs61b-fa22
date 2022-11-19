import static java.util.Collections.reverse;

public class IntList {
    public int first;
    public IntList rest;

    public static IntList list(int... args) {
        return null;
    }

    public void skippify() {
        IntList p = this;
        int n = 1;
        while (p != null) {
            IntList next = p.rest;
            for (int i = 0; i < n; i++) {
                if (next == null) {
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            n++;
        }
    }

    public static IntList[] partition(IntList lst, int k) {
        // 创建一个array来放IntList
        IntList[] array = new IntList[k];
        int index = 0;
        // 将lst反转
        IntList L = reverse(lst);
        while (L != null) {
            // 拿到当前index的东西存在临时变量里
            IntList prevAtIndex = array[index];
            // 将断链的L的其余部分存在临时变量里
            IntList next = L.rest;
            // 将L pointer存在array[index]里
            array[index] = L;
            // 将临时变量链接到L的后面
            array[index].rest = prevAtIndex;
            // 将pointer移到下一个
            L = next;
            //
            index = (index + 1) % array.length;
        }
        return array;
    }

    private static IntList reverse(IntList lst) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1 % 2);
        System.out.println(2 % 2);
        System.out.println(3 % 2);
        System.out.println(4 % 2);
        System.out.println(5 % 2);
    }
}