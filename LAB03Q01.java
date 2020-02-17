/**
* LAB 3 - Questao 1  - Sequencia Espelho
* @author Pedro Henrique Lima Carvalho
* Matricula: 651230
* AED2 - Tarde - Puc Minas
*/
public class LAB03Q01{
	
	/**
	* Metodo main
	*/
	public static void main (String[] args){
		String s = MyIO.readString();	

		while (!isEnd(s)){
			espelho(s);
			s = MyIO.readString();
		}
	}
	

	/**
	* isEnd - Verifica o fim das entradas
	* @param String
	* @return boolean
	*/
	public static boolean isEnd (String s){
		return (s.length()==3 && s.charAt(0)=='F' &&
			s.charAt(1)=='I' && s.charAt(2)=='M');
	}

	/**
	*espelho - mostra a sequencia numerica do intervelo de dois numeros espelhada 
	*@param String
	*/
	public static void espelho (String s){
		String resp = "";
		String[] nums = s.split(" ", 2);
		int ini = Integer.parseInt(nums[0]);
		int fim = Integer.parseInt(nums[1]);
		espelho(ini, fim);
	}

	/**
	*espelho - overload
	*@param int int 
	*/
	public static void espelho (int ini, int fim){
		if (ini <= fim){
			MyIO.print(ini);
			espelho(ini+1, fim);
			MyIO.print(ini);
		}
	}
}

