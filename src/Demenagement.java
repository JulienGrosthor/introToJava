//public class Demenagement {
//    public static void main(String[] args) {
//        int allBoxes = 34;
//        int truckCapacity = 9;
//
//        while (truckCapacity < 34) {
//            System.out.println(truckCapacity);
//            truckCapacity = truckCapacity + 9;
//        }
//        System.out.println("Déménagement terminé!");
//    }
//}

public class Demenagement {
    public static void main(String[] args) {
        int startingBoxes = 34;
        int allBoxes = 34;
        int truckCapacity = 9;
        int tripsMade = 0;

        while(allBoxes >= truckCapacity) {
            allBoxes = allBoxes - truckCapacity;
            tripsMade++;
            System.out.println("Truck trip! \n Remaining boxes = " + allBoxes);
        }

        if (allBoxes <= truckCapacity) {
            allBoxes -= allBoxes;
            tripsMade++;
            System.out.println("Last truck trip! \n Remaining boxes = " + allBoxes);
        }
        System.out.println("Number of trips = " + tripsMade + " \n Amount of boxes = " + startingBoxes);
    }
}