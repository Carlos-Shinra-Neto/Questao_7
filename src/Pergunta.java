public class Pergunta {

	private String pergunta;
	private Resposta[] respostas;

	public Pergunta(String pergunta, Resposta... respostas) {
		super();
		this.pergunta = pergunta;
		this.respostas = respostas;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public Resposta[] getRespostas() {
		return respostas;
	}

	public void setRespostas(Resposta... respostas) {
		this.respostas = respostas;
	}

	@Override
	public String toString() {
		return pergunta;
	}
}
