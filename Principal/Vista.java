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

	public int Emisora() {
		int emisora=0; 
		try{
			System.out.println("Ingrese la emisora deseada");
			emisora=scan.nextInt(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return emisora; 
	}

	public int PlayList() {
		int playlist=0; 
		try{
			String s = "¿Que desea hacer?\n" +
					"1. Playlist 1\n" +
					"2. Playlist 2\n" +
					"3. Playlist 3\n"; 
			System.out.println(s);
			playlist=scan.nextInt(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return playlist; 
	}

	public int Cancion() {
		int canion=0; 
		try{
			System.out.println("Ingrese el numero de cancion que desea escuchar");
			canion=scan.nextInt(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return canion; 
	}

	public int  Contacto() {
		int cel=0; 
		try{
			System.out.println("Ingrese el numero del contacto que desea llamara");
			cel=scan.nextInt(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return cel; 
	}


	public boolean AM_FM() {
		boolean estado=false;  
		int op=0; 
		try{
			String s = "¿Que frecuencia desea utilizar?\n" +
					"1. AM\n" +
					"2. FM\n"; 
			System.out.println(s);		
			op=scan.nextInt(); 
			if(op==1){
				estado=true; 
			}else{

			}
		}catch (Exception e){
			error();
			scan.next();
		}		
		return estado; 
	}

	public boolean telefono_auriculares() {
		boolean estado=false;  
		int op=0; 
		try{
			String s = "Selecciones una opcion\n" +
					"1. Bocinas\n" +
					"2. Auriculares\n"; 
			System.out.println(s);		
			op=scan.nextInt(); 
			if(op==1){
				estado=true; 
			}else{

			}
		}catch (Exception e){
			error();
			scan.next();
		}		
		return estado; 
	}

	
	public boolean conexion() {
		boolean estado =false;  
		int op=0; 
		try{
			String s = "¿Desea conectar su telefono?\n" +
					"1. Si\n" +
					"2. No\n"; 
			System.out.println(s);		
			op=scan.nextInt(); 
			if(op==1){
				estado=true; 
			}else{

			}
		}catch (Exception e){
			error();
			scan.next();
		}		
		return conexion(); 
	}

	public String Origen() {
		String origen=""; 
		try{
			System.out.println("Ingrese el punto de origen");
			origen=scan.next(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return origen; 
	}
	
	public String Destino() {
		String Destino=""; 
		try{
			System.out.println("Ingrese el punto de destino");
			Destino=scan.next(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return Destino; 
	}

	public String Fecha() {
		String fecha=""; 
		try{
			System.out.println("Ingrese la fecha del viaje");
			fecha=scan.next(); 
		}catch (Exception e){
			error();
			scan.next();
		}		
		return fecha; 
	}

    /*Metodo para mostrar mensaje de despedida al usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a)!");
	}

	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Has elegido una opción inválida.");
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void AM_FM(String modo){
		System.out.println("La radio cambio a modo "+modo);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void CambiarEmisora(Double emisora){
		System.out.println("La emisora actual es "+emisora);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void GuardarEmisora(){
		System.out.println("Se ha guardado la emisora");
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void CargarEmisora(double emisora){
		System.out.println("Se ha cargado la emisora "+emisora);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void Conectar_desconectarTelefono(boolean estado){
		if(estado==true){
			System.out.println("Se ha conectado el telefono");
		}else{
			System.out.println("Se ha desconectado el telefono");
		}

	}

		/*Metodo para mostrar mensaje al usuario
	*/
	public void CambiarCancion(){
		System.out.println("Se ha cambiado la cancion");
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void LlamarContacto(String contacto){
		System.out.println("Se esta llamando a "+contacto);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void FinalizarLlamada(){
		System.out.println("Se ha finalizado la llamada");
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void LlamadaEnEspera(){
		System.out.println("La llamada esta en espera");
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void LlamarUltimoContacto(String contacto){
		System.out.println("Se esta llamando a "+contacto);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void ViajePlanificado(String origen, String destino, String fecha){
		System.out.println("Se ha planificado su viaje desde" +origen+" hacia "+destino+" en la fecha: "+fecha);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void PronnosticoClima(String pronostico){
		System.out.println("El pronostico del climas es: "+pronostico);
	}

	/*Metodo para mostrar mensaje al usuario
	*/
	public void Bocinas_auriculares(boolean estado){
		if(estado==true){
			System.out.println("Se ha cambiado la entrada de audio a bocinas");
		}else{
			System.out.println("Se ha cambiado la entrada de audio a auriculares");
		}
	}
	/*Metodo para mostrar mensaje
	*/
    public void error(){
        System.out.println("Ha ocurrido un error");
      }


}
