import java.io.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Joc amb la funcio random
 */
public class RandGame {
	
    public static void main (String args[]) throws IOException {
        int num1, num2, num3, avan, premi, credit;
        String boto, start, inputCredit;
        boolean validacio;
        premi = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();
        
        //Espai en blanc 6 salts
        for (int i=0; i<6; i++){
            System.out.println("");   
        }
        System.out.print("#########################\n#                       #\n#     DAM1 RandGame     #\n#                       #\n#########################\n"
                + "Els premis son:\n"
                + "Per un trio |x|x|x| son 250€\n"
                + "Per una parella |x|x|y| o |y|x|x| son 20€\n"
                + "Per un 7 |7|x|y| o |x|y|7| es 1€\n"
                + "Escriu \"s\" per jugar: ");
        start = r.readLine();
        if (start.equals("s") || start.equals("S")){
            validacio = true;
            System.out.print("Introdueix el teu credit(cada ronda gastaras 1€): ");
			inputCredit = r.readLine();
			credit = Integer.parseInt(inputCredit);
        }   
        else{
            validacio = false;
            credit = 0;
        }
        
        //S'inicia el joc
        while(validacio == true && credit > 0){
            credit--;
            num1 = rnd.nextInt(9);
            num2 = rnd.nextInt(9);
            num3 = rnd.nextInt(9);
            avan = rnd.nextInt(5);
            
            //------- Espai d'espera -------
            try{
				//Espai en blanc 17 salts
				for (int i=0; i<17; i++){
					System.out.println("");
				}
				System.out.println("Calculant la tirada...");
				//Espai en blanc 5 salts
				for (int i=0; i<5; i++){
					System.out.println("");
				}
				Thread.sleep(1000);
            } 
				catch(InterruptedException ex) 
			{Thread.currentThread().interrupt();}
            //------------------------------
            
            //Espai en blanc 15 salts
            for (int i=0; i<15; i++){
                System.out.println("");   
            }
            System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(avan)+"| #\n#  -------         #\n#                  #\n####################");
            premi = 0;
            if (num1 == num2 || num2 == num3){
				if(avan > 0){
                    System.out.println("Tens 2 numeros iguals, vols continuar o sortir (0 per sortir)");
                    premi = 5;
                }
                else{
                    premi = 5;
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
            if (num1 == num2 && num1 == num3){
                System.out.println("Tenim un guanyador");
                premi = 15;
            }    
            else{
                
                //Avanços
                while(avan > 0){
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
                                try{
									//Espai en blanc 17 salts
									for (int i=0; i<17; i++){
										System.out.println("");
									}
									System.out.println("Recalculant la Primera cassella...");
									//Espai en blanc 5 salts
									for (int i=0; i<5; i++){
										System.out.println("");
									}
									Thread.sleep(1000);
                                } 
									catch(InterruptedException ex) 
								{Thread.currentThread().interrupt();}
                                //------------------------------
                                
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(--avan)+"| #\n#  -------         #\n#                  #\n####################");
                                break;
                                
                            case "2":
                                num2 = rnd.nextInt(9);
                                
                                //------- Espai d'espera -------
                                try{
									//Espai en blanc 17 salts
									for (int i=0; i<17; i++){
										System.out.println("");
									}
									System.out.println("Recalculant la Segona cassella...");
									//Espai en blanc 5 salts
									for (int i=0; i<5; i++){
										System.out.println("");
									}
									Thread.sleep(1000);
                                } 
									catch(InterruptedException ex) 
								{Thread.currentThread().interrupt();}
                                //------------------------------
                                
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(--avan)+"| #\n#  -------         #\n#                  #\n####################");
                                break;
                                
                            case "3":
                                num3 = rnd.nextInt(9);
                                
                                //------- Espai d'espera -------
                                try{
									//Espai en blanc 17 salts
									for (int i=0; i<17; i++){
										System.out.println("");
									}
									System.out.println("Recalculant la Tercera cassella...");
									//Espai en blanc 5 salts
									for (int i=0; i<5; i++){
										System.out.println("");
									}
									Thread.sleep(1000);
                                } 
									catch(InterruptedException ex) 
								{Thread.currentThread().interrupt();}
                                //------------------------------
                                
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(--avan)+"| #\n#  -------         #\n#                  #\n####################");
                                break;
                                
                            case "0":
                                avan = 0;
                                break;
                            default:
                                //Espai en blanc 15 salts
                                for (int i=0; i<15; i++){
                                    System.out.println("");
                                }
                                System.out.println("No tenim l'opció "+boto+", intradueix un valor correcte siusplau.");
                                System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(avan)+"| #\n#  -------         #\n#                  #\n####################");
                        }
                        if (num1 == num2 && num1 == num3){
                            System.out.println("Tenim un guanyador");
                            avan = 0;
                            //Espai en blanc 15 salts
                            for (int i=0; i<15; i++){
                                System.out.println("");
                            }
                            System.out.println("####################\n#                  #\n#  -------         #\n# ||"+num1+"|"+num2+"|"+num3+"|| -> |"+(avan)+"| #\n#  -------         #\n#                  #\n####################");
                            premi = 15;
                        }
                        else if(num1 == num2 || num2 == num3){
                            if(avan > 0){
                                System.out.println("Tens 2 numeros iguals, vols continuar o sortir (0 per sortir)");
                                premi = 5;
                            }
                            else{
                                premi = 5;
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
                }
            //Es mostra el premi de la partida
            System.out.println("Has guanyat "+premi+"€");
            }
        //Es demana per tornar a jugar
        credit += premi;
        
        //Espai en blanc 3 salts
        for (int i=0; i<3; i++){
            System.out.println("");
        }
        System.out.print("El teu credit es de "+credit+"€\n"+"(presiona <enter> per tornar a Tirar o escriut \"x\" per Sortir): ");
        start = r.readLine();
        if (start.equals("x") || start.equals("X")){
            validacio = false;
        }
        else if(credit == 0){
			validacio = false;
			//Espai en blanc 21 salts
            for (int i=0; i<21; i++){
                System.out.println("");
            }
			System.out.println("T'has quedat sense credit, mala sort!\n-------------------------------------\n");
		}
        }
        //Fi del joc
        //Espai en blanc 7 salts
        try{
		Thread.sleep(2000);
        for (int i=0; i<9; i++){
            System.out.println("");
        }
        System.out.println("###### ###    ###### #    #\n"
						+  "#    # #   #  #      #    #\n"
						+  "###### #    # #####  #    #\n"
						+  "#    # #   #  #      #    #\n"
						+  "#    # ###    ###### ######");
        //Espai en blanc 8 salts
        for (int i=0; i<5; i++){
            System.out.println("");
        }
		} 
		catch(InterruptedException ex) 
		{Thread.currentThread().interrupt();}
    }
}
