/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bocal
 */
public class Validar {
    Pattern pat;
    Matcher mat;
    public boolean letras(String cadena){
        boolean correcto;
        pat=Pattern.compile("^[a-zA-Z\\s]*$");
        mat=pat.matcher(cadena);
        if(mat.matches()){
            correcto=true;
        }else{
            correcto=false;
        }
        return correcto;
    }
    public boolean numeros(String cadena){
        boolean correcto;
        pat=Pattern.compile("^\\d+$");
        mat=pat.matcher(cadena);
        if(mat.matches()){
            correcto=true;
        }else{
            correcto=false;
        }
        return correcto;
    }
}
