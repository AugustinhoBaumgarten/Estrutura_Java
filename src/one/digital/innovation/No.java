package one.digital.innovation;

public class No {
	

	private int dado;
	private No refNo = null;
	
	
	public int getDado() {
		return dado;
	}


	public void setDado(int dado) {
		this.dado = dado;
	}


	public No getRefNo() {
		return refNo;
	}


	public void setRefNo(No reNo) {
		this.refNo = reNo;
	}


	public No() {
	}
	
	
	public No(int dado) {
		this.dado = dado;
	}



	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}


	
}
