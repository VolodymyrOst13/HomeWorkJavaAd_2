package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner hw = new Scanner(System.in);
        Map<String, String> addresses = new HashMap<String, String>();

        System.out.println("Enter number of families ");
        int n = hw.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the city ");
            String city = hw.next();

            System.out.println("Enter the name ");
            String name = hw.next();
            if (!city.isEmpty() & !name.isEmpty()) {
                addresses.put(city, name);
            }
        }

        System.out.print("Searching of city - ");
        String tempCity = hw.next();

        for (Map.Entry<String, String> pair : addresses.entrySet()){
            String city = pair.getKey();

            if (tempCity.equals(city)){
                String name = pair.getValue();
                System.out.println(name);
            }
        }
    }
}
