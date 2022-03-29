package Alunos;

public class Endereco {
private	String bairro;
private	String cep;
private	String  estado;
private	String num;
private String rua;
private String cidade;



public Endereco(String[] Dados) {
	
	String[] rua = Dados[4].split("=");	
	this.rua= rua[1].trim();
	this.num= Dados [5].trim();
	this.bairro=Dados[6].trim();
	this.cidade=Dados[7].trim();
	this.estado=Dados[8].trim();
	this.cep= Dados[9].trim();

}
public Endereco() {
	super();
}


public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}


public String getCep() {
	return cep;
}




public void setCep(String cep) {
	this.cep = cep;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

@Override
public String toString() {
	return ""  + rua + ","+ num + ", " + bairro + ", " + cidade + ",  "+ estado + "," + cep + "";
}






	

}
