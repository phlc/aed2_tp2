/**
* Classe Personagem
*/
class Personagem {

//atributos
	private String nome;
	private int altura;
	private int peso;
	private String corDoCabelo;
	private String corDaPele;
	private String corDosOlhos;
	private String anoNascimento;
	private int genero;
	private String homeworld;

//construtores
	Personagem(String nome, int altura, int peso, String corDoCabelo,
		   String corDaPele, String corDosOlhos, String anoNascimento,
		   int genero, String homeworld){

		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.corDoCabelo = corDoCabelo;
		this.corDaPele = corDaPele;
		this.corDosOlhos = corDosOlhos;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
		this.homeworld = homeworld;
	}
	

//metodos
 //gets
	/*
	*getNome
	*@return String nome
	*/
	public String getNome(){
		return(this.nome);
	}

	/*
	*getAltura
	*@return int altura
	*/
	public int getAltura(){
		return(this.altura);
	}

	/*
	*getPeso
	*@return int peso
	*/
	public int getPeso(){
		return(this.peso);
	}
	
	/*
	*get corDocabelo
	*@return String corDoCabelo 
	*/
	public String getCorDoCabelo(){
		return(this.corDoCabelo);
	}

	/*
	*getCorDaPele
	*@return String corDaPele
	*/
	public String getCorDaPele(){
		return(this.corDaPele);
	}

	/*
	*getCorDosOlhos
	*@return String corDosOlho
	*/
	public String getCorDosOlhos(){
		return(this.corDosOlhos);
	}

	/*
	*getAnoNascimento
	*@return String anoNascimento
	*/
	public String getAnoNascimento(){
		return(this.anoNascimento);
	}

	/*
	*getGenero
	*@return int genero
	*/
	public int getGenero(){
		return(this.genero);
	}

	/*
	*getHomeworld
	*@return String homeworld
	*/
	public String getHomeworld(){
		return(this.homeworld);
	}

//sets
	/*
	*setNome
	*@param String nome
	*/
	public void setNome(String nome){
		this.nome = nome;
	}	

	/*
	*setAltura
	*@param int altura
	*/
	public void setAlgura(int altura){
		this.altura = altura;
	}

	/*
	*setPeso
	*@param int peso
	*/
	public void setPeso(int peso){
		this.peso = peso;
	}

	/*
	*setCorDoCabelo
	*@param String corDoCabelo
	*/
	public void setCorDoCabelo (String corDoCabelo){
		this.corDoCabelo = corDoCabelo;
	}

	/*
	*setCorDaPele
	*@param String corDaPele
	*/
	public void setCorDaPelo(String corDaPelo){
		this.corDaPele = corDaPele;
	}

	/*
	*setCorDosOlhos
	*@param String corDosOlhos
	*/
	public void setCorDosOlhos(String corDosOlhos){
		this.corDosOlhos = corDosOlhos;
	}

	/*
	*setAnoNascimento
	*@param String anoNascimento
	*/
	public void setAnoNascimento(String anoNascimento){
		this.anoNascimento = anoNascimento;
	}

	/*
	*setGenero
	*@param int genero
	*/
	public void setGenero(int genero){
		this.genero = genero;
	}

	/*
	*setHomeworld
	*@param String homeworld
	*/
	public void setHomeworld(String homeworld){
		this.homeworld = homeworld;
	}

//clone
	/*
	*clone
	*@param Personagem
	*@return Personagem
	*/
	public Personagem clone(Personagem a){
		return (new Personagem(a.nome, a.altura, a.peso, a.corDoCabelo,
			a.corDaPele, a.corDosOlhos, a.anoNascimento, a.genero,
			a.homeworld));
	}

//imprimir
	/*
	*imprimir
	*/
	public void imprimir(){
		MyIO.print(" ## "+this.nome);
		MyIO.print(" ## "+this.altura);
		MyIO.print(" ## "+this.peso);
		MyIO.print(" ## "+this.corDoCabelo);
		MyIO.print(" ## "+this.corDaPele);
		MyIO.print(" ## "+this.corDosOlhos);
		MyIO.print(" ## "+this.anoNascimento);
		MyIO.print(" ## "+this.genero);
		MyIO.print(" ## "+this.homeworld);
		MyIO.println(" ## ");

	}

//ler
	/*
	*ler
	*@return
	*/
	public String ler(){
		return( " ## "+this.nome+" ## "+this.altura+" ## "+this.peso+
		       " ## "+this.corDoCabelo+" ## "+this.corDaPele+" ## "+
		       this.corDosOlhos+" ## "+this.anoNascimento+" ## "+this.genero+
		       " ## "+this.homeworld+" ## ");	
	}

}
