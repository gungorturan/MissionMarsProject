import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public Simulation(){

    }
    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        ArrayList<Item> items = new ArrayList<Item>();

        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] splitLine = line.split("=");
            items.add(new Item(splitLine[0],Integer.parseInt(splitLine[1])));
        }
        return items;
    }
    public ArrayList<U1> loadU1(ArrayList<Item> items){
        ArrayList<U1> u1Ships = new ArrayList<U1>();
        Rocket rocket = new U1();

        for(Item i : items){

        }
    }
}
