
import animal.*;
import java.util.Scanner;
import java.util.ArrayList;

public  class Barn {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Chicken>  chickens = new ArrayList<>();
    private static ArrayList<Cow>  cows = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("How many animals are in the barn?: ");
        int numberOfAnimals = input.nextInt();
        int numberOfEggs;
        int litresOfMilk;

        for(int i = 0; i < numberOfAnimals; i++) {
            System.out.printf("\nEnter animal number #%d's type \n1)Chicken         2)Cow%n", i + 1 );
            int pick = input.nextInt(); // gets animal type

            if (pick == 1) {
                Chicken chicken = new Chicken();
                chickens.add(chicken);//add chicken to array list
                System.out.print("Enter number of eggs laid by this chicken ; ");
                numberOfEggs = input.nextInt();
                chicken.setEggsLaid(numberOfEggs);//set this chickens number of eggs laid
            }
            else{
                Cow cow = new Cow();
                cows.add(cow);
                System.out.print("Enter litre of milk produced by this cow ; ");
                litresOfMilk = input.nextInt();
                cow.setMilkPerDay(litresOfMilk);
            }
        }

        // loop each collection and print details
        System.out.println("\n--- All Chickens ---");
        for(int i = 0; i < chickens.size(); i++) {
            System.out.printf("Animal type : %s, laid %d egg(s)%n", chickens.get(i).getType(), chickens.get(i).getEggsLaid());

        }

        System.out.println("\n--- All Cows ---");
        for(int i = 0; i < cows.size(); i++) {
            System.out.printf("Animal type : %s, produced %d Litre(s) of milk%n", cows.get(i).getType(), cows.get(i).getMilkPerDay());

        }

        input.close();
    }
}
