/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovarspraket;

/**
 * En klass som bestämmer typen på bokstäverna, dvs ifall de är vokaler eller
 * konsonanter
 * @author Lovisa Colérus
 * 2014-11-08
 */
public class Typ {
    
     /**
      * Kollar om vår char är en vokal
      * @param tecken är en char vi tar in
      * @return ifall tecken är en vokal
      */
    public static boolean vokal(char tecken){
	String vokaler = "AEIOUYÅÄÖaeiouyåäö";
        boolean a;
	if (vokaler.indexOf(tecken) > -1)
        {
	    a = true;
        }else{
	    a = false;
        }
        return a;
    }
    
    /**
     * Kollar om vår char är en konsonant
     * @param tecken är en char vi tar in
     * @return ifall tecken är en konsonant
     */
    public static boolean konsonant(char tecken){
	String konsonanter = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz";
	boolean a;
	if(konsonanter.indexOf(tecken) > -1)
        {
	    a = true;
        }else{
	    a = false;
        }
        return a;
    }
}
