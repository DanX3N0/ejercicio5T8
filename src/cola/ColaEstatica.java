package cola;

public class ColaEstatica {

	//Tamaño por defecto
	public int tamañoPorDefecto = 7;
	//Punteros
	public int inicio = 0;
	public int fin = 0;
	//Arreglo
	public String[] arregloCola;
	
	//Constructor sin parametros
	public ColaEstatica() {
		arregloCola = new String[tamañoPorDefecto];
	}
	//Sobrecarga del constructor
	public ColaEstatica(int nuevoTamaño) {
		arregloCola = new String[nuevoTamaño];
	}
	
	//METODOS
	//PUSH
	public void push(String elementoAInsertar) {
		arregloCola[fin] = elementoAInsertar;
		fin = fin + 1;
	}
	//POP()
	public String pop() {
		String valorDevuelto = "";
		valorDevuelto = arregloCola[inicio];
		inicio = inicio + 1;
		return valorDevuelto;
	}
	//Empty()
	public boolean empty() {
		if(inicio == fin)
			return true;
		return false;
	}
	//FULL()
	public boolean full() {
		if(fin == arregloCola.length)
			return true;
		return false;
	}
	
}


