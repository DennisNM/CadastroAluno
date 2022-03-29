package BD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Alunos.Aluno;
import Util.ListaDeAlunos;

public class ManipulaTXT {
	

public static class ManipulacaoArquivoTXT {

	private static String nomeDoArquivo = "CadastroDeAluno.txt";
	
	public static void SalvarArquivoTXT() throws IOException{
		
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(nomeDoArquivo));
				PrintWriter pw = new PrintWriter(buffer)){
			for(Aluno a : ListaDeAlunos.getInstance())
				pw.println(a);
		}
	}
	
	
	
	public static void LerArquivoTXT(){
	
		String line = " ";
	
		try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))){
			
			while((line = reader.readLine()) != null && !"".equals(line)) {
			
					Aluno aluno = new Aluno(line);
					ListaDeAlunos.getInstance().add(aluno);
				
		}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	
}	

	
	

}
}
