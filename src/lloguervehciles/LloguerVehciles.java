/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lloguervehciles;

/**
 *
 * @author alber
 */
import java.util.Scanner;
import java.util.ArrayList;
public class LloguerVehciles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean sortida = false;
        
        while (sortida == false) {
            
        
        int menu = menu();
        
        
        switch (menu) {
            case 1:
                
                break;
            
            case 2:
                
                break;
                
                
            case 3:
                
                
                break;
                
            case 0:
                
                System.out.println("LloguerVehicles és un programa de [Albert Tubert]");
                sortida = true;
                
                break;
                
             
        }
        }
        
        
        
        
    }
    
    static ArrayList<Vehicles> llistatEconomic = new ArrayList<Vehicles>();
    static ArrayList<Vehicles> llistatUtilitari = new ArrayList<Vehicles>();
    static ArrayList<Vehicles> llistatSuv = new ArrayList<Vehicles>();
    static ArrayList<Vehicles> llistatTotTerreny = new ArrayList<Vehicles>();
    static ArrayList<Vehicles> llistatAutomatic = new ArrayList<Vehicles>();
    
   
    public static int menu(){
        Scanner lector = new Scanner(System.in);
        int menu;
        
            System.out.println("======= LloguerVehicles =======");
            System.out.println("1-Llogar vehicle");
            System.out.println("2-Tornar vehicle");
            System.out.println("0-Sortir");
            System.out.println("===============================");
            
            menu = lector.nextInt();
            lector.nextLine();
            
     return menu;     
    
}
    
    public static void llogarvehicles(){
        
        int menulloger = 0;
        
        System.out.println("Tipus");
        System.out.println("*******************");
        System.out.println("* 1-Econòmic (2) *");
        System.out.println("* 2-Utilitari (2) *");
        System.out.println("* 3-SUV (1) *");
        System.out.println("* 4-4x4 (1) *");
        System.out.println("* 5-Automàtic (1) *");
        System.out.println("* 0-Tornar a menú *");
        System.out.println("*******************");
        
        switch (menulloger) {
            case 1:
                
                break;
            
                
        }
    }
    
    
    
    
    
}
