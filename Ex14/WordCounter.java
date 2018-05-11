import java.util.*;
import java.io.*;
import java.util.logging.*;

public class WordCounter{
	public static void main(String[] args){
		String dirname;
		Scanner sin = new Scanner(System.in);

		System.out.print("\nEnter the directory name : ");
		dirname = sin.next();
		File dir = new File(dirname);

		if(dir.isDirectory()){
			File []files = dir.listFiles();
			ArrayList<HashMap<String,Integer>> maps = new 
ArrayList<HashMap<String,Integer>>();
			for(int i = 0; i < files.length; i ++){
				try{
					HashMap<String,Integer> map = new HashMap<String,Integer>();
					Scanner fin = new Scanner(files[i]);
					while(fin.hasNext()){
						String word = fin.next(); //Go through each word
						if(map.containsKey(word)){
							Integer count=map.get(word)+1 ;
							map.put(word,count);
						}
						else
							map.put(word,1);
					
					}
					maps.add(map);
				}
				catch(Exception e){ System.out.println(e); }
							
			}

			HashSet<String> hs = new HashSet<String>();
			for(int j = 0; j < maps.size(); j++){
				HashMap<String,Integer> map1 = maps.get(j);
				Set<String> st = map1.keySet();
				for(String ele:st)
					hs.add(ele);
			}

			System.out.println("\n");
			ArrayList<String> words = new ArrayList<String>();
			for(String ele:hs){
				System.out.print(ele + "\t");
				words.add(ele);
			}

			System.out.println("\n");
				for(int i=0;i<files.length;i++)
          		{
				  HashMap<String,Integer> map1 = maps.get(i);
				  for(int k = 0; k < words.size(); k++)
				  {
					 Integer val=0;
					 if(map1.containsKey(words.get(k)))
					   val=map1.get(words.get(k));
					   System.out.print(val+"\t");
				  }
			 	}
				System.out.println("\n");
			}
		else
			System.out.println("Not a Directory");
	}
}
