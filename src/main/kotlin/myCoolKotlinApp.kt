
class Anagram(val innerMasterWord: String) {
	
	fun match (listOfPossibleAnagrams: List<String>):Set<String>{
		var listOfAnagrams=arrayListOf<String>()
		listOfPossibleAnagrams.forEach { it->
			if(isAnagram(innerMasterWord,it)){
					listOfAnagrams.add(it);
			}		
		}	
		return listOfAnagrams.toSet();
	}
	
	fun isAnagram (first:String,second:String):Boolean{
		
		if(first.length!=second.length){
			return false
		}
		var firstSorted=first.toCharArray().sorted().joinToString("")
		var secondSorted=second.toCharArray().sorted().joinToString("")
		
		for(i in 0..firstSorted.length){
			if(firstSorted[i]!=secondSorted[i]){
				return false
			}			
		}
		return true;
	}
}