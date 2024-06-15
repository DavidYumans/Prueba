import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner numero=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1=numero.nextInt();
        System.out.println("Ingrese el Segundo numero: ");
        int num2=numero.nextInt();
        System.out.println("Ingrese un tercer numero: ");
        int num3=numero.nextInt();

        NumeroMayor leer=new NumeroMayor(num1, num2, num3);
        int mayor= leer.ejercicio1();

        System.out.println("El numero mayor es: "+mayor);

    }
}