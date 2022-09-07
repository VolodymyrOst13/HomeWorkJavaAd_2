package task3;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }
    public static int getMinimum(LinkedList<Integer> list){
        int minimum = list.get(0);
        for(int a = 0; a < list.size(); a++){
            if(minimum > list.get(a)){
                minimum = list.get(a);
            }
        }
        System.out.print("Minimum - ");
        return minimum;
    }

    public static LinkedList<Integer> getIntegerList() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner hw = new Scanner(System.in);
        System.out.print("Enter size - ");
        int n = hw.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter num - ");
            int m = hw.nextInt();
            list.add(m);
        }
        return list;
    }

    }
