package view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import Alunos.Aluno;

import Util.ListaDeAlunos;
import Alunos.Aluno;
public class mostrar {
	
	
	
	public static int viewMenuPrincipal(BufferedReader reader) throws NumberFormatException, IOException {
		
		System.out.println("1- para cadastro");
		System.out.println("2- para listar aluno");
		System.out.println("3- para exlucir");
		System.out.println("4- para sair");
	return Integer.parseInt(reader.readLine());
	}
	
	
	public static String[] ViewSalvarAluno(BufferedReader reader) throws IOException {
		
		String[] menuAluno = {"nome do aluno", "cpf", "Curso","endereço\n Rua","numero,","Bairro","Cidade","Estado", "Cep"};
		String[] dadosAluno = {"","","","","","","","",""};
		for(int i=0;i<menuAluno.length;i++) {
			System.out.println(menuAluno[i]);
			dadosAluno[i] = reader.readLine();
			
			
		}
		return dadosAluno;
	}
	
	public static int ViewMenuEditarOuDeletarAluno(String editar_deletar,BufferedReader reader) throws NumberFormatException, IOException {		

		for (int i = 0; i < ListaDeAlunos.getInstance().size(); i++)
			System.out.println(i + " - " + ListaDeAlunos.getInstance().get(i));

		System.out.println();
		System.out.println("Dentre a lista acima, escolha o indice do aluno que deseja "+ editar_deletar);
						
		return Integer.parseInt(reader.readLine());
	}
	

public static String[]  ViewOpcaoEdicao(BufferedReader reader) throws NumberFormatException, IOException {
	String dadosEdita[] = {"",""};
	
	System.out.println("Digite o que quer alterar");
	System.out.println("1- nome");
	System.out.println("2- curso");
	System.out.println("3- cpf");
	System.out.println("4- para Bairro");
	System.out.println("5- para Cep");
	System.out.println("6- para Cidade");
	System.out.println("7- Para Estado");
	System.out.println("8- para numero ");
	System.out.println("9- para rua");
	
	
	int op = Integer.parseInt(reader.readLine());
	dadosEdita[0] = Integer.toString(op);
	
	System.out.println("Escreva o novo valor do atributo");
	String edicao = reader.readLine();
	dadosEdita[1] = edicao;
	
	
	
	return dadosEdita;	
}

public static void ViewListaDeAlunosEditada() {
	
	for (Aluno a : ListaDeAlunos.getInstance()) {
		System.out.println("|-----------Aluno-----------");
		System.out.println("| Nome = " + a.getNome());
		System.out.println("| CPF = " + a.getCpf());
		System.out.println("| Curso = " + a.getCursos());
		System.out.println("| Endereço: ");
		System.out.println("|  Rua = " + a.getEndereco().getRua());
		System.out.println("|  Número = " + a.getEndereco().getNum());
		System.out.println("|  Bairro = " + a.getEndereco().getBairro());
		System.out.println("|  Cidade = " + a.getEndereco().getCidade());
		System.out.println("|  estado = " + a.getEndereco().getEstado());
		System.out.println("|  CEP = " + a.getEndereco().getCep());
		System.out.println("|---------------------------");			
	}

	System.out.println();	
}




public static void ViewMsgFinal(int op) {
	
	String[] msgFinal = {"Aluno salvo com sucesso!!",
							"Aluno editado com sucesso!!",
							"Aluno deletado com sucesso!!",
							"Fim do Programa!!"};
	
	System.out.println(msgFinal[op]);
}
}
