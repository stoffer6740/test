/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DALFileManager;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Christoffer
 */
public class BLLFileSearchManager {
    
    private static BLLFileSearchManager instance = null;
    
    public static BLLFileSearchManager getInstance() throws FileNotFoundException{
        synchronized (BLLFileSearchManager.class){
            if (instance == null){
                instance = new BLLFileSearchManager();
            }
        }
        return instance;
    }
    
    private ArrayList<String> words;
    public BLLFileSearchManager() throws FileNotFoundException
    {
        DALFileManager fmgr = new DALFileManager();
        words = fmgr.getWords();
    }
    
    public ArrayList<String> getWords() throws SQLException
    {
        return words;
    }
    
//    public ArrayList<String> search (String wordSearch)
//    {
//        ArrayList<String> wordSearched = new ArrayList();
//        for (int i = 0; i < words.hashCode(); i++) {
//            wordSearched.add((words).get(i));
//        }
//        return wordSearched;
//    }

    public ArrayList beginsWith(String text) throws Exception {
        DALFileManager fmgr = new DALFileManager();
        return fmgr.begins(text);
    }
    
     public ArrayList endsWith(String text) throws Exception {
        DALFileManager fmgr = new DALFileManager();
        return fmgr.ends(text);
    }
     
    public ArrayList exactWith(String text) throws Exception {
        DALFileManager fmgr = new DALFileManager();
        return fmgr.exact(text);
    }
          
    public ArrayList containsWith(String text) throws Exception {
        DALFileManager fmgr = new DALFileManager();
        return fmgr.contains(text);
    }
    
}
