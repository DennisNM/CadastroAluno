package Hedler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import Alunos.Aluno;
import Alunos.Endereco;
import Util.ListaDeAlunos;

public class XMLHandlerAlunos extends DefaultHandler{
private StringBuilder texto;
Aluno aluno;
Endereco endereco;
//public static List <Aluno> listaDeAlunos = new ArrayList<Aluno>();
	@Override
	public void startDocument() throws SAXException {
	System.out.println("Inicio do documento");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("FIm do documento");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	if(qName.equals("aluno") ) {
		aluno = new Aluno();
		endereco = new Endereco();
		
	}else {
		texto = new StringBuilder();
	}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if(qName.equals("Nome")) {
			aluno.setNome(texto.toString());
		}else if(qName.equals("CPF")) {
			aluno.setCpf(Integer.parseInt(texto.toString()));
		}else if(qName.equals("Curso")) {
			aluno.setCursos(texto.toString());
		}else if(qName.equals("Rua")) {
			endereco.setRua(texto.toString());
		}else if(qName.equals("Numero")) {
			endereco.setNum(texto.toString());			
		}else if(qName.equals("Bairro")) {
			endereco.setBairro(texto.toString());
		}else if(qName.equals("Cidade")) {
			endereco.setCidade(texto.toString());
		}else if(qName.equals("Estado")) {
		endereco.setEstado(texto.toString());
		}else if(qName.equals("CEP")) {
			endereco.setCep(texto.toString());
			
			aluno.setEndereco(endereco);
			ListaDeAlunos.getInstance().add(aluno);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto.append(ch,start,length);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		
	}
	
	

}
