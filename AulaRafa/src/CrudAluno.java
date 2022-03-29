
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import Alunos.Aluno;
import Alunos.Endereco;
import BD.ManipulaTXT.ManipulacaoArquivoTXT;
import Util.ListaDeAlunos;

import BD.ManipulacaoArquivoXML;
import view.mostrar;


public class CrudAluno {
	public static void SalvarAluno(BufferedReader reader) throws IOException, ParserConfigurationException, TransformerException, SAXException  {
		
		Endereco endereco = new Endereco();
		Aluno aluno = new Aluno();
		String[] dadosAluno = mostrar.ViewSalvarAluno(reader);


		aluno.setNome(dadosAluno[0]);




		aluno.setCpf(Integer.parseInt(dadosAluno[1]));


		aluno.setCursos(dadosAluno[2]);


		endereco.setBairro(dadosAluno[5]);


		endereco.setCep(dadosAluno[8]);


		endereco.setCidade(dadosAluno[6]);


		endereco.setEstado(dadosAluno[7]);


		endereco.setNum(dadosAluno[4]);


		endereco.setRua(dadosAluno[3]);

		aluno.setEndereco(endereco);


		ListaDeAlunos.getInstance().add(aluno);
ManipulacaoArquivoTXT.SalvarArquivoTXT();
ManipulacaoArquivoXML.SalvarArquivoXML();
	}

	public static  void listarTxt() throws UnsupportedEncodingException, FileNotFoundException, IOException, ParserConfigurationException, SAXException {
		
		ListaDeAlunos.getInstance().clear();		
		//ManipulacaoArquivoTXT.LerArquivoTXT(listaDeAlunos);		
		ManipulacaoArquivoXML.LerArquivoXML();		
		mostrar.ViewListaDeAlunosEditada();

		
		
	}

	public static void DeletarAluno(BufferedReader reader)throws NumberFormatException, IOException, ParserConfigurationException, SAXException, TransformerException {
		
		int indice = mostrar.ViewMenuEditarOuDeletarAluno("deletar", reader);

		ListaDeAlunos.getInstance().remove(indice);

		ManipulacaoArquivoTXT.SalvarArquivoTXT();
		ManipulacaoArquivoXML.SalvarArquivoXML();


	}

	public static void EditarAluno( BufferedReader reader) throws NumberFormatException, IOException, ParserConfigurationException, SAXException, TransformerException {

		
		int indice = mostrar.ViewMenuEditarOuDeletarAluno("editar", reader);
		Aluno aluno = ListaDeAlunos.getInstance().get(indice);

		Endereco endereco = aluno.getEndereco();

		String[] opcao = mostrar.ViewOpcaoEdicao(reader);
	
		

		switch(Integer.parseInt(opcao[0])) {

		case 1:
			aluno.setNome (opcao[1]);
			break;
		case 2:
			aluno.setCursos(opcao[1]);

			break;

		case 3:
			aluno.setCpf(Integer.parseInt(opcao[1]));
			break;

		case 4:
			endereco.setBairro(opcao[1]);
			break;

		case 5:
			endereco.setCep(opcao[1]);
			break;

		case 6:
			endereco.setCidade(opcao[1]);
			break;
		case 7:
			endereco.setEstado(opcao[1]);
			break;
		case 8:
			endereco.setNum(opcao[1]);
			break;
		case 9:
			endereco.setRua(opcao[1]);
			break;
		}


		ListaDeAlunos.getInstance().set(indice, aluno);
		ManipulacaoArquivoTXT.SalvarArquivoTXT();
ManipulacaoArquivoXML.SalvarArquivoXML();

	}

}
