public class Resposta {

	private String resposta;
	private boolean correto;

	public Resposta(String resposta, boolean correto) {
		super();
		this.resposta = resposta;
		this.correto = correto;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public boolean isCorreto() {
		return correto;
	}

	public void setCorreto(boolean correto) {
		this.correto = correto;
	}

	@Override
	public String toString() {
		return this.resposta;
	}

}
