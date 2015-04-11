package prog3.arbol.binario.util;
import prog3.arbol.binario.*;
import prog3.lista.simple.*;
/**
 * @author Matias
 *
 */
public class Utiles<T> {
	public static int sumaVerticalMaxima(ArbolBinario<Integer> arb){
		if(arb.esHoja()){
			return arb.getDatoRaiz();
		}
		else{
			return arb.getDatoRaiz() + Math.max(sumaVerticalMaxima(arb.getHijoDerecho()),sumaVerticalMaxima(arb.getHijoIzquierdo()));
		}
	}
	
	public static ListaDeEnteros trayectoriaPesada(ArbolBinario<Integer> abinario){
		
	}
}
