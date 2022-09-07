package task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String line;
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (!(line = reader.readLine()).equals("end"))  {
                list.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        for(String text:list){
            System.out.println(text);
        }
    }
}

