package projetomodulo;

public abstract class classeMaezona {
	// Atributos
	protected String Imagem;
	
	// M�todos
	public abstract void tipoAnimal();
	public abstract void barulhoBicho();
	
	public String getImagem(String imagem) {
		return Imagem;
	}
	public void setImagem(String imagem) {
		Imagem = imagem;
	}

}

