package Alunos;

public class Aluno {
private	String nome;
private	 int cpf;
private	 String cursos;
private Endereco Endereco;
	 
	 
	public Aluno() {
}
	
	public Aluno(String dados) {
	//	System.out.println(dados);
		dados.split(",");
		String[] atributos = dados.split(",");
		
		String[] nome = atributos[1].split("=");
		String[] cpf = atributos[2].split("=");
		String[] curso = atributos[3].split("=");
		Endereco enderecoAluno = new Endereco(atributos);
		this.nome = nome[1].trim();
		this.cpf =  Integer.parseInt(cpf[1].trim()) ;
		this.cursos = curso[1].trim();
		this.Endereco = enderecoAluno;
		
	}
	@Override
	public String toString() {
		return "Alunox, Nome =" + nome + ", cpf=" + cpf + ", cursos=" + cursos + ", Endereco=" + Endereco;
	}

	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return Endereco;
	}
	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
	
	
	
}