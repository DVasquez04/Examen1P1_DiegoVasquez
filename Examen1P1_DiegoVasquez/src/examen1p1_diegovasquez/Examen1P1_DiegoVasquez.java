/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_diegovasquez;
import java.util.Scanner;
/**
 *
 * @author Diego Vasquez
 */
public class Examen1P1_DiegoVasquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("1.Suma binaria");
            System.out.println("2.Estrella de David");
            System.out.println("3.Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    int siu = 0;
                    int nou = 0;
                    System.out.println("Ingrese numero binario:");
                    String nums1 = lea.next().trim();
                    int char_int = 0;
                    for (int i = 0; i < nums1.length();i++){
                        char_int = nums1.charAt(i);
                        if(char_int<48 || char_int > 49){
                            siu +=1;
                        }
                    }
                    
                    System.out.println("Ingrese segundo numero binario:");
                    String nums2 = lea.next().trim();
                    int char_int2 = 0;
                    for (int i = 0; i < nums2.length();i++){
                        char_int2 = nums2.charAt(i);
                        if(char_int2<48 || char_int2 > 49){
                            nou += 1;
                        }
                    }
                    int bread = 0;
                    if(nums1.length() != nums2.length()){
                        System.out.println("Los numeros deben de tener el mismo número de bits.");
                        bread += 1;
                    }
                    if(siu > 0){
                        System.out.println("El primer numero contiene caracteres distintos de 0 y 1");
                        bread += 1;
                    }
                    if (nou > 0){
                        System.out.println("El segundo numero contiene caracteres distintos de 0 y 1");
                        bread += 1;
                    }
                    if(bread > 0){
                        break;
                    }
                    char top = '0';
                    char bot = '0';
                    char num_extra = '0';
                    String suma = "";
                    for(int i = nums1.length()-1;i>= 0;i--){
                        top = nums1.charAt(i);
                        bot = nums2.charAt(i);
                        if(top == '0'&&bot == '0'){
                            if(num_extra == '1'){
                                suma = '1'+suma;
                                num_extra = '0';
                            }else{
                                suma = '0'+suma;
                                num_extra = '0';
                            }
                        }else if((top == '1'&& bot=='0')||(top =='0'&&bot=='1')){
                            if(num_extra == '1'){
                                suma = '0'+suma;
                                num_extra = '1';
                            }else{
                                suma = '1'+suma;
                                num_extra = '0';
                            }
                        }else if(top=='1'&&bot=='1'){
                            if (num_extra == '1'){
                                suma = '0'+suma;
                                num_extra = '1';
                            }else{
                                suma = '0'+suma;
                                num_extra = '1';
                            }
                        }
                        
                    }
                    if(num_extra == '1'){
                        suma = '1'+suma;
                    }
                    System.out.println("La suma es: "+suma);
                }//fin case 1
                break;
                case 2:{
                    System.out.println("Ingrese un tamaño: ");
                    int tam = lea.nextInt();
                    while(tam < 9 || tam % 2 == 0){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9"+ "\n"+"intentelo denuevo:");
                        tam = lea.nextInt();
                    }
                    //x = lineas
                    //j = columnas
                    int alto = tam/2+2;
                    for (int x = 0; x < alto; x++){
                        for(int j = 0; j<tam;j++){
                            if(x<=0 && j<tam/2||x<=0 && j>tam/2){
                                System.out.print(" ");
                            }else if(x== 0 && j==tam/2){
                                System.out.print("+");
                            }//fin top part
                            if(x==1&&j<=tam){
                                System.out.print("*");
                            }//fin linea top
                            
                            if(x>=1&&x<tam/2+1&& x==j+1){
                                System.out.print("*");
                            }else if(x>1&&x<tam/2){
                                System.out.print(" ");
                            }
                            if(x>=1&&x<tam/2+1 && j==tam-x){
                                System.out.print("*");
                            }else{
                                System.out.print("");
                                
                            }
                            if(x==tam/2 &&j <= tam-2){
                                System.out.print("+");
                            }
                            if(x==tam/2+1&&j<=tam/2-1){
                                System.out.print(" ");
                            }else if(x==tam/2+1 &&j==tam/2){
                                System.out.print("*");
                            }
                        }//fin for interno
                        System.out.println("");
                    }//fin for externo
                    //OUT OF TIME SORRY
                }//fin case 2
                break;
                case 3:{
                    seguir = false;
                }//fin case 3
                break;
                default:{
                    System.out.println("Su opcion es invalida."+"\n"+"Intentelo de nuevo: ");
                }//fin default
                break;
            }//fin switch
        }//fin while
        // TODO code application logic here
    }//fin main
    
}//fin class
