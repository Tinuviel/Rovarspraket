/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovarspraket;

/**
 * Omvandlar strängar till ett annat "språk", just nu 
 * finns endast rövarspråket som alternativ
 * @author Lovisa Colérus
 * 2014-11-08
 */
public class Omvandling {
    
    /**
     * Tar in en String som vi vill omvandla till rövarspråket
     * och skriver ut den i rövarspråket
     * @param s är en String vi vill omvandla 
     */
    public static void omvandlingR(String s){
        char[] textArray = s.toCharArray();
        for(int i = 0; i<textArray.length; i++)
        {
            char c = textArray[i];
            if(Typ.konsonant(c))
            {
                System.out.print(c + "o" + c);
            }else{
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
