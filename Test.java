import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        String[] st = new String[5];
        states.add("One");
        states.add("Two");
        states.add(1,"Three");
        states.add("Four");
        System.out.println(states.get(1));
        for(int i = 0;i<states.size();i++)System.out.println(states.get(i));

        System.out.println("////////////////////////");
        Object[] countries = states.toArray();
        for(Object count : countries){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        for (String it: states) System.out.println(it);
        LinkedList<String> vaze = new LinkedList<String>();
        vaze.add("Cola");
        vaze.addFirst("Twix");
        vaze.addLast("Snikers");
        vaze.add(1,"Kit-kat");
        for(String it:vaze){
            System.out.println(it);
        }
        String tmp = vaze.getFirst();
        System.out.println("first elem of list "+tmp);
        vaze.remove("plun");
        for(String it:vaze){
            System.out.println(it);
        }
        ///////////////////////////////////////////////
        System.out.println("////////////////////////");
        try{
            FileReader reader = new FileReader("C:\\Users\\nsobi\\IdeaProjects\\lab7-8\\src\\Test.txt");

            int c;
            while((c=reader.read())!=-1){

                System.out.print(" c= "+c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }





    }

}

