import java.util.*;
/*---LinkedList при додаванні повільніший за ArrayList;
    TreeSet повільніше за всіх додає елементи, бо внього вони зразу сортуються(при збільшенні кількості елементів стає швидшив за всіх);
    HashSet найшвидше додаються елементи---*/
public class Main {
    int Size = 100;
    public static void main(String[] args) {
        List<Integer> ArrList = new ArrayList<>();
        List<Integer> ArrLinkedList = new LinkedList<>();
        AbstractSet<Integer> ArrTreeSet = new TreeSet<>();
        AbstractSet<Integer> ArrHashSet = new HashSet<>();
        Main ObjMain = new Main();
        int[] ArrInt = new int[ObjMain.Size];
        for(int i = 0; i < ObjMain.Size; i++){
            int Number = (int) (Math.random() * ((1000 + 1000) + 1)) - 1000;
            long NowTime = System.nanoTime();
            ArrList.add(Number);
            ArrInt[i] = Number;
            long AfterTime = System.nanoTime();
            System.out.println("AddNumber: " + Number + " Result of nano time ArrayList:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrLinkedList.add(Number);
            AfterTime = System.nanoTime();
            System.out.println("AddNumber: " + Number + " Result of nano time LinkedList:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrTreeSet.add(Number);
            AfterTime = System.nanoTime();
            System.out.println("AddNumber: " + Number + " Result of nano time TreeSet:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrHashSet.add(Number);
            AfterTime = System.nanoTime();
            System.out.println("AddNumber: " + Number + " Result of nano time HashSet:");
            System.out.println((AfterTime - NowTime) + "\n");
        }
/*
        for(int i = 0; i < ObjMain.Size; i++) {
            int Number = ArrInt[i];
            long NowTime = System.nanoTime();
            ArrList.remove(i);
            long AfterTime = System.nanoTime();
            System.out.println("RemoveNumber: " + Number + " Result of nano time ArrayList:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrLinkedList.remove(i);
            AfterTime = System.nanoTime();
            System.out.println("RemoveNumber: " + Number + " Result of nano time LinkedList:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrTreeSet.remove(i);
            AfterTime = System.nanoTime();
            System.out.println("RemoveNumber: " + Number + " Result of nano time TreeSet:");
            System.out.println(AfterTime - NowTime);

            NowTime = System.nanoTime();
            ArrHashSet.remove(i);
            AfterTime = System.nanoTime();
            System.out.println("RemoveNumber: " + Number + " Result of nano time HashSet:");
            System.out.println((AfterTime - NowTime) + "\n");
        }
*/
    }
}
