public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  String replace = "";

for(int i = 0; i < word.length(); i ++)
{
  if(word.charAt(i) == "A" && word.charAt(i+1) != "A" && i < word.length()-1)
  {
    replace += word.charAt(i + 1) + word.charAt(i);
    i++;
  }
  else
  {
    replace += word.charAt(i);
  }  
}

return replace;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for(int i = wordList.size()-1; i > -1; i--)
 {
    if(wordList.get(i).equals(scrambleWord(wordList.get(i))))
    {
      wordList.remove(i);
    }
    else
    {
      wordList.set(i, scrambleWord(wordList.get(i)));
    }

 }

}
