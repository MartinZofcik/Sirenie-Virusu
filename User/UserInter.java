package User;

import Disease.Disease;
import Disease.Covid19;
import Disease.HIV;
import Disease.Flu;
import Population.Population;
import SpreadModel.Sir;
import SpreadModel.Sirf;

import java.util.Scanner;

public class UserInter {

    public UserInter() {
    }

    public void setDisease() {
        System.out.println("Vyber si chorobu/virus: 1.) Covid19 2.) HIV 3.) Chripka");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {
            Disease disease = new Covid19();
        }
        if (choice == 2) {
            Disease disease = new HIV();
        }
        if (choice == 3) {
            Disease disease = new Flu();
        }
    }

    public void setPopulationAndModel(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadaj pocet vnimavych ludi: ");
        int numS = scan.nextInt();
        System.out.println("Zadaj pocet nakazenych ludi: ");
        int numI = scan.nextInt();
        System.out.println("Zadaj pocet uzdravenych/mrtvych ludi: ");
        int numR = scan.nextInt();
        System.out.println("Zadaj populaciu: ");
        int numN = scan.nextInt();

        System.out.println("Vyber si model: 1.) SIR 2.) SIRF");
        int numMod = scan.nextInt();
        if (numMod == 1) {
            Sir model = new Sir();
            Population population = new Population(numS, numI, numR, numN);
        }
        else {
            System.out.println("Vyber percento ockovanych: ");
            int numF = scan.nextInt();
            Sirf model = new Sirf(numF);
            Population population = new Population(numS, numI, numR, numN, numF);
        }
    }
}

