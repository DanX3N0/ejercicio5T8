package cola;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		PilaEstatica pila = new PilaEstatica(n);
		ColaEstatica cola = new ColaEstatica(n);
		//Insercion
		while(!pila.full()) {
			String dato = sc.nextLine();
			pila.push(dato);
		}
		//Recuperacion de datos
		while(!pila.empty()) {
			String letra = pila.pop();
			letra = letra.toUpperCase();
			cola.push(letra);
		}
		//Mostramos la cola estatica
		while(!cola.empty()) {
			System.out.print(cola.pop() + " ");
		}

	}

}
