/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author jc_ca
 */
public class Actividad11F {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         System.out.println("Bienvenido al sistema de área y perímetro de figuras!" );
        boolean s;
        do{
       try{
           showMenu();
           s = false;
       }catch (Exception e){
           System.out.println(e.getMessage());
           s = true;
       }


     }while(s==true); }
     private static int showMenu() throws IOException,Exception {
          int m;
          
          int opcion2 = 0;
    
    do{
        m = 0;
        boolean e = true;

System.out.println("Selecciona la figura con la que deseas trabajar");
System.out.println("1-Círculo"); 
System.out.println("2-Cuadrado");
System.out.println("3-Triángulo equilátero");
System.out.println("4-Rectángulo");
System.out.println("0-Salir");
 int opcion = Integer.parseInt(entrada.readLine());
 if(opcion ==1||opcion == 2||opcion == 3||opcion == 4){
System.out.println("Selecciona la propiedad a calcular:");
System.out.println("1-Área"); 
System.out.println("2-Perímetro");
System.out.println("0-Cancelar acción");
 opcion2= Integer.parseInt(entrada.readLine());
 }
   
 
 switch(opcion){
       case 0:
           System.out.println("Haz elegido salir");
          return 0 ;
          
        case 1:  
           
           double ci = circulo(opcion2);
   
           break;
           
           
        case 2:
        double c = cuadrado(opcion2);
           break;
            case 3:
            double t = triangulo(opcion2);
             
            
           break;
            case 4:
             double r = rectangulo(opcion2);
           break;
           
         default: 
             
         m = 1;
         e = false;
         throw new Exception("Opción de figura no válida, vuelva a intentarlo");
   }
           
   if(e ==true){
   System.out.println("Presione (1) para volver a elegir una opción del menú o cualquier otra para salir");
   int o =Integer.parseInt(entrada.readLine());
   if (o==1){
       m=1;
   }}
    }while(m==1);
        return 0;
         
     }
     //Método para calcular sobre el círculo
     private static double circulo(int opcion2) throws IOException,Exception {
     double r = 0;
     if(opcion2 ==1 || opcion2 ==2 ){
     System.out.println("Haz elegido el círculo");
     System.out.println("Introduce el radio del circulo");
     r = Integer.parseInt(entrada.readLine());
           }
     if(opcion2 ==0){
         System.out.println("Haz elegido cancelar opción"); 
         return 0;
     }
       
        Circle circle = new Circle(r);
    if (opcion2==1){
        System.out.println("Haz elegido el área"); 
        System.out.println("El área es : "+circle.getArea());
    }
    if (opcion2==2){
          System.out.println("Haz elegido el perímetro"); 
          System.out.println("El perímetro es : "+circle.getPerimetro());
    }
     if(opcion2!=1 && opcion2!=2){
          System.out.println("Seleccionaste una opción de cálculo inválida");
    }
    return 0;
   

}
    //Método para calcular sobre el cuadrado
private static double cuadrado(int opcion2) throws IOException,Exception {
    double l = 0;
    if(opcion2 ==1 || opcion2 ==2){
         System.out.println("Haz elegido el cuadrado");
         System.out.println("Introduce la medida de un lado del cuadrado");
         l = Integer.parseInt(entrada.readLine());
        }
    if(opcion2 ==0){
         System.out.println("Haz elegido cancelar opción");
         return 0;
     }
 
        Square square = new Square(l);
    if (opcion2==1){
        System.out.println("Haz elegido el área"); 
        System.out.println("El área es : "+square.getArea()); 
    }
    if (opcion2==2){
         System.out.println("Haz elegido el perímetro"); 
         System.out.println("El perímetro es : "+square.getPerimetro());
    }
     if(opcion2!=1 && opcion2!=2){
        System.out.println("Seleccionaste una opción de cálculo inválida");
    }
    return 0;
   

}
//Método para calcular sobre el Triángulo
private static double triangulo(int opcion2) throws IOException,Exception {
    double b= 0 ;
     if(opcion2 ==1 || opcion2 ==2){
         System.out.println("Haz elegido el triángulo");
         System.out.println("Introduce un lado del triángulo");
          }
         if(opcion2 ==0){
         System.out.println("Haz elegido cancelar opción"); 
         return 0;
     }
         b = Integer.parseInt(entrada.readLine());
     
         Triangle triangle = new Triangle(b);
    if (opcion2==1){
        System.out.println("Haz elegido el área"); 
        System.out.println("El área es : "+triangle.getArea()); 
    }
    if (opcion2==2){
         System.out.println("Haz elegido el perímetro"); 
         System.out.println("El perímetro es : "+triangle.getPerimetro());
    }
     if(opcion2!=1 && opcion2!=2){
        System.out.println("Seleccionaste una opción de cálculo inválida");
    }
    return 0;
  
 }
//Método para calcular sobre el rectángulo
private static double rectangulo(int opcion2) throws IOException,Exception {
    double h = 0;
    double br =0;
    if(opcion2 ==1 || opcion2 ==2){
     System.out.println("Haz elegido el rectángulo");
     System.out.println("Introduce el largo del rectángulo");
     br = Integer.parseInt(entrada.readLine());
     System.out.println("Introduce la altura del rectángulo");
     h = Integer.parseInt(entrada.readLine());
             }
    if(opcion2 ==0){
         System.out.println("Haz elegido cancelar opción"); 
         return 0;
     }
            
    
         Rectangle rectangle = new Rectangle(br,h);
    if (opcion2==1){
        System.out.println("Haz elegido el área"); 
        System.out.println("El área es : "+rectangle.getArea()); 
    }
    if (opcion2==2){
         System.out.println("Haz elegido el perímetro"); 
         System.out.println("El perímetro es : "+rectangle.getPerimetro());
    }
     if(opcion2!=1 && opcion2!=2){
        System.out.println("Seleccionaste una opción de cálculo inválida");
    }
    return 0;
   

}


}
