import java.io.*;
import java.util.*;
public class ReadPokemonData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//finds text file to read
		InputStream is = new FileInputStream("PokemonData.txt");
		Scanner scan = new Scanner(is);
		List<Pokemon> pokedex = new ArrayList<Pokemon>();
		
		while(scan.hasNext()){
			//pull data from text
			String name = scan.next();
			int numB = scan.nextInt();
			int numPB = scan.nextInt();
			
			//add text data to list
			Pokemon p = new Pokemon(name,numB,numPB);
			pokedex.add(p);
			
		}
		scan.close();
		//display list
		for(Pokemon p: pokedex){
			System.out.println(p);
		}
	}

}
