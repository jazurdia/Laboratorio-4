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
	public int menuCarros(){
		int op=0;
				try{
			String s = "¿Que clase de carro tiene?\n" +
					"1. Carro de clase S\n" +
					"2. Carro de clase A\n" +
					"3. Carro de clase C\n" +
					"4. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

			/*Metodo para elegír una opción
	@return número de opción
	*/
	public int menuModo(){
		int op=0;
				try{
			String s = "¿Que modo desea utilizar?\n" +
					"1. Modo Radio\n" +
					"2. Modo Reproduccion\n" +
					"3. Modo telefono\n" +
					"4. Modo productividad\n"+
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	
			/*Metodo para elegír una opción
	@return número de opción
	*/
	public int menuModoRadio(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Cambiar emisora\n" +
					"2. Guardar emisora\n" +
					"3. Cargar emisora\n" +
					"4. Cambiar entre AM/FM\n"+
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

			/*Metodo para elegír una opción
	@return número de opción
	*/
	public int menuModoReproduccion(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Seleccionar lista de reproduccion\n" +
					"2. Cambiar cancion\n" +
					"3. Escuchar cancion\n" +
					"4. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	public int menuModoTelefonoS(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Conectar/desconectar telefono\n" +
					"2. Mostrar contactos\n" +
					"3. Llamar a contacto\n" +
					"4. Finalizar llamada\n"+
					"4. Cambiar a bocinas o auriculares\n"+
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	public int menuModoTelefonoA(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Conectar/desconectar telefono\n" +
					"2. Mostrar contactos\n" +
					"3. Llamar a contacto\n" +
					"4. Finalizar llamada\n"+
					"4. Llamar al ultimo contactocon el que se habló\n"+
					"5. Salir\n";

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

	public int menuModoTelefonoC(){
		int op=0;
				try{
			String s = "¿Que desea hacer?\n" +
					"1. Conectar/desconectar telefono\n" +
					"2. Mostrar contactos\n" +
					"3. Llamar a contacto\n" +
					"4. Finalizar llamada\n"+
					"4. Cambiar a llamada en espera \n"+
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
