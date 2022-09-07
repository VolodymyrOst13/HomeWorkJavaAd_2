package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner hw = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the word - ");
            list.add(hw.next());
            }

        ArrayList<String> result = doubleValues(list);

        for (String s:result)
            System.out.println(s);
        }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int x = 0;
        int y =0;
        for (int i=0; i<5; i++){
            list.add(x, list.get(y));
            x+=1;
            y+=1;
        }
        return list;
    }
    }



