import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class WordManager {

    String filename="";
    FileReader fr;
    BufferedReader br;
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> usedWords = new ArrayList<String>();
    
    public WordManager() {
        try {
            loadWords();
            shuffle();
        } catch(Exception e) {
            System.out.println("Problems reading file!");
        }
    }
    
    public void loadWords() throws Exception {
        //code to read file into the arraylist...
        //form file name stored in project folder
        String curDir = System.getProperty("user.dir");
        filename = curDir + "/abc.txt";
         
        //create a filereader and buffered file reader
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
         
        //read the lines!
        String line = "";   
        
        while( (line=br.readLine() ) != null)  {
            //do something with the string you just read
            words.add(line);
        }
        
        /* another way
        String line = br.readLine();   // declaration and assignment at the same place
        
        while(line != null)  {
            //do something with the string you just read
            words.add(line);
            line=br.readLine();
        }
        
        */
        
        br.close();
        /*
        //check if WordManager constructor is working
        for(int k=0;k<words.size();k++){
            System.out.println(words.get(k));
        }
        */
    }
    
    public void shuffle(){
        //shuffle arrayList
        //shuffle the values in their slots
        for(int k=0;k<words.size()*20;k++){
            int spot = (int) (Math.random()*words.size());
            String temp = words.get(spot);
            words.remove(spot);
            words.add(temp);
        }
    }
    
    public String getNextWord() {
        //dont get used word
        //check if you run out of words        
        //send slot 0 (first word) 
        //take out words and put in used word
        if(words.isEmpty()==true){
            reset();
        }
        else {
            for(int k=0;k<words.size();k++){
                usedWords.add(words.get(k));
                String temp = words.get(k);
                words.remove(k);
                return(temp);
            }
        }
        return(usedWords.get(0));
    }
    
    public void reset(){
        //put words arraylist back to the full list of words
        for(int k=0;k<usedWords.size();k++){
            words.add(usedWords.get(k));
        }
        usedWords.clear();
        shuffle();
        getNextWord();
    }
}
