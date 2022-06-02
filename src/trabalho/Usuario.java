package trabalho;

public class Usuario {
	private String aluno;
	private String chamada;
	
	public Usuario() {
	}
	
	public Usuario(String aluno, String chamada) {
		this.aluno = aluno;
		this.chamada = chamada;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getChamada() {
		return chamada;
	}

	public void setChamada(String chamada) {
		this.chamada = chamada;
	}

	@Override
	public String toString() {
		return "Usuario [aluno=" + aluno + ", chamada=" + chamada + "]";
	}
}
