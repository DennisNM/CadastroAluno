
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import Alunos.Aluno;

import view.*;
public class App {
	public static int menu;

	public static void main(String[] args) throws NumberFormatException, IOException, ParserConfigurationException, SAXException, TransformerException {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
 menu = 0;

		while(menu != 5) {
			
			menu = mostrar.viewMenuPrincipal(reader);
			
			switch(menu) {
	case 1:
		CrudAluno.SalvarAluno(reader);
		break;	
	case 2:
		CrudAluno.listarTxt();
		break;
	
	case 3:
		CrudAluno.DeletarAluno(reader);
		break;
	
	
	case 4: CrudAluno.EditarAluno(reader);
	break;
	case 5:
		mostrar.ViewMsgFinal(3);
		break;	
		}
	
	
	
		  }
//		for(Aluno a : listaAlunos) lista mostrar memoria ram
//			System.out.println(a);

	 // mostrar lista que foi salva no txt

}
	}
	

