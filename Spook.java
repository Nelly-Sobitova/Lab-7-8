import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Spook {
    public static class Names {
        public static void main(String[] args) {
            ArrayList<String> FIO = new ArrayList<String>();
            String[] fio = new String[7];
            FIO.add("Остапенко Инна Евгеньевна");
            FIO.add("Путрин Никита Андреевич");
            FIO.add(1,"Викторов Виктор Викторович");
            FIO.add("Ибрагимова Анастасия Тарасовна");
            FIO.add("Ломакин Матвей Михайлович");
            FIO.add("Никишин Иван Игревич");
            System.out.println(FIO.get(1));
            FIO.remove("Никишин Иван Игоревич");
            for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
            System.out.println("////////////////////////");
            Object[] fiol = FIO.toArray();
            for(Object count : fiol){

                System.out.println(count);
            }
            System.out.println("////////////////////////");
            try{
                FileWriter writer = new FileWriter("C:\\Users\\\\IdeaProjects\\lab7-8\\src\\\\Spisoktext.txt", true);

                writer.append("\n");
                writer.append("Нужно купить:");
                String text = "Огурцы, помодоры, лисья салата, чипсы";
                writer.write(text);

                writer.append('.');
                writer.append('\n');
                writer.append("Список завершен");
                writer.append("\n");





                writer.flush();
                FileReader reader = new FileReader("C:\\Users\\nsobi\\IdeaProjects\\Lab7-8\\src\\Test.txt");
                System.out.println("////////////////////////");
                int c;
                while((c=reader.read())!=-1){


                    System.out.print((char)c);

                }

            }
            catch(IOException ex){

                System.out.println(ex.getMessage());


            }

        }
    }
}
