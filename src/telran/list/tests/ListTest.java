package telran.list.tests;

import org.junit.jupiter.api.Test;
import telran.list.interfaces.IList;
import telran.list.model.MyArrayList;

class ListTest {

    @Test
    void test() {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(null);
        list.add(7);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println("---------");
        System.out.println(list.indexOf(7));
        System.out.println(list.lastIndexOf(7));
        System.out.println(list.contains(11));
        System.out.println(list.isEmpty());
        System.out.println("---------");

        list.remove((Integer)3);
        System.out.println(list.contains(3));
        list.set(4, 11);
        System.out.println(list.get(4));



    }
}