/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 1.   
A. obviamente que ps como se muestra en el diagrama bulding fire tiene que 
heredar de Emergency ademas que el metodo create no puede ser private
B. si puede ser abstracta
C. si se puede
D. un metodo estatico no puede ser sobrescrito 
E. si es valido, se pueden invocar no mas los metodos de la clase padre osea de 
Incident
F. no es invalida bota error.

2.

1)correcta
2)correctA
3)incorrecta
4)incorrecto
5)incorrecto
6)incorrecto



*/
package parcialhardcore;
import static java.awt.PageAttributes.MediaType.A;
import java.io.*;
/**
 *
 * @author Estudiante
 */
public class ParcialHardcore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        PrintStream output= new PrintStream(new File("texto.txt"));
        sensor1 a = new sensor1(1,38,0,"a","01/01/2017","a","1-Tormenta Electrica") ; 
        sensor1 b = new sensor1(1,0,0,"a","01/01/2016","a","2-rayos") ; 
        
        output.println("Bogota");
        output.println(a.toString());
        output.println(b.toString());
        
    }
    
}
