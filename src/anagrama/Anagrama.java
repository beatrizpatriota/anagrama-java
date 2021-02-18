package anagrama;
import java.util.*;

public class Anagrama {


	public static void main(String[] listaDePalavras) {
		HashMap<String, List<String>> anagramas = new HashMap<>();
		for (String palavra : listaDePalavras) {
			char[] _chave = palavra.toCharArray();
			Arrays.sort(_chave);
			String chave = new String(_chave);

			List<String> a = anagramas.computeIfAbsent(chave, k -> new LinkedList<String>());
			a.add(palavra);
		}

		if(anagramas.size() != 0) System.out.println("Os anagramas encontrados são: ");

		for(List<String> b : anagramas.values()) {
			if(b.size() <= 1) continue;
			String string = String.join(", ", b);
			System.out.println(string);	
		}
	}
}

