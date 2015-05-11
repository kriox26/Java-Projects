package prog3.arbol.binariobusqueda;

import prog3.lista.ListaEnlazadaGenerica;
import prog3.lista.simple.ListaDeEnterosEnlazada;

/**
 * @author Matias
 *
 */

public class ABBUtil{
	public ListaEnlazadaGenerica<ListaDeEnterosEnlazada> sumaCaminos(ArbolBinarioDeBusqueda<Integer> ABB, int valor){
		ListaEnlazadaGenerica<ListaDeEnterosEnlazada> lista = new ListaEnlazadaGenerica<ListaDeEnterosEnlazada>();
		ListaDeEnterosEnlazada lista2 = new ListaDeEnterosEnlazada();
		sumaCaminosRecu(ABB,lista2,lista,valor);
		return lista;
	}
	
	private void sumaCaminosRecu(ArbolBinarioDeBusqueda<Integer> abb, ListaDeEnterosEnlazada aux, ListaEnlazadaGenerica<ListaDeEnterosEnlazada> lista, int valor){
		if (valor - abb.getDatoRaiz() == 0) {
			aux.agregarFinal(abb.getDatoRaiz());
		}
		else {
			if (valor - abb.getDatoRaiz() > 0) {
				aux.agregarFinal(abb.getDatoRaiz());
				sumaCaminosRecu(abb.getHijoDerecho(), aux, lista, valor - abb.getDatoRaiz());
				sumaCaminosRecu(abb.getHijoIzquierdo(), aux, lista, valor - abb.getDatoRaiz());
				aux.eliminar(abb.getDatoRaiz());
			}
		}
		lista.agregarFinal(aux);
	}
}