package main.java.com.devoteam.VehicleApplication;

import main.java.com.devoteam.VehicleApplication.service.VehicleApplicationLogic;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehicleApplication {

    public static void main(String[] args) {

        Scanner inputForSwitchMenu = new Scanner(System.in);
        Logger logger = Logger.getLogger(VehicleApplication.class.getName());
        boolean looping = true;
        VehicleApplicationLogic vehicleApplicationLogic = new VehicleApplicationLogic();

        while (looping) {

            vehicleApplicationLogic.menuLogic();
            int automakerMenuChoice = inputForSwitchMenu.nextInt();

            switch (automakerMenuChoice) {
                case 1 -> vehicleApplicationLogic.switch1Logic();
                case 2 -> vehicleApplicationLogic.switch2Logic();
                case 3 -> vehicleApplicationLogic.switch3Logic();
                case 4 -> vehicleApplicationLogic.switch4Logic();
                case 5 -> vehicleApplicationLogic.switch5Logic();
                case 6 -> vehicleApplicationLogic.switch6Logic();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Please, select on of the above options");
            }

            boolean gettingAnswerFromUser = true;
            while (gettingAnswerFromUser) {
                Scanner inputForChooseToContinueMenu = new Scanner(System.in);

                System.out.println("\nDo you wish to continue? \n");
                System.out.println("1. Yes");
                System.out.println("2. No");

                int chooseToContinue = inputForChooseToContinueMenu.nextInt();
                boolean continuingApplication = chooseToContinue == 1;
                boolean quittingApplication = chooseToContinue == 2;

                if (continuingApplication) {
                    gettingAnswerFromUser = false;
                } else if (quittingApplication) {
                    gettingAnswerFromUser = false;
                    looping = false;
                } else {
                    logger.log(Level.INFO, "Please pick a valid option");
                }

            }

        }

    }

}