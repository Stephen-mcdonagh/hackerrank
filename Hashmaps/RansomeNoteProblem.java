import java.util.*;
public class RansomeNoteProblem {
    //Randsom note problem
	//Given 2 arrays of strings(Magazine , note), find out if it is possible to create the note from the magazine
	//Example  Magazine[stephen, give, me, money, tomorrow, now,] Note [give , me, money, now ]
	static boolean checkMagazine(String[]magazine, String[] note){
    	//
		Map<String, Integer> magazineWords = new HashMap<>();
		for(String word : magazine){
			if(magazineWords.containsKey(word)){
				int count = magazineWords.get(word);
				count++;
				magazineWords.put(word,count);
			}
		}
		for (String noteWord: note){
			if(magazineWords.containsKey(noteWord)){
				int secondCount = magazineWords.get(noteWord);
				if(secondCount <= 0){
					return false;
				}
				else{
					secondCount--;
					magazineWords.put(noteWord,secondCount);
				}
			}
			else if(!magazineWords.containsKey(noteWord)){
				return false;
			}
		}
		return true;
	}

	//Write some tests here 
	public static void main (String args[])
	{

	}
}