import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void p(String str) {
        System.out.println(str);
    }

    public static void pStr(String[] arrStr)
    {
        for(String k : arrStr)
            p(k);
    }
    public static void main(String[] args) {
        try{
            File file = new File ("text.txt");
            p(file.createNewFile()? "File created: "+file.getName() : "File already exists. ");
            Scanner myReader = new Scanner(file);

            String data = "";
            while(myReader.hasNextLine())
                data += " " + myReader.nextLine();

            p("inform: " + data);
            myReader.close();

            data = data.replaceAll("\\d|\\W"," ");
            p("replace:" + data);
            String[] strArr = data.split(" ");

            Arrays.sort(strArr);

            p("Output data: ");
            pStr(strArr);
        }catch(IOException e){
            p("An error occured.");
            e.printStackTrace();
        }

    }
}
