package cola;

public class PilaEstatica {

	public Integer tope = -1;
	public String[] arregloPila;
	public Integer tamañoDefecto = 5;
	
	public PilaEstatica() {
		arregloPila = new String[tamañoDefecto];
	}
	public PilaEstatica(Integer tamaño) {
		arregloPila = new String[tamaño];
	}
	
	public void push(String dato) {
		tope = tope + 1;
		arregloPila[tope] = dato;
	}
	
	public String pop() {
		return arregloPila[tope--];
	}
	
	public boolean empty() {
		if(tope == -1)
			return true;
		return false;
	}
	
	public boolean full() {
		if(tope == arregloPila.length - 1)
			return true;
		return false;
	}
	
}
