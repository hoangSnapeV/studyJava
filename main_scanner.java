import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main_scanner {

    public static void listCar() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BWM");
        cars.add("Mes");
        cars.add("Roll Royce");
        cars.add("Honda");
        cars.set(0, "Huang");
        cars.remove(2);
        // System.out.println(cars.get(1));
        // System.out.println(cars.size());
        // loop for lop each
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String i : cars) {
            System.out.println(i);
        }       
    }

    public static void number() {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(30);
        myNumbers.add(5);
        myNumbers.add(25);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
        System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;

        System.out.print("enter username: ");
        userName = myObj.nextLine();
        int num = myObj.nextInt();

        System.out.println("Username is: " + userName + "\n");

        //listCar();
        number();
    }

    

}
