import java.io.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Joc amb la funcio random
 */
public class Test {
    public static void main (String args[]) throws IOException {
        int num1, num2, num3, avan, premi;
        String boto, start;
        boolean validacio;
        premi = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();
        
        //Espai en blanc 5 salts
        for (int i=0; i<5; i++){
            System.out.println("");   
        }
        System.out.print("-------------------------\n     DAM1 RandGame\n-------------------------\n"
                + "Els premis son:\n"
                + "Per un trio |x|x|x| son 250€\n"
                + "Per una parella |x|x|y| o |y|x|x| son 20€\n"
                + "Per un 7 |7|x|y| o |x|y|7| es 1€\n"
                + "Escriu \"s\" per jugar: ");
        start = r.readLine();
        if (start.equals("s") || start.equals("S")){
            validacio = true;
        }   
        else{
            validacio = false;
        }
        
        //S'inicia el joc
        while(validacio == true){
            num1 = rnd.nextInt(9);
            num2 = rnd.nextInt(9);
            num3 = rnd.nextInt(9);
            avan = rnd.nextInt(5);
            //Espai en blanc 15 salts
            for (int i=0; i<15; i++){
                System.out.println("");   
            }
            System.out.println(" -------\n||"+num1+"|"+num2+"|"+num3+"||\n -------");
            if (num1 == num2 && num1 == num3){
                System.out.println("Tenim un guanyador");
                premi = 250;
            }    
            else{
                
                //Avanços
                while(avan > 0){
                    try {
                        System.out.print("Tens "+avan+" avanços\n"
                                + "Escriu \"1\" per tirar a la Primera cassella\n"
                                + "Escriu \"2\" "+ "per tirar a la Segona cassella\n"
                                + "Escriu \"3\" per tirar a la Tercera cassella\n"
                                + "Escriu \"0\" per per no tirar i gastar tots els avanços\n"
                                + "A quina cassella tires?: ");
                        boto = r.readLine();
                        switch (boto){
                            case "1":
                                num1 = rnd.nextInt(9);
                                //------- Espai d'espera -------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("Recalculant la Primera cassella");
                                //Espai en blanc 4 salts
                                for (int i=0; i<4; i++){
                                    System.out.println("");
                                }
                                TimeUnit.SECONDS.sleep(1);
                                //------------------------------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println(" -------\n||"+num1+"|"+num2+"|"+num3+"||\n -------");
                                avan--;
                                break;
                                
                            case "2":
                                num2 = rnd.nextInt(9);
                                //------- Espai d'espera -------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("Recalculant la Segona cassella");
                                //Espai en blanc 4 salts
                                for (int i=0; i<4; i++){
                                    System.out.println("");
                                }
                                TimeUnit.SECONDS.sleep(1);
                                //------------------------------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println(" -------\n||"+num1+"|"+num2+"|"+num3+"||\n -------");
                                avan--;
                                break;
                                
                            case "3":
                                num3 = rnd.nextInt(9);
                                //------- Espai d'espera -------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("Recalculant la Tercera cassella");
                                //Espai en blanc 4 salts
                                for (int i=0; i<4; i++){
                                    System.out.println("");
                                }
                                TimeUnit.SECONDS.sleep(1);
                                //------------------------------
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println(" -------\n||"+num1+"|"+num2+"|"+num3+"||\n -------");
                                avan--;
                                break;
                                
                            case "0":
                                avan = 0;
                            default:
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("No tenim l'opció "+boto+", intradueix un valor correcte siusplau.");
                                System.out.println(" -------\n||"+num1+"|"+num2+"|"+num3+"||\n -------");
                        }
                        if (num1 == num2 && num1 == num3){
                            System.out.println("Tenim un guanyador");
                            avan = 0;
                            premi = 250;
                        }
                        else if(num1 == num2 || num2 == num3){
                            if(avan > 0){
                                System.out.println("Tens 2 numeros iguals, vols continuar o sortir (0 per sortir)");
                                premi = 20;
                            }
                            else{
                                premi = 20;
                            }
                        }
                        else if(num1 == 7 || num3 == 7){
                            if(avan > 0){
                                System.out.println("Tens un 7, vols continuar o sortir (0 per sortir)");
                                premi = 1;
                            }
                            else{
                                premi = 1;
                            }
                        }
                        else{
                            premi = 0;
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            System.out.println("Has guanyat "+premi+"€");
            }
        //Es demana per tornar a jugar
        System.out.print("(escriu \"s\" per tornar a jugar o \"q\" per sortir): ");
        start = r.readLine();
        if (start.equals("q") || start.equals("Q")){
            validacio = false;
        }
        }
        System.out.println("Adeu");
    }
}

