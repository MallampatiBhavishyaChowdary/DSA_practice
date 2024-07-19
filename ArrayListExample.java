import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax for ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(67);
//        list.add(77);
//        list.add(87);
//        list.add(97);
//        list.add(107);
//        list.add(117);
//        System.out.println(list.contains(67));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here,list[index] will not work here

        }
    }
}
