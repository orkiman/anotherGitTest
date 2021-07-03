import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public Test(){
        String [] strings = {"a","b","c"};
        for (String s:strings){
            System.out.println(s);

        }
        List<Cell> list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 4; i++) {list.add(new Cell(i));}
        for (int i = 0; i < 4; i++) {System.out.print((list.get(i)).num);}System.out.println();
        Collections.rotate(list,1);
        for (int i = 0; i < 4; i++) {System.out.print((list.get(i)).num);}System.out.println();
        list.get(0).num=7;
        for (int i = 0; i < 4; i++) {System.out.print((list.get(i)).num);}System.out.println();
        Collections.rotate(list,1);
        for (int i = 0; i < 4; i++) {System.out.print((list.get(i)).num);}System.out.println();
        Cell c=list.get(0);
        Collections.rotate(list,1);
//        second commit from fedora - changed number to 5
        c.num=5;
        for (int i = 0; i < 4; i++) {System.out.print((list.get(i)).num);}System.out.println();

    }
    public static void main(String[] args) {
        new Test();
    }
    class Cell{
        int num;
        public Cell(int num){
            this.num=num;
        }
    }
}

