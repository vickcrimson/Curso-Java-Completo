package colections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
 public static void main(String[] args) {
	java.util.Map<Integer, String> usuarios = new HashMap<>();
	
	usuarios.put(1, "roberto");
	usuarios.put(2, "ricardo");
	usuarios.put(3, "Ramiel");
	usuarios.put(4, "Raimunda");
	
	System.out.println(usuarios.size());
	System.out.println(usuarios.isEmpty());
	
	System.out.println(usuarios.keySet());
	System.out.println(usuarios.values());
	System.out.println(usuarios.entrySet());
	
	System.out.println(usuarios.containsKey(20));
	System.out.println(usuarios.containsValue("Ramiel"));
	
	System.out.println(usuarios.get(4));
	
	for(int chave: usuarios.keySet()) {
		System.out.println(chave);
	}
	
	for(String valor: usuarios.values()) {
			System.out.println(valor);
	}
	
	for(Entry<Integer, String> registro : usuarios.entrySet()) {
		System.out.println(registro.getKey());
	}
}
}
