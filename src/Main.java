import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Simulation testDrive = new Simulation();

        ArrayList<Item> phase1 = testDrive.loadItems("phase-1.txt");
        ArrayList<Item> phase2 = testDrive.loadItems("phase-2.txt");

        ArrayList<Rocket> phase1_U1Rockets = testDrive.loadU1(phase1);
        ArrayList<Rocket> phase2_U1Rockets = testDrive.loadU1(phase2);

        System.out.println("Requiered total budget for U1 Rockets: " + (testDrive.runSimulation(phase1_U1Rockets) + testDrive.runSimulation(phase2_U1Rockets)) + "Millions $");

        ArrayList<Rocket> phase1_U2Rockets = testDrive.loadU2(phase1);
        ArrayList<Rocket> phase2_U2Rockets = testDrive.loadU2(phase2);

        System.out.println("Requiered total budget for U2 Rockets: " + (testDrive.runSimulation(phase1_U2Rockets) + testDrive.runSimulation(phase2_U2Rockets)) + "Millions $");
    }
}
