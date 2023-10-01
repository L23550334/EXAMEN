/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fdp.exa.pkg1.pkg8;
import java.util.Scanner;
/**
 *
 * @author mac
 */
public class FDPEXA18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LUIS ADALBERTO MARISCAL ROMERO 
        //FORMULA PARA HIPÉRBOLA en HORIZONTAL
        Scanner cap=new Scanner(System.in);
        double h,k,a,b,c,Vx1,Vx2,Fx1,Fx2;
        
        System.out.println("Ingresa las coordenas del centro(h,k): ");
        h=cap.nextDouble();
        k=cap.nextDouble();
        
        System.out.println("Ingresa el valor del divisor “a“: ");
        a=cap.nextDouble();
        System.out.println("Ingresa el valor del divisor “b“: ");
        b=cap.nextDouble();
        
        c=((Math.pow( (Math.pow(a,2))+(Math.pow(b,2)),.5)));
        
       
       
        //Vertices
        Vx1=(h+a);
        Vx2=h-a;
        
        //Focos
        Fx1=(h+c);
        Fx2=(h-c);
        
        System.out.println("La distanica del centro al Foco es de: "+c);
        System.out.println("Las Coordenadas de los vertices son:");
        System.out.println("V1(" + Vx1 + ", " + k + ")");
        System.out.println("V2(" + Vx2 + ", " + k + ")");
        System.out.println("Las Coordenadas de los Focos son:");
        System.out.println("F1(" + Fx1 + ", " + k + ")");
        System.out.println("F2(" + Fx2 + ", " + k + ")");
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
