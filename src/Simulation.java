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
        ArrayList<Item> items = new ArrayList<>();

        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            String [] splitLine = line.split("=");
            items.add(new Item(splitLine[0],Integer.parseInt(splitLine[1])));
        }
        return items;
    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> u1Ships = new ArrayList<>();
        Rocket rocket = new U1();

        for(Item i : items){
            if (rocket.canCarry(i)){
                rocket.carry(i);
            }
            else{
                u1Ships.add(rocket);
                rocket = new Rocket();
            }
        }
        return u1Ships;
    }
    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> u2Ships = new ArrayList<>();
        Rocket rocket = new U2();

        for(Item i : items){
            if (rocket.canCarry(i)){
                rocket.carry(i);
            }
            else{
                u2Ships.add(rocket);
                rocket = new Rocket();
            }
        }
        return u2Ships;
    }
    public int runSimulation(ArrayList<Rocket> rocket){
        //This part will calculate how much money we should pay for rockets.
        int totalBudget = 0;
        for(Rocket i : rocket){
            while(!i.launch()){
                totalBudget += i.cost;
            }
            totalBudget += i.cost;
            while(!i.land()){
                totalBudget +=i.cost;
            }
            totalBudget += i.cost;
        }
        return totalBudget;
    }
}
