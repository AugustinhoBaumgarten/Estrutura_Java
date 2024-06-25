package one.digitalinnovation;

public class ListaEncadeada<T> {
	
	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	public void add(T conteudo) {
		No<T>  novoNo = new<>(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		No<T> noAuxiliar = referenciaEntrada;
		for (int i =0; i < this.size()-1; i++)
			noAuxiliar = noAuxiliar.getProximoNo();
	}
	
<<<<<<< HEAD
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		if(index >= size()) {
			int ultimoIndice = size() -1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " desta lista. Esta lista só vai até o indice " + ultimoIndice + '.');
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i < this.size()-1; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
=======
	noAuxiliar.setProximoNo(novoNo);
>>>>>>> d7f2054a4f7137e88e8b98d24a706dc9c3bddae5
	public int size(){
		int tamanhoLista = 0;
		
		No<T> referenciaAux = referenciaEntrada;
		
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				}
			}else {
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
		int ultimoIndice = size() -1;
		throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " desta lista. Esta lista só vai até o indice " + ultimoIndice + '.');
	}
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null? true : false;
	}
}
