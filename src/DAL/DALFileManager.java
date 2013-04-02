/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christoffer
 */
public class DALFileManager {
    private static DALFileManager instance = null;
    
    public static DALFileManager getInstance(){
        synchronized (DALFileManager.class){
            if (instance == null){
                instance = new DALFileManager();
            }
        }
        return instance;
    }
    
    public ArrayList<String> getWords() throws FileNotFoundException
    {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("words.txt"));
        while (sc.hasNextLine())
        {
            words.add(sc.nextLine());
        }
        return words;
    }

    public ArrayList<String> begins(String searchedWord) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        
        ArrayList<String> result = new ArrayList();
        
        while (br.ready()) {
            String word = br.readLine();
            if (word.startsWith(searchedWord)) {
                result.add(word);
            }
        }
        return result;
    }
    
    public ArrayList<String> ends(String searchedWord) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        
        ArrayList<String> result = new ArrayList();
        
        while (br.ready()) {
            String word = br.readLine();
            if (word.endsWith(searchedWord)) {
                result.add(word);
            }
        }
        return result;
    }
    
    public ArrayList<String> exact(String searchedWord) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        
        ArrayList<String> result = new ArrayList();
        
        while (br.ready()) {
            String word = br.readLine();
            if (word.equals(searchedWord)) {
                result.add(word);
            }
        }
        return result;
    }
    
    public ArrayList<String> contains(String searchedWord) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        
        ArrayList<String> result = new ArrayList();
        
        while (br.ready()) {
            String word = br.readLine();
            if (word.contains(searchedWord)) {
                result.add(word);
            }
        }
        return result;
    }

}
