/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import logica.CapturaTeclado;
import logica.EjemploCondicional;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] Args) {
        
        CapturaTeclado ct = new CapturaTeclado();
        EjemploCondicional ec = new EjemploCondicional();
        System.out.println("Ejemplo de captura:");
        ct.operacion();
        System.out.println("Ejemplo Condicional:");
        ec.operacion();
    }
}
