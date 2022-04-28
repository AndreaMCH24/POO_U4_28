/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


/**
 *
 * @author Juana García
 */
import POL.*;


public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar 
         //sin acceder al poli
         
         //accediendo al poli
         EmpleadoAsalariado EA= new EmpleadoAsalariado("Andrea","Morales","QW8",5000000);
         System.out.println("\nEMPELADO ASALARIADO\n"+EA.toString());
         ////////////////////////////////////////////////////////////////////////////////
         EmpleadoPorHoras EH= new EmpleadoPorHoras("Andrea","Morales","QW8",5000000,6);
         System.out.println("\nEMPLEADO POR HORAS\n"+EH.toString());
         ///////////////////////////////////////////////////////////////////////////////
         EmpleadoPorComision EC= new EmpleadoPorComision("Andrea","Morales","QW8",21,.5);
         System.out.println("\nEMPLEADO POR COMISION\n"+EC.toString()); 
       }
    }
    

