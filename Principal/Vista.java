package Principal;
/***************************************************
Vista.java
Autor: Diego Morales, Javier Azurdia
Fecha: 15/11/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
public class Vista{
	private Scanner scan;
    /*Costructor de clase*/
	public Vista(){
		scan = new Scanner(System.in);
	}
    public void show(String txt){
        System.out.println(txt);
    }

     /*Metodo para elegír una opción
  @return número de opción
  */
	public int menuOpciones(){
		int op=0;
				try{
			String s = "¿Que deseas hacer?\n" +
					"1. \n" +
					"2. \n" +
					"3. \n" +
                    "4. \n" +
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

    /*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a) a QueOndaMano!");
	}

	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Has elegido una opción inválida.");
	}

	/*Metodo para mostrar mensaje
	*/
    public void error(){
        System.out.println("Ha ocurrido un error");
      }


}
