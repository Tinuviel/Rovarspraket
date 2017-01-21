package Rovarspraket;
import java.io.*;

/**
 * Omvandlar en String till rövarspråket
 * @author Lovisa Colérus
 * 2014-11-08
 */
public class Rovarspraket {
    
    /**
     * Läser in en text som användaren ger och skriver ut den i rövarspråket
     * @param args 
     */
    public static void main(String[] args) {
        
        String svar;
        String text;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            System.out.println("Skriv in din text: ");
             
            try{
                text = in.readLine();
            }catch(Exception e){
                System.out.println("Du får inte" + e);
                text = null;
            }
            
            Omvandling.omvandlingR(text);
            System.out.println("Vill du skriva in en ny text? y/n ");
            
            try{       
                svar = in.readLine();
            }catch(Exception e){
                svar = null;
            }
            
        }while(svar.equals("y"));
    }
}
